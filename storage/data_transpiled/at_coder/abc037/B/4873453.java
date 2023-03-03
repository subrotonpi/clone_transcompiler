static int n ( Scanner input ) {
  int q = input . nextInt ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = input . nextInt ( ) ;
    int r = input . nextInt ( ) ;
    for ( int x = l - 1 ;
    x < r ;
    x ++ ) {
      a [ x ] = t ;
    }
  }
  return a [ 0 ] ;
}
