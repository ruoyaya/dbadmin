package com.yikeo.dbadmin.modules.database.enums;

public enum JdbcDriverEnum {
    JNDIDataSource("JNDI Data Source", "javax.naming.InitialContext", "java:comp/env/jdbc/Test", "sa"),
    Teradata("Teradata", "com.teradata.jdbc.TeraDriver", "jdbc:teradata://whomooz/", ""),
    Snowflake("Snowflake", "com.snowflake.client.jdbc.SnowflakeDriver", "jdbc:snowflake://accountName.snowflakecomputing.com", ""),
    Redshift("Redshift", "com.amazon.redshift.jdbc42.Driver", "jdbc:redshift://endpoint:5439/database", ""),
    Impala("Impala", "org.cloudera.impala.jdbc41.Driver", "jdbc:impala://clustername:21050/default", ""),
    Hive2("Hive 2", "org.apache.hive.jdbc.HiveDriver", "jdbc:hive2://clustername:10000/default", ""),
    Hive("Hive", "org.apache.hadoop.hive.jdbc.HiveDriver", "jdbc:hive://clustername:10000/default", ""),
    AzureSQL("Azure SQL", "com.microsoft.sqlserver.jdbc.SQLServerDriver", "jdbc:sqlserver://name.database.windows.net:1433", ""),
    FirebirdServer("Firebird Server", "org.firebirdsql.jdbc.FBDriver", "jdbc:firebirdsql:localhost:c:/temp/firebird/test", "sysdba"),
    SQLite("SQLite", "org.sqlite.JDBC", "jdbc:sqlite:test", "sa"),
    DB2("DB2", "com.ibm.db2.jcc.DB2Driver", "jdbc:db2://localhost/test", ""),
    Oracle("Oracle", "oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@localhost:1521:XE", "sa"),
    MSSQLServer2000("MS SQL Server 2000", "com.microsoft.jdbc.sqlserver.SQLServerDriver", "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=sqlexpress", "sa"),
    MSSQLServer2005("MS SQL Server 2005", "com.microsoft.sqlserver.jdbc.SQLServerDriver", "jdbc:sqlserver://localhost;DatabaseName=test", "sa"),
    PostgreSQL("PostgreSQL", "org.postgresql.Driver", "jdbc:postgresql:test", ""),
    MySQL("MySQL", "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/test", ""),
    MySQL8("MySQL8", "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/test", ""),
    HSQLDB("HSQLDB", "org.hsqldb.jdbcDriver", "jdbc:hsqldb:test;hsqldb.default_table_type=cached", "sa"),
    DerbyServer("Derby (Server)", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/test;create=true", "sa"),
    DerbyEmbedded("Derby (Embedded)", "org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby:test;create=true", "sa"),
    H2Server("H2 (Server)", "org.h2.Driver", "jdbc:h2:tcp://localhost/~/test", "sa"),
    H2Embedded("H2 (Embedded)", "org.h2.Driver", "jdbc:h2:~/test", "sa");

    private String title;
    private String driverClassName;
    private String url;
    private String username;

    JdbcDriverEnum(String title, String driverClassName, String url, String username) {
        this.title = title;
        this.driverClassName = driverClassName;
        this.url = url;
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
