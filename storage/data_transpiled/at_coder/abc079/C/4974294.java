private static void dfs ( String [ ] s , int [ ] plus , int i ) {
  i ++ ;
  if ( i == 4 ) {
    int ans = Integer . MIN_VALUE ;
    for ( int j = 1 ;
    j < 4 ;
    j ++ ) {
      ans += Integer . MIN_VALUE * plus [ j - 1 ] ;
    }
    if ( ans == 7 ) {
      String ret = s [ 0 ] ;
      for ( int k = 1 ;
      k < 4 ;
      k ++ ) {
        if ( plus [ k - 1 ] == 1 ) ret += "+" ;
        else ret += "-" ;
        ret += s [ k ] ;
      }
      ret += "=7" ;
      System . out . println ( ret ) ;
      exit ( ) ;
    }
    return ;
  }
  dfs ( input , new int [ ] {
    0 , 0 , 0 }
    , 0 ) ;
  }
  