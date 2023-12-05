static final int reverse ( int n ) throws IOException {
  StringBuilder g = new StringBuilder ( Integer . toString ( n ) ) ;
  if ( g . charAt ( g . length ( ) - 1 ) == 'L' ) {
    g . setLength ( 0 ) ;
  }
  g . reverse ( ) ;
  int h = Integer . parseInt ( g . toString ( ) ) ;
  int low = Integer . parseInt ( g . toString ( ) ) ;
  int high = Integer . parseInt ( g . toString ( ) ) ;
  System . out . println ( "Case #" + Integer . toString ( case + 1 ) + ": " + Integer . toString ( howmany ( high ) - 1 ) ) ;
  boolean [ ] fairAndSquare = new boolean [ 10 ] ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    int sq = i * i ;
    if ( isBetterCase ( sq ) ) {
      fairAndSquare [ sq ] = true ;
    }
  }
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    int j = i * 10 + Integer . parseInt ( g . toString ( ) ) ;
    int sq = j * j ;
    if ( isBetterCase ( sq ) ) {
      fairAndSquare [ sq ] = true ;
    }
  }
  for ( int i = 10 ;
  i <= 100 ;
  i ++ ) {
    int j = i * 10 + Integer . parseInt ( g . toString ( ) ) ;
    int sq = j * j ;
    if ( isBetterCase ( sq ) ) {
      fairAndSquare [ sq ] = true ;
    }
  }
  for ( int i = 10 ;
  i <= 100 ;
  i ++ ) {
    int j = i * 100 + Integer . parseInt ( g . toString ( ) ) ;
    int sq = j * j ;
    if ( isBetterCase ( sq ) ) {
      fairAndSquare [ sq ] = true ;
    }
  }
  for ( int i = 100 ;
  i <= 1000 ;
  i ++ ) {
    int j = i * 1000 + Integer . parseInt ( g . toString ( ) ) ;
    int sq = j * j ;
    if ( isBetterCase ( sq ) ) {
      fairAndSquare [ sq ] = true ;
    }
  }
  for ( int i = 1000 ;
  i <= 10000 ;
  i ++ ) {
    int j = i * 1000 + Integer . parseInt ( g . toString ( ) ) ;
    if ( isBetterCase ( sq ) ) {
      fairAndSquare [ sq ] = true ;
    }
  }
  return low ;
}
