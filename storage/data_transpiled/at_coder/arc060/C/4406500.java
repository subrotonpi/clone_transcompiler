@ VisibleForTesting static int search ( Scanner in ) {
  final int n = in . nextInt ( ) ;
  final int [ ] x = in . nextInt ( ) ;
  final int l = in . nextInt ( ) ;
  final int q = in . nextInt ( ) ;
  final int [ ] [ ] r = new int [ 18 ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      r [ 0 ] [ j ] = in . nextInt ( ) + l - 1 ;
    }
  }
  for ( int i = 1 ;
  i < 18 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      r [ i ] [ j ] = r [ i - 1 ] [ r [ i - 1 ] [ j ] ] ;
    }
  }
  return in . nextInt ( ) ;
}
