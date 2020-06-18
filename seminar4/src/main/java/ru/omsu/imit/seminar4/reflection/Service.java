package ru.omsu.imit.seminar4.reflection;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service {
    public static List<String> getInfo(List<Base> objects) {
        List<String> stringList = new ArrayList<>();
        for (Base iBase : objects) {
            if (iBase instanceof Derived) {
                String string = iBase.getDescription() + ", " + ((Derived) iBase).getAdditionalDescription();
                stringList.add(string);
            } else stringList.add(iBase.getDescription());
        }
        return stringList;
    }

    public static boolean isObjectFunctionalInterface(Class<?> object) {
        int count = 0;
        if (object.isInterface()) {
            for (Method method : object.getMethods()){
                if (Modifier.isPublic(method.getModifiers()) && Modifier.isAbstract(method.getModifiers())){
                    count++;
                }
            }
        }
        return count == 1;
//        if (object.isInterface() && Modifier.isPublic(object.getModifiers()) &&
//                Modifier.isAbstract(object.getModifiers())){
//
//        }
//        return object.isInterface() && Modifier.isPublic(object.getModifiers()) &&
//                Modifier.isAbstract(object.getModifiers());
    }

    public  static boolean checkImplementsMethodSerializable(Object object) {
        Class<?>[] interfaces = object.getClass().getInterfaces();
        for (Class<?> iClass : interfaces) {
            if (iClass == Serializable.class) {
                System.out.println(iClass.getName());
                return true;
            }
        }
        return false;
    }

    public static boolean hasObjectImplementedSerializableInterface(Object object) {
//        List<Class<?>> classes = new ArrayList<>();
//        Class<?> superclass = object.getClass().getSuperclass();
//        classes.add(object.getClass());
//        do {
//            classes.add(superclass);
//            superclass = superclass.getSuperclass();
//        } while (superclass != null);
//
//        for (Class<?> cClass : classes) {
//            Class<?>[] interfaces = cClass.getInterfaces();
//            for (Class<?> iClass : interfaces) {
//                if (iClass.getName().equals(Serializable.class.getName()) || checkImplementsMethodSerializable(cClass)) {
//                    return true;
//                }
//            }
//
//        }
//        return false;
        return object instanceof Serializable;
    }

    public static List<String> metadataClassesListWithAtLeastOneStaticMethod(List<Class<?>> classList) {
        List<String> stringList = new ArrayList<>();
        for (Class<?> iClassList : classList) {
            Method[] methods = iClassList.getMethods();
            for (Method method : methods) {
                if (Modifier.isStatic(method.getModifiers())) {
                    stringList.add(iClassList.getCanonicalName());
                    break;
                }
            }
        }
        return stringList;
    }
}
