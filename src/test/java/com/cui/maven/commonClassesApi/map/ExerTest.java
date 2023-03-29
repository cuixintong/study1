package com.cui.maven.commonClassesApi.map;

import org.junit.Test;

import java.util.*;

public class ExerTest {

    @Test
    public void test(){
        Set set = CityMap.model.keySet();
        for (Object o : set) {
            System.out.print(o + "\t \t");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        while (true) {
            System.out.print("请选择你所在的省份：");

            String pro = scanner.next();

            if (set.contains(pro)){

                String[] pros = (String[]) CityMap.model.get(pro);

                for (int i = 0; i < pros.length; i++) {
                    System.out.print(pros[i] + "\t \t");
                }

                System.out.println();
                System.out.print("请选择你所在的城市：");

                String city = scanner.next();

                if (pros.equals(city))
                System.out.println(city);
            }else break;
        }


        System.out.println("信息登记完毕");



    }



}

class CityMap{

    public static Map model = new HashMap();

    static {
        model.put("北京",new String[]{"北京"});
        model.put("山西",new String[]{"太原","晋中","晋城","吕梁","运城","大同"});
        model.put("吉林",new String[]{"长春","延边","吉林","白山","白城","四平"});
        model.put("河北",new String[]{"承德","石家庄","邯郸","邢台","保定","唐山"});
    }


}
