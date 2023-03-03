public static int calc ( int [ ] S , int [ ] T ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( S [ i ] != T [ i ] ) {
      ans ++ ;
    }
  }
  {
    int [ ] s = input . split ( " " ) ;
    Arrays . sort ( s ) ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      S [ i ] = s [ i ] ;
    }
    int [ ] T = input . split ( " " ) ;
    int diff = calc ( S , T ) ;
    if ( diff == 0 ) {
      System . out . println ( "Yes" ) ;
      return 0 ;
    }
    int preDiff = diff ;
    do {
      for ( int i = 0 ;
      i < S . length ;
      i ++ ) {
        if ( S [ i ] != T [ i ] ) {
          char c1 = S [ i ] ;
          char c2 = T [ i ] ;
          break ;
        }
      }
      for ( int i = 0 ;
      i < S . length ;
      i ++ ) {
        if ( S [ i ] == c1 ) {
          S [ i ] = c2 ;
        }
        else if ( S [ i ] == c2 ) {
          S [ i ] = c1 ;
        }
      }
      diff = calc ( S , T ) ;
      if ( diff == 0 ) {
        break ;
      }
      else if ( diff < preDiff ) {
        preDiff = diff ;
        continue ;
      }
      else {
        System . out . println ( "No" ) ;
        return 0 ;
      }
    }
    while ( diff < preDiff ) ;
  }
  System . out . println ( "Yes" ) ;
  if ( className . equals ( "java.util.Scanner" ) ) {
    solve ( ) ;
  }
  return 0 ;
}
