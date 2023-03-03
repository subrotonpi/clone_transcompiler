public static void print ( int q , int h , int s , int d , int n ) throws IOException {
  int m , n = Integer . parseInt ( readLine ( ) . split ( " " ) [ 0 ] ) ;
  q *= 4 ;
  h *= 2 ;
  m = Math . min ( q , h , s ) ;
  if ( m < d / 2 ) {
    System . out . println ( n * m ) ;
  }
  else {
    System . out . println ( n / 2 * d + m * ( n % 2 == 1 ) ) ;
  }
}
