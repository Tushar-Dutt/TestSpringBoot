package com.user.management.config;

import org.hibernate.dialect.H2Dialect;

public class SQLiteDialect extends H2Dialect {
    public SQLiteDialect() {
        super();
    }

    @Override
    public boolean supportsCommentOn() {
        return false;
    }

    @Override
    public boolean supportsIfExistsBeforeTableName() {
        return true;
    }
}
