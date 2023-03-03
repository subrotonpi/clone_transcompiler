public static void input ( ) {
  s = input ( ) ;
  int [ ] d = new int [ 26 ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    d [ ( int ) i ] ++ ;
  }
  int k = d . length % 2 ;
  System . out . println ( k > 0 ? 2 * ( ( s . length - k ) / ( 2 * k ) ) + 1 : s . length ) ;
}
