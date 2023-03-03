public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] S = new int [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) S [ i ] = input . readLine ( ) ;
  /* Check the order of the elements */
  int [ ] u = new int [ W ] ;
  int mid = W % 2 ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    if ( u [ i ] != 0 ) continue ;
    for ( int j = i + 1 ;
    j < W ;
    j ++ ) {
      for ( int p = 0 ;
      p < l . length ;
      p ++ ) {
        int q = l . length - p ;
        int [ ] sp = S [ p ] ;
        int [ ] sq = S [ q ] ;
        if ( sp [ i ] != sq [ j ] || sp [ j ] != sq [ i ] ) break ;
      }
      else {
        u [ j ] = 1 ;
        break ;
      }
    }
    else {
      if ( mid > 0 ) {
        for ( int p = 0 ;
        p < l . length ;
        p ++ ) {
          int [ ] sp = S [ p ] ;
          int [ ] sq = S [ q ] ;
          if ( sp [ i ] != sq [ i ] ) break ;
        }
        else {
          mid = 0 ;
          continue ;
        }
      }
      break ;
    }
  }
  /* Make the elements of the elements */
  while ( u [ c ] != 0 ) {
    c ++ ;
  }
  if ( c == H ) {
    if ( check ( l ) ) {
      System . out . println ( "YES" ) ;
      exit ( 0 ) ;
    }
    return 0 ;
  }
  if ( p > 0 ) {
    l [ c ] = new int [ c ] ;
    make ( c + 1 , l , u , 0 ) ;
    l [ c ] = new int [ c ] ;
  }
  for ( int i = c + 1 ;
  i < H ;
  i ++ ) {
    if ( u [ i ] != 0 ) continue ;
    u [ i ] = i ;
    l [ c ] = new int [ c ] ;
    make ( c + 1 , l , u , p ) ;
    l [ c ] = i ;
    u [ i ] = i ;
  }
}
/* Make the elements of the elements of the elements of the elements */
return H %