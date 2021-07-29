package com.ssp.maroqand.assignment3mvc.model.secure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerSignUp {

    @NotNull(message = "name must not be a null")
    @NotEmpty(message = "name must not be an empty")
    @NotBlank(message = "name must not be a blank")
    @Size(min = 3, max =15, message = "name size min is 6 and max is 15")
    public String name;

    @NotNull(message = "county must not be a null")
    @NotEmpty(message = "county must not be an empty")
    @NotBlank(message = "county must not be a blank")
    @Size(min = 2, max =15, message = "county size min is 6 and max is 15")
    public String country;

    @NotNull(message = "address must not be a null")
    @NotEmpty(message = "address must not be an empty")
    @NotBlank(message = "address must not be a blank")
    @Size(min = 6, max =40, message = "address size min is 6 and max is 40")
    public String address;


    @NotNull(message = "phone must not be a null")
    public Integer phone;

    @NotNull(message = "password must not be a null")
    @NotEmpty(message = "password must not be an empty")
    @NotBlank(message = "password must not be a blank")
    @Size(min = 6, max =30, message = "password size min is 6 and max is 30")
    public String password;

}
