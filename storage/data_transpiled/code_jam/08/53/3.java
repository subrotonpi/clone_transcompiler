static void main ( String [ ] args ) {
  final Map < Integer , Integer > bcd = new HashMap < > ( ) ;
  final int bc = ( int ) bcd . get ( 0 ) ;
  if ( bcd . containsKey ( 0 ) ) {
    return ;
  }
  int nn = n ;
  int s = 0 ;
  while ( n > 0 ) {
    if ( ( n & 1 ) != 0 ) {
      s ++ ;
    }
    n /= 2 ;
  }
  bcd . put ( nn , s ) ;
  int N = input . nextInt ( ) ;
  for ( int loop : xrange ( 1 , N + 1 ) ) {
    System . out . println ( "Case #" + loop + ":" ) ;
    final int H = Integer . parseInt ( input . nextLine ( ) ) ;
    final int W = Integer . parseInt ( input . nextLine ( ) ) ;
    final char [ ] [ ] m = new char [ H ] [ W ] ;
    for ( int i : xrange ( H ) ) {
      m [ i ] = input . toCharArray ( ) ;
    }
    /* bit (n) */
    {
      int s = 0 ;
      for ( int i : xrange ( H ) ) {
        s <<= 1 ;
        s += m [ i ] [ n ] == 'x' ? 1 : 0 ;
      }
    }
    Map < Integer , Integer > map = new HashMap < > ( ) ;
    final int HH = 1 << H ;
    for ( int h : xrange ( HH ) ) {
      if ( ( h & bit ( 0 ) ) != 0 ) {
        continue ;
      }
      map . put ( h , bc ( h ) ) ;
    }
    for ( int wl : xrange ( 1 , W ) ) {
      Map < Integer , Integer > dd = new HashMap < > ( ) ;
      for ( int h : xrange ( HH ) ) {
        if ( ( h & bit ( wl ) ) != 0 ) {
          continue ;
        }
        final int pat = ( h | ( h << 1 ) | ( h >> 1 ) ) % HH ;
        int maxx = - 1 ;
        for ( Map . Entry < Integer , Integer > e : map . entrySet ( ) ) {
          if ( ( e . getKey ( ) & pat ) != 0 ) {
            continue ;
          }
          maxx = Math . max ( maxx , e . getValue ( ) ) ;
        }
        if ( maxx >= 0 ) {
          try {
            dd . put ( h , Math . max ( dd . get ( pat ) , bc ( h ) + maxx ) ) ;
          }
          catch ( Exception e ) {
            