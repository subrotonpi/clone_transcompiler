static final int [ ] binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dp = new int [ n ] ;
  dp [ 0 ] = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int c = input . nextInt ( ) ;
    if ( dp [ c ] < c ) dp [ c ] ++ ;
  }
  return dp ;
}
