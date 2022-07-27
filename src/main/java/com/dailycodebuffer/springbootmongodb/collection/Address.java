package com.dailycodebuffer.springbootmongodb.collection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String address1;
    private String address2;
    private String city;
}
