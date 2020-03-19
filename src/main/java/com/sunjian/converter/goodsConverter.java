package com.sunjian.converter;

import com.sunjian.entity.Goods;
import org.springframework.core.convert.converter.Converter;

/**
 * @author sunjian
 * @date 2020/3/18 10:20
 */
public class goodsConverter implements Converter<String, Goods> {

    @Override
    public Goods convert(String s) {
        Goods goods = new Goods();
        String values[] = s.split(",");
        if (values.length == 3 && values != null) {
            goods.setId(Integer.parseInt(values[0]));
            goods.setName(values[1]);
            goods.setPrice(Double.parseDouble(values[2]));
        } else {
            System.out.println((String.format("参数格式错误，需要格式[%s],但格式是[%s] ", "1,水杯,108.5 ", s)));
        }
        return goods;
    }
}
