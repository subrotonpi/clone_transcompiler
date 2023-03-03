private static String runTest ( ) {
  String s = input . next ( ) ;
  int k = Integer . parseInt ( s ) ;
  int size = s . length ( ) ;
  boolean [ ] array = new boolean [ size ] ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    array [ i ] = s . charAt ( i ) == '+' ;
  }
  int flips = 0 ;
  for ( int i = 0 ;
  i < size - k + 1 ;
  i ++ ) {
    if ( ! array [ i ] ) {
      flips ++ ;
      for ( int j = i ;
      j < i + k ;
      j ++ ) {
        array [ j ] = ! array [ j ] ;
      }
    }
  }
  return Arrays . toString ( array ) . equals ( s ) ? "IMPOSSIBLE" : "IMPOSSIBLE" ;
}
