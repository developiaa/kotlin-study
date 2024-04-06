package advanced

import kotlin.test.Test

class 스코프함수 {
    @Test
    fun main() {
        val str: String? = "hi"

        val result: Int? = str?.let {
            println(it)

            // 스코프 함수가 중첩되는 경우 가독성을 해칠수 있음
//            val abc: String? = "abc"
//            abc?.let{
//                val def: String? = "def"
//                def?.let {
//                    println("abcdef가 null이 아님")
//                }
//            }

            val abc: String? = "abc"
            val def: String? = "def"
            // 위의 주석과 같음
            if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
                println("abcdef가 null이 아님")
            }

            //마지막 코드가 자동으로 리턴
            1234
        }
        println(result)
    }


    @Test
    fun test2() {
        val config = DatabaseClient()
        config.url = "localhost:3306"
        config.username = "mysql"
        config.password = "1234"
        val connected = config.connect()
        println(connected)
    }

    @Test
    fun test2_equal() {
        val connected: Boolean = DatabaseClient().run {
            url = "localhost:3306"
            username = "mysql"
            password = "1234"
            connect()
        }
        println(connected)
    }

    @Test
    fun test2_let() {
        val connected: Boolean = DatabaseClient().let {
            it.url = "localhost:3306"
            it.username = "mysql"
            it.password = "1234"
            it.connect()
        }
        println(connected)
    }

    @Test
    fun test2_with() {
        val connected: Boolean = with(DatabaseClient()) {
            url = "localhost:3306"
            username = "mysql"
            password = "1234"
            connect()
        }
        println(connected)
    }

    @Test
    fun test3() {
        val str = "안녕하세요"
        with(str) {
            println("length = ${length}")
        }

        val length: Int = with(str) {
            length
        }
        println(length)
    }

    @Test
    fun test4() {
        val client: DatabaseClient = DatabaseClient().apply {
            url = "localhost:3306"
            username = "mysql"
            password = "1234"
            // run과 다른점은 리턴값이 컨텍스트다
        }
        println(client)

        val connected = client.connect()
        println(connected)
    }

    @Test
    fun test5() {
        val user: User = User(name = "aa", password = "1234")
        user.validate()

        //위와 같다.
        User(name = "aa", password = "1234").also {
            // 부수작업 수행
            it.validate()
            it.printName()
        }
    }
}

class DatabaseClient {
    var url: String? = null
    var username: String? = null
    var password: String? = null

    fun connect(): Boolean {
        println("DB 접속중..")
        Thread.sleep(1000)
        println("DB 접속 완료")
        return true
    }
}

class User(val name: String, val password: String) {
    fun validate() {
        if (name.isNotEmpty() && password.isNotEmpty()) {
            println("검증 성공")
        } else {
            println("검증 실패")
        }
    }

    fun printName() = println(name)
}
