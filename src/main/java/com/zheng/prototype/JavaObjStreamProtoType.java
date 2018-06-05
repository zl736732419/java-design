package com.zheng.prototype;

import com.google.common.collect.Lists;

import java.io.*;
import java.util.List;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class JavaObjStreamProtoType implements Cloneable, Serializable {
    private String name;
    private List<String> lists = Lists.newArrayList();


    @Override
    protected Object clone() {
        ObjectOutputStream objOutput = null;
        ObjectInputStream objInput = null;

        try {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            objOutput = new ObjectOutputStream(output);
            objOutput.writeObject(this);

            ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());
            objInput = new ObjectInputStream(input);

            JavaObjStreamProtoType clone = (JavaObjStreamProtoType) objInput.readObject();

            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                objOutput.close();
                objInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }
}
