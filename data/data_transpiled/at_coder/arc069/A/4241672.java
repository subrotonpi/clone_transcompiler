public static void print ( int n , int m ) {
  m = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  System . out . println ( n + ( m / 2 - n ) / 2 > m / 2 ? n : m / 2 ) ;
}
