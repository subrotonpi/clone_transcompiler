public static void print ( int a , int d ) {
  a = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  System . out . println ( max ( ( a + 1 ) * d , a * ( d + 1 ) ) ) ;
}
