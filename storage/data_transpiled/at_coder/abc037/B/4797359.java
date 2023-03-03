static int n = Integer . parseInt ( input ) {
  int q = input . nextInt ( ) ;
  int [ ] line = new int [ n ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = input . nextInt ( ) ;
    int r = input . nextInt ( ) ;
    int t = input . nextInt ( ) ;
    for ( int j = l - 1 ;
    j < r ;
    j ++ ) {
      line [ j ] = t ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( line [ i ] ) ;
  }
  return q ;
}
