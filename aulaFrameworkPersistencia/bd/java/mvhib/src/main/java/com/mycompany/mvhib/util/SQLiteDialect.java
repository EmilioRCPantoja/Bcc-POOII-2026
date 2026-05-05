package com.mycompany.mvhib.util;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.identity.IdentityColumnSupport;

public class SQLiteDialect extends Dialect {

    public SQLiteDialect() {
        // Registra os tipos de dados básicos
        registerColumnType(java.sql.Types.BIT, "boolean");
        registerColumnType(java.sql.Types.INTEGER, "integer");
        registerColumnType(java.sql.Types.BIGINT, "bigint");
        registerColumnType(java.sql.Types.VARCHAR, "varchar");
        // Adicione outros tipos se necessário
    }

    @Override
    public boolean hasAlterTable() {
        return false; // SQLite não suporta muitos comandos ALTER TABLE
    }

    @Override
    public boolean dropConstraints() {
        return false;
    }

    @Override
    public String getDropForeignKeyString() {
        return "";
    }

    @Override
    public String getAddForeignKeyConstraintString(String constraintName, String[] foreignKey, String referencedTable, String[] primaryKey, boolean referencesPrimaryKey) {
        return "";
    }
    
 
    @Override
    public boolean supportsOuterJoinForUpdate() {
        return false;
    }

    @Override
    public String getForUpdateString() {
        return ""; 
    }
}