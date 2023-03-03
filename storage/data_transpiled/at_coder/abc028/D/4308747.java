public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  return ( ( 1 + 3 * ( n - 1 ) + 6 * ( k - 1 ) * ( n - k ) ) / ( n * n * n ) ) ;
}
