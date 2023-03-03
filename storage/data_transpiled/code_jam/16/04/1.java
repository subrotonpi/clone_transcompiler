static final int t = Integer . parseInt ( input ) {
  int cs ;
  for ( cs = 1 ;
  cs <= t ;
  cs ++ ) {
    final int k = Integer . parseInt ( input . nextLine ( ) ) ;
    final int c = Integer . parseInt ( input . nextLine ( ) ) ;
    final int s = Integer . parseInt ( input . nextLine ( ) ) ;
    final List < Integer > ls = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < k ;
    i += c ) {
      int cnt = 0 ;
      int now = 0 ;
      for ( int j = i ;
      j < Math . min ( i + c , k ) ;
      j ++ ) {
        cnt ++ ;
        now = now * k + j ;
      }
      while ( ( cnt < c ) && ( cnt < s ) ) {
        now = now * k + ( k - 1 ) ;
        cnt ++ ;
      }
      ls . add ( now + 1 ) ;
    }
    String ans ;
    if ( ls . size ( ) <= s ) ans = Arrays . toString ( ls . toArray ( new Integer [ 0 ] ) ) ;
    else ans = "IMPOSSIBLE" ;
    System . out . println ( "Case #" + cs + ": " + ans ) ;
  }
  return cs ;
}
