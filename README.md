# rcmutha-jdbctemplateSample
JDBC Template sample with MySQL as database. Simple way to use JDBC using Spring.

more on jdbc template,

public class JdbcTemplate
extends JdbcAccessor
implements JdbcOperations

This is the central class in the JDBC core package. It simplifies the use of JDBC and helps to avoid common errors. It executes core JDBC workflow, leaving application code to provide SQL and extract results. This class executes SQL queries or updates, initiating iteration over ResultSets and catching JDBC exceptions and translating them to the generic, more informative exception hierarchy defined in the org.springframework.dao package.
Code using this class need only implement callback interfaces, giving them a clearly defined contract. The PreparedStatementCreator callback interface creates a prepared statement given a Connection, providing SQL and any necessary parameters. The ResultSetExtractor interface extracts values from a ResultSet. See also PreparedStatementSetter and RowMapper for two popular alternative callback interfaces.

Can be used within a service implementation via direct instantiation with a DataSource reference, or get prepared in an application context and given to services as bean reference. Note: The DataSource should always be configured as a bean in the application context, in the first case given to the service directly, in the second case to the prepared template.

Because this class is parameterizable by the callback interfaces and the SQLExceptionTranslator interface, there should be no need to subclass it.

All SQL operations performed by this class are logged at debug level, using "org.springframework.jdbc.core.JdbcTemplate" as log category.

NOTE: An instance of this class is thread-safe once configured.
