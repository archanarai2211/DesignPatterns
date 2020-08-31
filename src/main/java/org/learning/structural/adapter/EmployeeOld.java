package org.learning.structural.adapter;

public class EmployeeOld {


        private String cn;
        private String age;
        private String mobile;

        EmployeeOld(String cn, String age, String mobile) {
        this.cn = cn;
        this.age = age;
        this.mobile = mobile;
    }

        public String getCn() {
        return cn;
    }

        public String getAge() {
        return age;
    }

        public String getMobile() {
        return mobile;
    }


}
