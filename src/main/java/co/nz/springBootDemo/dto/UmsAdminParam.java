package co.nz.springBootDemo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * Admin user model map to table ums_admin in DB
 * Created by jack on 2018/4/26.
 */
@Getter
@Setter
public class UmsAdminParam {
    @NotEmpty
    @ApiModelProperty(value = "User Name", required = true)
    private String username;
    @NotEmpty
    @ApiModelProperty(value = "Password", required = true)
    private String password;
    @ApiModelProperty(value = "user icon")
    private String icon;
    @Email
    @ApiModelProperty(value = "Mail")
    private String email;
    @ApiModelProperty(value = "NickName")
    private String nickName;
    @ApiModelProperty(value = "Notes")
    private String note;
}
