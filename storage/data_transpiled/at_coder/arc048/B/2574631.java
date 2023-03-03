static final int [ ] getSortingPairs ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > RH = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) RH . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int [ ] R = new int [ N ] , H = new int [ N ] ;
  Map < Integer , Integer > D = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int r = RH . get ( i ) ;
    int h = H . get ( i ) ;
    R [ i ] = r ;
    H [ i ] = h ;
    D . put ( r , h ) ;
  }
  Arrays . sort ( R ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int r = RH . get ( i ) ;
    int h = H . get ( i ) ;
    int bl = R [ i ] ;
    int br = R [ i ] ;
    int win = bl ;
    int lose = N - br ;
    int even = 0 ;
    if ( br - bl > 1 ) {
      win += D . get ( r ) . get ( h % 3 + 1 ) ;
      lose += D . get ( r ) . get ( ( h + 1 ) % 3 + 1 ) ;
      even = D . get ( r ) . get ( ( h + 2 ) % 3 + 1 ) - 1 ;
    }
    System . out . println ( win + " " + lose + " " + even ) ;
  }
  return new int [ ] {
    win , lose , even }
    ;
  }
  