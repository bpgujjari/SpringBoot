package com.bp2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
@Bean("id1")
public  ProductBean getMargin()
{
	Scanner sc=new Scanner(System.in);
	
	MarginBean mb1=new MarginBean();
	System.out.println("enter margin id");
	int id=sc.nextInt();
	System.out.println("enter margin code");
	String code=sc.next();
	
	mb1.setMarginId(id);
	mb1.setMarginCode(code);
	
	
	

	ModelBean mb2=new ModelBean();
	System.out.println("enter model id");
	int id1=sc.nextInt();
	System.out.println("enter model code");
	String code1=sc.next();
	System.out.println("enter model cost");
	double cost=sc.nextDouble();
	
	mb2.setModelId(id1);
	mb2.setModelCode(code1);
	mb2.setModelCost(cost);
	Map<Integer, MarginBean>map=new HashMap<Integer,MarginBean>();
	map.put(1, mb1);
	mb2.setMarginObjs(map);
	
	
	ProductBean p=new ProductBean();
	System.out.println("enter product id");
	int pid=sc.nextInt();
	System.out.println("enter product name");
	String pname=sc.next();
	
	p.setProductId(pid);
	p.setProductName(pname);

	List<ModelBean>list = new ArrayList<>();
	list.add(mb2);
	p.setModelObjs(list);
	
return p;
}

}
