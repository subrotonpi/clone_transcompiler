static char [ ] [ ] recolor ( int H , int W , char [ ] [ ] B , char c , char d ) {
  for ( int i = 0 ;
  i < Integer . MAX_VALUE ;
  i ++ ) {
    for ( int j = 0 ;
    j < Integer . MAX_VALUE ;
    j ++ ) {
      if ( ( B [ i ] [ j ] == c ) && ( B [ i ] [ j ] == d ) ) {
        B [ i ] [ j ] = d ;
      }
    }
  }
  /* main case */
  char cur = A [ i ] [ j ] ;
  if ( ( B [ i ] [ j ] == ' ' ) && ( B [ i ] [ j ] == ' ' ) ) {
    B [ i ] [ j ] = c ;
    int to = 100000 , d1 = - 1 , d2 = - 1 ;
    if ( ( i - 1 >= 0 ) && ( A [ i - 1 ] [ j ] < to ) && ( A [ i - 1 ] [ j ] == ' ' ) ) {
      to = A [ i - 1 ] [ j ] ;
      d1 = i - 1 ;
      d2 = j ;
    }
    if ( ( j - 1 >= 0 ) && ( A [ i ] [ j - 1 ] < to ) && ( A [ i ] [ j ] == ' ' ) ) {
      to = A [ i ] [ j - 1 ] ;
      d1 = i - 1 ;
      d2 = j - 1 ;
    }
    if ( ( j + 1 < W ) && ( A [ i ] [ j + 1 ] < to ) && ( A [ i + 1 ] [ j ] == ' ' ) ) {
      c = searchpath ( W , H , A , B , d1 , d2 , c ) ;
    }
    else {
      return ( char [ ] ) ( c + 1 ) ;
    }
  }
  else {
    /* recolor case */
    H = Integer . parseInt ( input ( ) ) ;
    W = Integer . parseInt ( input ( ) ) ;
    char [ ] [ ] A = new char [ H ] [ W ] ;
    char [ ] [ ] B = new char [ W ] [ W ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        if ( ( B [ i ] [ j ] == ' ' ) && ( B [ i ] [ j ] == ' ' ) ) {
          B [