static int A = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  BitSet CS = new BitSet ( ) ;
  BitSet D = new BitSet ( T + 1 ) ;
  for ( int i = 0 ;
  i < A ;
  i ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    BitSet C = new BitSet ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    CS . set ( C ) ;
    int v = 1 << i ;
    for ( int j = 0 ;
    j < C . size ( ) ;
    j ++ ) {
      int p = C . get ( j ) ;
      if ( k <= p ) break ;
      k -= p ;
    }
    int ans = - 1 ;
    if ( k <= l ) {
      for ( int j = 0 ;
      j < C . size ( ) ;
      j ++ ) {
        int c = C . get ( j ) ;
        if ( k <= c ) {
          ans = c ;
          break ;
        }
      }
      System . out . println ( ans ) ;
    }
    BitSet [ ] E = new BitSet [ A ] ;
    for ( int i = 0 ;
    i < A ;
    i ++ ) {
      int [ ] IDX = new int [ C . size ( ) ] ;
      for ( int j = 0 ;
      j < C . size ( ) ;
      j ++ ) {
        C . set ( C . get ( j ) ) ;
      }
      int M = Integer . parseInt ( input . nextLine ( ) ) ;
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        int c1 = Integer . parseInt ( input . nextLine ( ) ) ;
        int c2 = Integer . parseInt ( input . nextLine ( ) ) ;
        int cost = C . get ( j ) ;
        int v = D . get ( c1 ) & D . get ( c2 ) ;
        int i = Integer . valueOf ( Integer . toBinaryString ( v & - v ) ) - 3 ;
        int index = IDX [ i ] ;
        E [ i ] . set ( new BitSet ( index ) ) ;
        E [ i ] . set ( new BitSet ( index ) ) ;
      }
    }
  }
  @ SuppressWarnings ( "unchecked" ) int [ ] [ ] rN = new int [ N ] [ ] ;
  BitSet D = new BitSet ( ) ;
  int csA = Integer . valueOf ( cost ) ;
  for ( BitSet P : E ) {
    int [ ] * p = rN ;
    boolean ok = true ;
    