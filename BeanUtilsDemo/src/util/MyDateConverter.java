package util;

import org.apache.commons.beanutils.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateConverter implements Converter {
    @Override
    public Object convert(Class aClass, Object o) {
        String strObject = (String) o;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(strObject);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
