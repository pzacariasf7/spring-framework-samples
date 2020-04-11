package pe.com.entel.regNomBlancoPIAS.util;

import org.apache.commons.lang.ArrayUtils;

import java.lang.reflect.Field;
import java.util.Date;

public class GenericBean
{
  public String toString()
  {
    StringBuffer result = new StringBuffer();
    result.append(getClass().getSimpleName());
    result.append(" {");
    
    Field[] fields = getClass().getDeclaredFields();
    for (int i = 0; i < fields.length; i++)
    {
      Field field = fields[i];
      try
      {
        result.append(field.getName());
        result.append("[");
        boolean flag = field.isAccessible();
        if (!flag) {
          field.setAccessible(!flag);
        }
        if (field.getType().isArray())
        {
          result.append(ArrayUtils.toString(field.get(this)));
        }
        else
        {
          result.append(field.get(this));
          result.append("]");
          result.append(", ");
        }
        field.setAccessible(flag);
      }
      catch (IllegalAccessException iae)
      {
        iae.printStackTrace();
      }
    }
    result.delete(result.toString().lastIndexOf(", "), result.toString().length());
    result.append("}");
    
    return result.toString();
  }
  
  public String[] toStringArray()
  {
    Field[] fields = getClass().getDeclaredFields();
    String[] values = new String[fields.length];
    
    int valueIndex = 0;
    for (int i = 1; i < fields.length; i++)
    {
      Field field = fields[i];
      try
      {
        boolean flag = field.isAccessible();
        if (!flag) {
          field.setAccessible(!flag);
        }
        if (field.getType().getName().equals(Integer.class.getName())) {
          values[valueIndex] = ((Integer)field.get(this) + "");
        }
        if (field.getType().getName().equals(Long.class.getName())) {
          values[valueIndex] = ((Long)field.get(this) + "");
        }
        if (field.getType().getName().equals(String.class.getName())) {
          values[valueIndex] = ((String)field.get(this));
        }
        if (field.getType().getName().equals(Date.class.getName())) {
          values[valueIndex] = Util.getDate((Date)field.get(this), "dd/MM/yyyy");
        }
        valueIndex++;
      }
      catch (IllegalAccessException iae)
      {
        iae.printStackTrace();
      }
    }
    return values;
  }
}
