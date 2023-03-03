public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] h = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = h [ 0 ] ;
  for ( int i = 0 ;
  i < h . length - 1 ;
  i ++ ) {
    if ( h [ i + 1 ] > h [ i ] ) {
      ans += h [ i + 1 ] - h [ i ] ;
    }
  }
  System . out . println ( ans ) ;
}
