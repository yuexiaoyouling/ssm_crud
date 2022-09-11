package com.atMrChen.converter;

import com.atMrChen.pojo.Msg;

import com.google.gson.Gson;

import org.springframework.core.convert.converter.Converter;



/**
 * Spring到List<Integer>的转换器
 * @author OneIce
 * @since 2021/3/28 20:19
 */
public class MsgToJsonObjectConverter implements Converter<Msg, String> {


    @Override
    public String convert(Msg source) {
        Gson gson = new Gson();


        return gson.toJson(source);
    }
}