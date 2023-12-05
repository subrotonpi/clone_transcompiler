public static void a ( ) {
  double a = Integer . parseInt ( input . readLine ( ) ) ;
  double b = Integer . parseInt ( input . readLine ( ) ) ;
  double c = Integer . parseInt ( input . readLine ( ) ) ;
  double d = Integer . parseInt ( input . readLine ( ) ) ;
  double x = b / a ;
  double y = d / c ;
  System . out . println ( x > y ? "TAKAHASHI" : x == y ? "DRAW" : "AOKI" ) ;
}
