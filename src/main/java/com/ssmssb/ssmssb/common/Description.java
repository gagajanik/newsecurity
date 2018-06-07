package com.ssmssb.ssmssb.common;



import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Objects;


public class Description<T> implements Serializable {
    private boolean valid = Boolean.FALSE;

    private T result;

    private String error;

    private Description() {}

    public static <T> Description<T> valid(T result) {
        Description<T> description = new Description<T>();
        description.setValid(Boolean.TRUE);
        description.setResult(result);
        return description;
    }

    public static <T> Description<T> invalid(String error) {
        Description<T> description = new Description<T>();
        description.setValid(Boolean.FALSE);
        description.setError(error);
        return description;
    }

    public static <T> Description<T> invalid(T result, String error) {
        Description<T> description = new Description<T>();
        description.setValid(Boolean.FALSE);
        description.setResult(result);
        description.setError(error);
        return description;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static class Builder<T> {

        private boolean valid = Boolean.FALSE;
        private T result;
        private String error;

        public Builder() {
        }

        public Builder<T> result(T t) {
            this.valid = Boolean.TRUE;
            this.result = result;
            return this;
        }

        public Builder<T> description(String error) {
            this.error = error;
            return this;
        }

        public Builder<T> valid() {
            this.valid = Boolean.TRUE;
            return this;
        }

        public Description<T> build() {
            Description<T> description = new Description<T>();
            if (Objects.nonNull(this.result)) {
                description.setResult(this.result);
            }
            description.setValid(this.valid);
            if (StringUtils.isNoneBlank(this.error)) {
                description.setError(this.error);
            }
            return description;
        }
    }
}
