package com.mj.around.hub.common;

public class Constatnts {

    public enum ExceptionClass {

        PRODUCT("Product"),ORDER("Order"),PROVIDER("Provider");

        private final String exceptionClass;

        ExceptionClass(String exceptionClass) {
            this.exceptionClass = exceptionClass;
        }

        public String getExceptionClass() {
            return exceptionClass;
        }

        @Override
        public String toString() {
            return getExceptionClass() + "Exception. ";
        }
    }
}
