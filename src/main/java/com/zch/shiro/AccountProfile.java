package com.zch.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Jimmy on 2022/1/24
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
}
