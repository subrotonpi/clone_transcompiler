static final Scanner in = new Scanner ( System . in ) {
  @ Override public void next ( ) {
    in . nextLine ( ) ;
    int R = Integer . parseInt ( in . nextLine ( ) ) ;
    int C = Integer . parseInt ( in . nextLine ( ) ) ;
    int K = Integer . parseInt ( in . nextLine ( ) ) ;
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    int [ ] r = new int [ N ] ;
    int [ ] c = new int [ N ] ;
    int [ ] x = new int [ R ] ;
    int [ ] y = new int [ C ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      r [ i ] = Integer . parseInt ( in . nextLine ( ) ) ;
      c [ i ] = Integer . parseInt ( in . nextLine ( ) ) ;
      r [ i ] -- ;
      c [ i ] -- ;
      x [ r [ i ] ] ++ ;
      y [ c [ i ] ] ++ ;
    }
    int [ ] a = new int [ C + 1 ] ;
    int [ ] b = new int [ R + 1 ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      a [ x [ i ] ] ++ ;
    }
    for ( int i = 0 ;
    i < C ;
    i ++ ) {
      b [ y [ i ] ] ++ ;
    }
    int ans1 = 0 ;
    int ans2 = 0 ;
    for ( int i = 0 ;
    i < K + 1 ;
    i ++ ) {
      if ( ( 0 <= i && i <= C && 0 <= K - i && i <= R ) ) {
        ans1 += a [ i ] * b [ K - i ] ;
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ( x [ r [ i ] ] + y [ c [ i ] ] ) == K ) {
        ans1 -- ;
      }
      if ( ( x [ r [ i ] + y [ c [ i ] ] ] == K + 1 ) ) {
        ans2 ++ ;
      }
    }
    System . out . println ( ans1 + ans2 ) ;
  }
}
