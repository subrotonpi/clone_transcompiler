public static void solve ( int cas , Range < Integer > range ) {
  String s , k ;
  s = readLine ( ) . trim ( ) ;
  k = Integer . parseInt ( s ) ;
  int len = s . length ( ) ;
  Arrays . fill ( s , ( char ) 0 ) ;
  int [ ] f = new int [ len + 1 ] ;
  for ( int v : range . values ( ) ) {
    f [ v ] = 0 ;
  }
  int m = 0 ;
  for ( int i : xrange ) {
    if ( i + k <= len && ( s . charAt ( i ) ^ f [ i ] ) != 0 ) {
      f [ i ] ^= 1 ;
      f [ i + k ] ^= 1 ;
      m ++ ;
    }
    s . charAt ( i ) ^ = f [ i ] ;
    f [ i + 1 ] ^= f [ i ] ;
  }
  System . out . println ( "Case #" + cas + ": " + ( StringUtils . isNumeric ( s ) ? "IMPOSSIBLE" : m ) ) ;
}
