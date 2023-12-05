static final int [ ] [ ] getS ( ) {
  int R = Integer . parseInt ( input . readLine ( ) ) ;
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < String >> S = new ArrayList < > ( ) ;
  int sum [ ] [ ] = new int [ 505 ] [ 505 ] ;
  for ( int i = 0 ;
  i < 505 ;
  i ++ ) {
    int sum [ ] [ ] = new int [ 505 ] ;
    for ( int j = 0 ;
    j < 505 ;
    j ++ ) {
      sum [ y ] [ x ] = 0 ;
    }
  }
  int RR [ ] [ ] = new int [ 505 ] [ 505 ] ;
  int LL [ ] [ ] = new int [ 505 ] [ 505 ] ;
  /* get L */
  double getL = LL [ y + 1 + ( s - 1 ) ] [ x + 1 - ( s - 1 ) ] - LL [ y + 1 - 1 ] [ x + 1 + 1 ] ;
  /* get R */
  for ( int y = 0 ;
  y < R ;
  y ++ ) {
    S . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
    for ( int x = 0 ;
    x < C ;
    x ++ ) {
      sum [ y + 1 ] [ x + 1 ] = sum [ y + 1 ] [ x ] + ( S . get ( y ) . get ( x ) == 'o' ? 1 : 0 ) ;
      RR [ y + 1 ] [ x + 1 ] = RR [ y ] [ x + 1 - 1 ] + ( S . get ( y ) . get ( x ) == 'o' ? 1 : 0 ) ;
      LL [ y + 1 ] [ x + 1 ] = LL [ y ] [ x + 1 + 1 ] + ( S . get ( y ) . get ( x ) == 'o' ? 1 : 0 ) ;
    }
  }
  int ret = 0 ;
  int ss = 1 + 4 * ( K - 1 ) * K / 2 ;
  for ( int y = 0 ;
  y < R ;
  y ++ ) {
    if ( y < K - 1 || y + K - 1 >= R ) continue ;
    int st = 0 ;
    for ( int x = K - 1 ;
    x < C - ( K - 1 ) ;
    x ++ ) {
      if ( x == K - 1 ) {
        for ( int