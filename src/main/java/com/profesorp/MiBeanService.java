package com.profesorp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class MiBeanService {
	private static  List<MiBean> miBeans = new ArrayList<>();

	static {
		miBeans.add(new MiBean(1, "valor uno"));
		miBeans.add(new MiBean(2, "valor dos"));
		miBeans.add(new MiBean(3, "valor tres"));
	}
	
	public MiBean getBean(int id) {
		MiBean miBean =
				miBeans.stream()
				 .filter(t -> t.getCodigo()==id)
				 .findFirst()
				 .get();
				
		return miBean;
	}

}
