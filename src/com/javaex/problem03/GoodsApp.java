package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		System.out.println("상품 3개를 입력해주세요.");

		Scanner scan = new Scanner(System.in);

		List<Goods> goodslist = new ArrayList<>(); // goodslist라는 객체컬렉션 생성해둠

		int total = 0;

		for (int i = 0; i < 3; i++) {
			String product_info = scan.nextLine(); // 정보받기
			String[] productInfo = product_info.split(" ");
			Goods goods = new Goods(); // 객체생성
			goods.setName(productInfo[0]); // 이름
			goods.setPrice(Integer.parseInt(productInfo[1])); // 가격
			goods.setCount(Integer.parseInt(productInfo[2])); // 수량 저장해줌
			goodslist.add(goods);
			total += goods.getCount();
		}

		for (Goods g : goodslist) {
			g.gInfo();
		}

		System.out.println("모든 상품의 갯수는 " + total + "개 입니다.");

	}

}
