public static int n ( ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - i + 1 ;
    j ++ ) {
      if ( 10000 * i + 5000 * j + 1000 * ( n - i - j ) == y ) {
        System . out . println ( i + j + " " + j ) ;
        exit ( ) ;
      }
    }
  }
  a = - 1 ;
  return a ;
}
