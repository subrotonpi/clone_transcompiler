static final int [ ] [ ] solve ( Scanner input ) {
  final int MOD = 10007 ;
  int [ ] [ ] rocks = new int [ R ] [ 2 ] ;
  int H = input . nextInt ( ) ;
  int W = input . nextInt ( ) ;
  rocks [ 0 ] [ 0 ] = rocks [ 0 ] [ 0 ] ;
  rocks [ 0 ] [ 1 ] = rocks [ 0 ] [ 1 ] ;
  rocks [ 1 ] [ 2 ] = rocks [ 0 ] [ 2 ] ;
  int [ ] [ ] s = new int [ R ] [ 1 ] ;
  for ( int x = 0 ;
  x < R ;
  x ++ ) {
    rocks [ 0 ] [ 0 ] = rocks [ 0 ] [ 0 ] ;
    rocks [ 1 ] [ 1 ] = rocks [ 0 ] [ 1 ] ;
  }
  int [ ] [ ] prod = new int [ R ] [ 1 ] ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    prod [ n ] = new int [ n ] ;
    prod [ n ] = new int [ n ] ;
    prod [ n ] [ 0 ] = 1 ;
  }
  for ( int n = 1 ;
  n < N ;
  n ++ ) {
    prod [ n ] = new int [ n ] ;
    prod [ n ] [ 1 ] = 1 ;
  }
  for ( int n = 1 ;
  n < N ;
  n ++ ) {
    prod [ n ] = new int [ n ] ;
    prod [ n ] [ 0 ] = 1 ;
    prod [ n ] [ 1 ] = 1 ;
  }
  return res ;
}
