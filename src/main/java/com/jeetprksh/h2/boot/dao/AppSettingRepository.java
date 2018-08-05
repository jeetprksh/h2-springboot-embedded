package com.jeetprksh.h2.boot.dao;

import com.jeetprksh.h2.boot.entity.ApplicationSetting;
import org.springframework.data.repository.CrudRepository;

public interface AppSettingRepository extends CrudRepository<ApplicationSetting, Integer> {
}
