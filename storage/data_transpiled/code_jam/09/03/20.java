public static int findSubsequences ( String text , String pattern , int modulo ) throws IOException {
  final int n = pattern . length ( ) ;
  final HashMap < Character , ArrayList < Integer >> locations = new HashMap < Character , ArrayList < Integer >> ( ) ;
  for ( char c : pattern . toCharArray ( ) ) {
    locations . put ( c , new ArrayList < Integer > ( ) ) ;
  }
  for ( int i = 0 ;
  i < text . length ( ) ;
  i ++ ) {
    try {
      locations . get ( text . charAt ( i ) ) . add ( i ) ;
    }
    catch ( ArrayIndexOutOfBoundsException e ) {
    }
  }
  final int [ ] currCounts = new int [ locations . get ( pattern . charAt ( 0 ) ) . size ( ) ] ;
  for ( int i = 1 ;
  i < pattern . length ( ) ;
  i ++ ) {
    final char currChar = pattern . charAt ( i ) ;
    final char lastChar = pattern . charAt ( i - 1 ) ;
    final int [ ] lastCounts = currCounts ;
    currCounts = new int [ locations . get ( currChar ) . size ( ) ] ;
    for ( int j = 0 ;
    j < locations . get ( currChar ) . size ( ) ;
    j ++ ) {
      for ( int k = 0 ;
      k < locations . get ( lastChar ) . size ( ) ;
      k ++ ) {
        if ( locations . get ( lastChar ) . get ( k ) > locations . get ( currChar ) . get ( j ) ) {
          break ;
        }
        else {
          currCounts [ j ] += lastCounts [ k ] % modulo ;
        }
      }
    }
  }
  return Integer . valueOf ( currCounts [ 0 ] ) % modulo ;
}
