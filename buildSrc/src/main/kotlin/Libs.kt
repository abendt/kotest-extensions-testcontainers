object Libs {

   const val kotlinVersion = "1.6.10"
   const val org = "io.kotest.extensions"

   object Kotest {
      private const val version = "5.2.3"
      const val Junit5 = "io.kotest:kotest-runner-junit5-jvm:$version"
      const val Assertions = "io.kotest:kotest-assertions-core:$version"
      const val Api = "io.kotest:kotest-framework-api:$version"
   }

   object TestContainers {
      private const val version = "1.17.0"
      const val testcontainers = "org.testcontainers:testcontainers:$version"
      const val jdbc = "org.testcontainers:jdbc:$version"
      const val kafka = "org.testcontainers:kafka:$version"
      const val mysql = "org.testcontainers:mysql:$version"
   }

   object Hikari {
      private const val version = "4.0.3"
      val cp = "com.zaxxer:HikariCP:$version"
   }

   object Coroutines {
      private const val version = "1.6.1"
      const val coreCommon = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
      const val coreJvm = "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:$version"
   }
}
