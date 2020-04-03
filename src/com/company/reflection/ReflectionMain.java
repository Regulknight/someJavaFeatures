package com.company.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lobachev.nikolay
 */
public class ReflectionMain {
    public static void main(String[] args) {
        Person person = new Person();

        Class<Person> reflectionClass = Person.class;
        for(Field field: reflectionClass.getFields()){
            System.out.println(field.getName());
        }

        try {
            Field age = reflectionClass.getDeclaredField("age");
            age.setAccessible(true);
            age.setInt(person, 23);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        try {
            reflectionClass.getField("name").set(person, "Peter");
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        try {
            Method getGreetings = reflectionClass.getDeclaredMethod("getGreetings");
            getGreetings.setAccessible(true);
            System.out.println(getGreetings.invoke(person));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Person dynamicPersonCreation = reflectionClass.newInstance();
            dynamicPersonCreation.setName("John");
            dynamicPersonCreation.setAge(10);
            System.out.println(dynamicPersonCreation);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
