@ VisibleForTesting static int [ ] [ ] solve ( ) {
  final int mod = 10007 ;
  final int cases = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int testCase : xrange ( 1 , cases + 1 ) ) {
    final int h = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int w = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int r = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final Set < Pair < Integer , Integer >> bad = new HashSet < > ( ) ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      final int i = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      final int j = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      bad . add ( new Pair < > ( i , j ) ) ;
    }
    final int [ ] [ ] tab = new int [ cases ] [ cases ] ;
    tab [ h ] [ w ] = 1 ;
    for ( int i = xrange ( h , 0 , - 1 ) ;
    i >= 0 ;
    i -- ) {
      for ( int j = xrange ( w , 0 , - 1 ) ;
      j >= 0 ;
      j -- ) {
        if ( bad . contains ( new Pair < > ( i , j ) ) ) continue ;
        if ( bad . contains ( new Pair < > ( i , j ) ) ) continue ;
        tab [ i ] [ j ] = ( tab [ i + 2 ] [ j + 1 ] + tab [ i + 1 ] [ j + 2 ] ) % mod ;
      }
    }
    System . out . println ( String . format ( "Case #%d: %d" , testCase , tab [ 1 ] [ 1 ] % mod ) ) ;
  }
  return new int [ cases ] [ cases ] ;
}
