public static void print ( int n , int m ) {
  m = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  System . out . println ( ( m * 1900 + ( n - m ) * 100 ) * ( 2 * * m ) ) ;
}
