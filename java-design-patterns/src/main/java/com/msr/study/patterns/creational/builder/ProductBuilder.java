package com.msr.study.patterns.creational.builder;

import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 18:12
 * @version: v1.0
 */
@ToString
public class ProductBuilder {

    String id;
    String name;
    String password;
    String phone;


    private ProductBuilder(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.password = builder.password;
        this.phone = builder.phone;
    }

    public static final class Builder {
        private String id;
        private String name;
        private String password;
        private String phone;

        public Builder(){}

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder password(String val) {
            password = val;
            return this;
        }

        public Builder phone(String val) {
            phone = val;
            return this;
        }

        public ProductBuilder build() {
            return new ProductBuilder(this);
        }
    }

}
