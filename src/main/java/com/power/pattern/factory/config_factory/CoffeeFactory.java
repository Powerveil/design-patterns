package com.power.pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName CoffeeFactory
 * @Description TODO(一句话描述该类的功能)
 * @Author Powerveil
 * @Date 2024/5/1 10:58
 * @Version 1.0
 */
public class CoffeeFactory {
    // 加载配置文件，获取配置文件配置的全类名，并常见该类的对象进行存储
    // 1.定一容器对象存储咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    // 2.家在配置文件，只需要加载一次
    static {
        // 2.1 创建Properties 对象
        Properties p = new Properties();
        // 2.2 调用p对象中的Load方法进行配置文件的家在
        InputStream ls =
                CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(ls);
            // 从p集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                // 通过反射计数创建对象
                Class<?> aClass = Class.forName(className);
                Coffee coffee = (Coffee) aClass.newInstance();
                // 将名称和对象存储到容器中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 根据名称获取对象
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
