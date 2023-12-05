public static void main ( String cas , Range range ) {
  int [ ] n = ArrayUtil . getIntArray ( input ) ;
  int mn = 10 ;
  int last9 = n . length - 1 ;
  for ( int i : xrange ( n . length - 1 , - 1 , - 1 ) ) {
    if ( n [ i ] > mn ) {
      n [ i ] -- ;
      while ( last9 > i ) {
        n [ last9 ] = 9 ;
        last9 -- ;
      }
      mn = 10 ;
    }
    mn = Math . min ( mn , n [ i ] ) ;
  }
  String ans = new String ( ArrayUtil . toIntArray ( n ) ) . concat ( "0" ) ;
  System . out . println ( "Case #" + cas + ": " + ans ) ;
}
