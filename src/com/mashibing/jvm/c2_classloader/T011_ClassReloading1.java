package com.mashibing.jvm.c2_classloader;

public class T011_ClassReloading1 {
    public static void main(String[] args) throws Exception {
        //实例化自定义ClassLoader
        T006_MSBClassLoader msbClassLoader = new T006_MSBClassLoader();
        Class clazz = msbClassLoader.loadClass("com.mashibing.jvm.Hello");

        msbClassLoader = null;
        System.out.println(clazz.hashCode());

        msbClassLoader = null;

        //再次实例化自定义ClassLoader
        msbClassLoader = new T006_MSBClassLoader();
        Class clazz1 = msbClassLoader.loadClass("com.mashibing.jvm.Hello");
        System.out.println(clazz1.hashCode());
        System.out.println(clazz == clazz1);

        //创建另一个自定义CLassLoader1并实例化
        T006_MSBClassLoader1 t006_msbClassLoader1 = new T006_MSBClassLoader1();
        Class<?> clazz2 = t006_msbClassLoader1.loadClass("com.mashibing.jvm.Hello");
        System.out.println(clazz ==clazz2);
    }
}
//1846274136
//1846274136
//true
//true