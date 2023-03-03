@ Test ( "large" ) public static String TEST = "C-" + TEST + ".in" ;
final String IN = "C-" + TEST + ".in" ;
final String OUT = "C-" + TEST + ".out" ;
{
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( d [ i ] [ j ] < 0 ) {
        d [ i ] [ j ] = null ;
      }
    }
  }
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( d [ i ] [ k ] != null && d [ k ] [ j ] != null && ( d [ i ] [ j ] == null || d [ i ] [ j ] > d [ i ] [ k ] + d [ k ] [ j ] ) ) {
          d [ i ] [ j ] = d [ i ] [ k ] + d [ k ] [ j ] ;
        }
      }
    }
  }
  int [ ] e = h [ 0 ] ;
  int [ ] s = h [ 1 ] ;
  int [ ] [ ] t = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int k = 0 ;
    k < n ;
    k ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( t [ i ] [ k ] != null && t [ k ] [ j ] != null && ( t [ i ] [ j ] == null || t [ i ] [ j ] > t [ i ] [ k ] + t [ k ] [ j ] ) ) {
          t [ i ] [ j ] = t [ i ] [ k ] + t [ k ] [ j ] ;
        }
      }
    }
  }
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int u : q ) {
    sb . append ( t [ u ] [ v ] ) ;
  }
  return sb . toString ( ) ;
}
