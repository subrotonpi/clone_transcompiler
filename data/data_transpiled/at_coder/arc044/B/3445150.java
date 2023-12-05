public static int [ ] getN ( ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( A [ 0 ] != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int P = 10 * 9 + 7 ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ A [ i ] ] ++ ;
  }
  if ( B [ 0 ] != 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int [ ] C = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( B [ i ] != 0 ) {
      C [ i ] = B [ i ] ;
    }
    else {
      break ;
    }
  }
  if ( Integer . bitCount ( C ) != N ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int ans = 1 ;
  int M = C . length ;
  /* npmodm(n, m, p) */
  if ( P < 10 ) {
    return ( n * p ) % m ;
  }
  else {
    int [ ] S = Integer . toBinaryString ( p ) ;
    int K = S . length - 2 ;
    int [ ] Q = new int [ K ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      Q [ i ] = Integer . parseInt ( S [ K + 1 - i ] ) ;
    }
    int [ ] R = new int [ K ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      R [ i ] = n ;
    }
    int md = n ;
    if ( p % 2 == 0 ) {
      md = 1 ;
    }
    for ( int i = 1 ;
    i < K ;
    i ++ ) {
      R [ i ] = ( R [ i - 1 ] * 2 ) % m ;
      if ( Q [ i ] == 1 ) {
        md = ( md * R [ i ] ) % m ;
      }
    }
    return md ;
  }
  int [ ] twomod = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    twomod [ i + 1 ] = ( twomod [ i ] * 2 ) % P ;
  }
  / * ▁ two @ @