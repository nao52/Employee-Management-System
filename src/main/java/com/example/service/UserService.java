package com.example.service;

import java.util.List;

import com.example.domain.MUser;

public interface UserService {

	/** ユーザー登録 */
	public void signup(MUser user);

	/** ユーザー取得 */
	public List<MUser> getUsers();

	/** ユーザー取得 (1件) */
	public MUser getUserOne(String userId);

}
