package com.myexample.p4;


public class PhoneNumberValidator {
    interface PhoneNumber {
        void validate (String number);
    }


    static class PhoneNumberSNC {

        private String phoneNumber;

        public PhoneNumberSNC() {
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }


    //inner class
    class PhoneNumberIC {

        private String phoneNumber;

        public PhoneNumberIC() {
        }

        public PhoneNumberIC(String number) {
            this.phoneNumber = number;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    public void validatePhoneNumberAIC(String number) {
        //Создание экземляра anonymous inner class
        PhoneNumber phoneNumber = new PhoneNumber() {
            @Override
            public void validate(String number) {
                System.out.println("Validation of " + number);
            }
        };


    }

    public void validatePhoneNumberLIC(String number) {
        
        //local inner class
        class PhoneNumberLIC {
            private String phoneNumber;
            public PhoneNumberLIC() {
                this.phoneNumber = number;
            }
            public String getPhoneNumber() {
                return phoneNumber;
            }
            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }
        }
        PhoneNumberLIC phoneNumberLIC= new PhoneNumberLIC(); //Создание экземляра local inner class
    }
    
    

    public static void main(String[] args) {
        //Создание экземляра inner class
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        PhoneNumberIC phoneNumberIC = phoneNumberValidator.new PhoneNumberIC();

        //Создание экземляра static nested class
        PhoneNumberSNC phoneNumberSNC = new PhoneNumberValidator.PhoneNumberSNC();
    }
}
