public static void print ( int a , int b ) {
  a = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  System . out . println ( max ( a + b , a - b , a * b ) ) ;
}
