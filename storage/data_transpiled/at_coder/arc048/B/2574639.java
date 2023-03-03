static final int [ ] getSortingPairs ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > RH = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) RH . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  List < Integer > R = new ArrayList < > ( ) ;
  Map < Integer , Integer > D = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    R . add ( i ) ;
    D . get ( i ) . put ( i , 1 ) ;
  }
  Collections . sort ( R ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int r = RH . get ( i ) ;
    int h = RH . get ( i ) ;
    int bl = R . size ( ) ;
    int br = R . size ( ) ;
    int win = bl ;
    int lose = N - br ;
    int even = 0 ;
    if ( br - bl > 1 ) {
      win += D . get ( i ) . get ( h % 3 + 1 ) ;
      lose += D . get ( i ) . get ( ( h + 1 ) % 3 + 1 ) ;
      even = D . get ( i ) . get ( ( h + 2 ) % 3 + 1 ) - 1 ;
    }
    System . out . println ( win + " " + lose + " " + even ) ;
  }
  return new int [ ] {
    win , lose , even }
    ;
  }
  