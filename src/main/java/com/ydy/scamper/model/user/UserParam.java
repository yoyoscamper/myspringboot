package com.ydy.scamper.model.user;

import com.ydy.scamper.common.GroupsAction;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * Created by yoyo on 2019/7/24.
 */

@Getter
@Setter
public class UserParam {


    @NotBlank(message ="主键不能为空")
    private String id;

    @NotBlank(message ="用户名不能为空",groups = {GroupsAction.CreateAction.class})
    private String username;

    @NotBlank(message ="密码不能为空",groups = {GroupsAction.CreateAction.class})
    private String password;

    private String email;

    @NotBlank(message ="状态不能为空",groups = {GroupsAction.CreateAction.class})
    private String recordStatus;

    @NotBlank(message ="手机号码不能为空",groups = {GroupsAction.CreateAction.class})
    private String mobile;
}
