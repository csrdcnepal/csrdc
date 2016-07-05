
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rajan/web-master/conf/routes
// @DATE:Tue Jul 05 14:38:30 NPT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
