package co.nz.springBootDemo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * user logon para
 * Created by jack on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsAdminLoginParam {
    @NotEmpty
    @ApiModelProperty(value = "User Name",required = true)
    private String username;
    @NotEmpty
    @ApiModelProperty(value = "Password",required = true)
    private String password;
}
