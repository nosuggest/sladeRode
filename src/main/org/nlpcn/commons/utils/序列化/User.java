package main.org.nlpcn.commons.utils.序列化;

import java.io.Serializable;

public class User implements Serializable {//该接口是一个可序列化的
                                            //该接口是标志性的接口，没有任何方法；
                                            //这样的接口还有：java.lang.Cloneable
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
