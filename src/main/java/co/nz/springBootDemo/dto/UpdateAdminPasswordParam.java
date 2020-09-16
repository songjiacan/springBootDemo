package co.nz.springBootDemo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * Update user password para
 * Created by jack on 2019/10/9.
 */
@Getter
@Setter
public class UpdateAdminPasswordParam {
    @NotEmpty
    @ApiModelProperty(value = "User Name", required = true)
    private String username;
    @NotEmpty
    @ApiModelProperty(value = "Old Password", required = true)
    private String oldPassword;
    @NotEmpty
    @ApiModelProperty(value = "New Password", required = true)
    private String newPassword;
}
