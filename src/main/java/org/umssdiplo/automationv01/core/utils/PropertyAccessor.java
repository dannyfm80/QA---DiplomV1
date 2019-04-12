package org.umssdiplo.automationv01.core.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyAccessor {
    private static final String BROWSER = "browser";
    private static final String BASE_URL = "baseurl";
    private static final String USER_NAME = "username";
    private static final String PASSWORD = "password";
    //    ***************************
    private static final String BASE_URL2 = "baseurl2";
    //***********************************************
    private static final String NOMBRE = "nombre";
    private static final String MODELO = "modelo";
    private static final String ESTADO = "estado";
    private static final String CANTIDAD = "cantidad";

    private static PropertyAccessor PropertyAccessor;
    private Properties properties;

    private PropertyAccessor() {
        try (FileInputStream fileInputStream = new FileInputStream("gradle.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException fe) {
            throw new RuntimeException(fe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PropertyAccessor getInstance() {
        if (PropertyAccessor == null) {
            PropertyAccessor = new PropertyAccessor();
        }
        return PropertyAccessor;
    }

    public int getImplicitTimeWait() {
        return Integer.parseInt(getDataProperty("implicitTimeWait"));
    }

    private String getDataProperty(String nameProperty) {
        String property = System.getProperty(nameProperty);
        if (property == null) {
            return properties.getProperty(nameProperty);
        }
        return property;
    }

    public int getExplicitTimeWait() {
        return Integer.parseInt(getDataProperty("explicitTimeWait"));
    }

    public String getBrowser() {
        return getDataProperty(BROWSER);
    }

    public String getBaseUrl() {
        return getDataProperty(BASE_URL);
    }

    public String getBaseUrl2() {
        return getDataProperty(BASE_URL2);
    }

    public String getUser() {
        return getDataProperty(USER_NAME);
    }

    public String getPassword() {
        return getDataProperty(PASSWORD);
    }

    //        public String getPassword() {
//        return getDataProperty(PASSWORD);
//    }
    public String getNombre() {
        return getDataProperty(NOMBRE);
    }

    public String getModelo() {
        return getDataProperty(MODELO);
    }

    public String getEstado() {
        return getDataProperty(ESTADO);
    }

    public String getCantidad() {
        return getDataProperty(CANTIDAD);
    }


}
