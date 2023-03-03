public static void memoize ( final Runnable r ) {
  final Map < Object , Object > map = new HashMap < > ( ) ;
  new Thread ( ) {
    @ Override public void run ( ) {
      if ( map . containsKey ( a ) ) {
        return ;
      }
      Object r = r . run ( ) ;
      map . put ( a , r ) ;
    }
  }
  . start ( ) ;
  @ SuppressWarnings ( "unchecked" ) int dp = 0 ;
  List < Integer > l = new ArrayList < > ( ) ;
  int i = 0 ;
  assert ( l . size ( ) == p - 1 ) ;
  if ( Arrays . equals ( l . get ( 0 ) , 0 ) ) {
    return ;
  }
  int best = 0 ;
  for ( int j = 0 ;
  j < l . size ( ) ;
  j ++ ) {
    final List < Integer > nl = new ArrayList < > ( l ) ;
    if ( nl . get ( j ) == 0 ) continue ;
    nl . set ( j , -- best ) ;
    best = Math . max ( best , dp ( p , new Integer [ ] {
      nl . get ( j ) , ( i + j + 1 ) % p }
      ) ) ;
    }
    if ( i == 0 ) {
      best ++ ;
    }
    int t = Integer . parseInt ( input ( ) ) ;
    for ( int tc = 0 ;
    tc < t ;
    tc ++ ) {
      System . out . print ( "Case #" + ( tc + 1 ) + ":" ) ;
      final int n = Integer . parseInt ( input ( ) ) ;
      final int p = Integer . parseInt ( input ( ) ) ;
      final List < Integer > gg = new ArrayList < > ( ) ;
      for ( int x : Integer . parseInt ( input ( ) ) ) {
        gg . add ( x ) ;
      }
      final int [ ] ll = new int [ p ] ;
      for ( int x : gg ) {
        ll [ x % p ] ++ ;
      }
      System . out . println ( ll [ 0 ] + dp ( p , new Integer [ ] {
        ll [ 1 ] }
        , 0 ) ) ;
      }
    }
    