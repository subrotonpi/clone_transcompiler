public static void print ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> BR = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    BR . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int mod = 10 * 9 + 7 ;
  List < Integer > [ ] BRLIST = new ArrayList [ N + 1 ] ;
  for ( int i = 0 ;
  i < BR . length ;
  i ++ ) {
    BRLIST [ i ] = new ArrayList < > ( ) ;
  }
  for ( int i = 0 ;
  i < BR . length ;
  i ++ ) {
    BR [ i ] . add ( BR [ i ] ) ;
    BRLIST [ i ] . add ( BR [ i ] ) ;
  }
  @ SuppressWarnings ( "unchecked" ) Queue < Integer > QUE = new LinkedList < > ( ) ;
  int [ ] [ ] ANS = new int [ N + 1 ] [ N + 1 ] ;
  int [ ] USED = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( BRLIST [ i ] . length == 1 ) QUE . add ( i ) ;
  }
  while ( QUE . size ( ) > 0 ) {
    int x = QUE . poll ( ) ;
    if ( USED [ x ] == 1 ) continue ;
    int NOUSES = 0 ;
    for ( int j : BRLIST [ x ] ) {
      if ( USED [ j ] == 0 ) NOUSES ++ ;
    }
    if ( NOUSES >= 2 ) {
      QUE . add ( x ) ;
      continue ;
    }
    int W = 1 ;
    int B = 1 ;
    for ( int j : BRLIST [ x ] ) {
      if ( USED [ j ] != 0 ) {
        W = W * ( ANS [ j ] [ 0 ] + ANS [ j ] [ 1 ] ) % mod ;
        B = B * ANS [ j ] [ 0 ] % mod ;
      }
      else QUE . add ( j ) ;
    }
    ANS [ x ] = new int [ ] {
      W , B }
      ;
      USED [ x ] = 1 ;
    }
    System . out . println ( Integer . toString ( ANS [ x ] ) % mod ) ;
  }
  