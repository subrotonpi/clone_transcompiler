static int n = Integer . parseInt ( input ) {
  int q = input . nextInt ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = input . nextInt ( ) ;
    int r = input . nextInt ( ) ;
    int t = input . nextInt ( ) ;
    a [ l - 1 ] = new int [ r - l + 1 ] ;
    for ( int j = 0 ;
    j < r ;
    j ++ ) {
      a [ l ] [ j ] = t ;
    }
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( a [ i ] ) ;
  }
  return a [ 0 ] ;
}
