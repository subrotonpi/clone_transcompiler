public static void print ( int a , int b , int c ) {
  a = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  c = min ( [ a + b + 1 ] , c ) ;
  System . out . println ( b + c ) ;
}
