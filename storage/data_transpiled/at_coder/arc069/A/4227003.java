public static void print ( int n , int m ) {
  int k = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  k = min ( m / 2 , ( n + m / 2 ) / 2 ) ;
  print ( k ) ;
}
