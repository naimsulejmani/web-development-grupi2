package dev.naimsulejmani.webdevelopmentgrupi2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyInfo {
    private String name;
    private String address;
    private String phone;
}
