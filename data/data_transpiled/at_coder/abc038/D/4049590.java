static final int binarySearch ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int [ ] [ ] numArray = new int [ N ] [ 2 ] ;
  int h = 0 ;
  int w = 0 ;
  for ( int j = 0 ;
  ( h = Integer . parseInt ( input ) ) != N ;
  j ++ ) {
    h = Integer . parseInt ( input ) ;
    w = Integer . parseInt ( input ) ;
    numArray [ j ] = h ;
  }
  Arrays . sort ( numArray ) ;
  Arrays . sort ( numArray ) ;
  final int [ ] dp = new int [ N ] ;
  dp [ 0 ] = numArray [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( ( dp . length == 1 ) ) {
      if ( ( dp [ i - 1 ] < numArray [ i ] ) ) {
        dp [ i ] = numArray [ i ] ;
      }
      else if ( dp [ i - 1 ] > numArray [ i ] ) {
        int index = Integer . parseInt ( input ) ;
        dp [ index ] = numArray [ i ] ;
      }
    }
  }
  System . out . println ( String . valueOf ( dp . length ) + "\n" ) ;
  return dp . length ;
}
