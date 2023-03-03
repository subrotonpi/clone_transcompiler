@ VisibleForTesting static void check ( final String c , final int i , final int j , final int k , final int [ ] [ ] li ) {
  final int [ ] [ ] a = new int [ 8 ] [ 8 ] ;
  final int [ ] [ ] b = new int [ 8 ] [ 8 ] ;
  final int [ ] [ ] a = new int [ 8 ] [ 8 ] ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    a [ i ] [ 0 ] = a [ i ] [ 0 ] ;
  }
  final int [ ] [ ] s = SR ( 8 ) ;
  a = new int [ 8 ] [ 8 ] ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 8 ;
    j ++ ) {
      for ( int x = 0 ;
      x < 8 ;
      x ++ ) {
        if ( s [ y ] [ x ] == "Q" ) return ;
      }
      a [ y ] [ x ] = 1 ;
      if ( ! a [ y ] [ x ] . equals ( "Q" ) ) return ;
    }
  }
  final Map < Integer , Integer > map = new TreeMap < Integer , Integer > ( ) ;
  for ( int y = 0 ;
  y < 8 ;
  y ++ ) {
    for ( int x = 0 ;
    x < 8 ;
    x ++ ) {
      if ( ! a [ y ] [ x ] . equals ( "Q" ) ) map . put ( y , x ) ;
    }
  }
  final List < Integer > c = new LinkedList < Integer > ( map . keySet ( ) ) ;
  li = new int [ 8 ] ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    for ( int x = 0 ;
    x < 8 ;
    x ++ ) {
      if ( a [ y ] [ x ] == 1 ) return ;
    }
  }
  final List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) l . add ( i ) ;
  if ( l . size ( ) == 1 ) return ;
  final List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) l . add ( i ) ;
  if ( l . size ( ) == 1 ) return ;
  final int mod = 1000000007 ;
  final Map < Integer , Integer > map = new TreeMap < Integer , Integer > ( ) ;
  a = new int