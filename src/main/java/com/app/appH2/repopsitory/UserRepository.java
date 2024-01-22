package com.app.appH2.repopsitory;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.appH2.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
