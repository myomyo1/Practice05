package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		List<Friend> friendList = new ArrayList<>(); // arraylist 만들고 안에 3개 담을 수 있음
		Scanner scan = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요.");

		for (int i = 0; i < 3; i++) {
			String friendInfo = scan.nextLine(); // 정보입력받고
			String[] friend_info = friendInfo.split(" "); // 공백으로 나누고
			Friend friend = new Friend(); // 객체생성
			friend.setName(friend_info[0]); // 정보입력
			friend.setHp(friend_info[1]);
			friend.setSchool(friend_info[2]);
			friendList.add(friend);
		}

		for (Friend fr : friendList) {
			fr.showInfo();
		}

		scan.close();

	}

}
