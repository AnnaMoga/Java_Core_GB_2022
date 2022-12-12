package lesson_4.task2;

import java.util.HashMap;


public class PhoneTable {

    private HashMap<String,String> stringStringHashMap = new HashMap<>();

    public void add(String phone, String name){
        stringStringHashMap.put(phone,name);
    }

    public String getPhoneByName(String name){
        if(stringStringHashMap.containsValue(name)){
            String result = "Номер телефона: ";
            for(String key: stringStringHashMap.keySet()){
                if(stringStringHashMap.get(key).equals(name)) result += key + "; ";
            }
            return result;
        } else return "Такого номера нет, попробуйте ещё раз";

    }
}
