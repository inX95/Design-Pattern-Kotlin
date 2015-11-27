import java.util.*

/**
 * Created by brandon on 15-11-27.
 * 享元模式（Flyweight）
 */
class ConnectionPool private constructor() {
    var pool: Vector<Connection>
    var url = "jdbc:mysql://localhost:3306/test"
    var username = "brandon"
    var password = "large_elephant"
    var driveClassName = "com.mysql.jdbc.Driver"
    var poolSize = 100
    var conn: Connection? = null

    companion object {
        var INSTANCE: ConnectionPool ? = null
    }

    init {
        pool = Vector(poolSize)
        for (i in 0..poolSize) {
            Class.forName(driveClassName)
            conn = Drivermanager.getConnection(url, username, password)
            pool.add(conn)
        }
    }

    @Synchronized fun getConnection(): Connection? {
        if (pool.size > 0) {
            var conn = pool.get(0)
            pool.remove(conn)
            return conn
        } else return null
    }

    object Drivermanager {
        fun getConnection(url: String, usrname: String, paasword: String): Connection {
            return Connection()
        }
    }

}

class Connection {


}