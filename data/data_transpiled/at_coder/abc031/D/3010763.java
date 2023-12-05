@ VisibleForTesting static Iterable < String > combinations ( int k , int n ) {
  int [ ] [ ] x = new int [ n ] [ k ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] y = new int [ k ] ;
    for ( int j = 0 ;
    j < x [ i ] [ 0 ] ;
    j ++ ) y [ j ] = Integer . parseInt ( x [ i ] [ j ] ) ;
    x [ i ] [ 0 ] = y ;
  }
  return new Iterable < String > ( ) {
    @ Override public boolean iterator ( ) {
      return true ;
    }
    @ Override public String toString ( ) {
      return "" ;
    }
  }
  ;
}
