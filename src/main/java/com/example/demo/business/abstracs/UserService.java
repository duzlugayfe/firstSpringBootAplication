package com.example.demo.business.abstracs;

import com.example.demo.core.entities.User;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;

public interface UserService {
	Result add(User user);

	DataResult<User> findByEmail(String email);

}
