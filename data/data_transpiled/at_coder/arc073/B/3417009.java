public static int [ ] [ ] map ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int iw = Integer . parseInt ( input ) ;
  int v = Integer . parseInt ( input ) ;
  Map < Integer , List < Integer >> map = new HashMap < > ( ) ;
  map . put ( 0 , new ArrayList < > ( ) ) ;
  map . put ( 1 , new ArrayList < > ( ) ) ;
  map . put ( 2 , new ArrayList < > ( ) ) ;
  map . put ( 3 , new ArrayList < > ( ) ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int w = Integer . parseInt ( input ) ;
    v = Integer . parseInt ( input ) ;
    map . get ( w - iw ) . add ( v ) ;
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) map . put ( i , new ArrayList < > ( map . get ( i ) ) ) ;
  int ret = - 1 ;
  for ( int i = 0 ;
  i < Math . min ( n , map . get ( 0 ) . size ( ) ) + 1 ;
  i ++ ) {
    if ( i * iw > W ) break ;
    for ( int j = 0 ;
    j < Math . min ( n - i , map . get ( 1 ) . size ( ) ) + 1 ;
    j ++ ) {
      if ( i * iw + j * ( iw + 1 ) > W ) break ;
      for ( int k = 0 ;
      k < Math . min ( n - ( i + j ) , map . get ( 2 ) . size ( ) ) + 1 ;
      k ++ ) {
        if ( i * iw + j * ( iw + 1 ) + k * ( iw + 2 ) + l * ( iw + 3 ) > W ) break ;
        for ( int l = 0 ;
        l < Math . min ( n - ( i + j + k ) , map . get ( 3 ) . size ( ) ) + 1 ;
        l ++ ) {
          if ( i * iw + j * ( iw + 1 ) + k * ( iw + 2 ) + l * ( iw + 3 ) > W ) continue ;
          int V = Integer . parseInt ( map . get ( 0 ) . get ( i ) ) + Integer . parseInt ( map . get ( 1 ) . get ( j ) ) + Integer . parseInt ( map . get ( 2 ) . get (