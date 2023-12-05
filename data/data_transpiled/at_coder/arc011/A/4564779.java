public static void print ( int m , int n , int d ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  while ( d >= m ) {
    c += d / m * n ;
    d = n * ( d / m ) + d % m ;
  }
  System . out . println ( c ) ;
}
