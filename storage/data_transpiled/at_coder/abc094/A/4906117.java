public static void print ( String a , String b , int x ) {
  x = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  print ( a <= x && x <= a + b ? "YES" : "NO" ) ;
}
