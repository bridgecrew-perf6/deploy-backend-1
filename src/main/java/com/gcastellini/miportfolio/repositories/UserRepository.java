package com.gcastellini.miportfolio.repositories;

import com.gcastellini.miportfolio.models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <ApplicationUser,Long>{
  ApplicationUser findByUsername (String Username);
}
