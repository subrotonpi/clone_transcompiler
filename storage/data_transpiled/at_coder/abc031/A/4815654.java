public static void print ( int a , int d ) {
  int ans = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  ans = max ( ( a + 1 ) * d , ( d + 1 ) * a ) ;
  System . out . println ( ans ) ;
}
