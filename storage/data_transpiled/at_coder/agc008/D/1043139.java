static final String print ( String input ) {
  System . out . println ( "Enter a number of characters (including the leading or trailing zeros)." ) ;
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  {
    int n = Integer . parseInt ( input ) ;
    int [ ] a = Integer . parseIntArray ( input ) ;
    int nn = n * n ;
    int [ ] r = new int [ nn ] ;
    int [ ] ms = new int [ nn ] ;
    int [ ] us = new int [ nn ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int c = i + 1 ;
      int ri = a [ i ] - 1 ;
      r [ ri ] = c ;
      ms [ ri ] = i ;
      us [ ri ] = n - i - 1 ;
    }
    Arrays . sort ( ms ) ;
    int si = 0 ;
    for ( int ri = 0 ;
    ri < ms . length ;
    ri ++ ) {
      int k = ms [ ri ] ;
      int c = ms [ ri ] ;
      for ( ;
      k > 0 ;
      k -- ) {
        while ( r [ si ] > 0 && si < ( nn - 1 ) ) {
          si ++ ;
        }
        if ( si > ri || r [ si ] > 0 ) {
          System . out . println ( "No" ) ;
          return null ;
        }
        r [ si ] = c ;
      }
    }
    si = nn - 1 ;
    Arrays . sort ( us ) ;
    Arrays . reverse ( us ) ;
    for ( int ri = 0 ;
    ri < us . length ;
    ri ++ ) {
      int k = us [ ri ] ;
      int c = us [ ri ] ;
      for ( ;
      k > 0 ;
      k -- ) {
        while ( r [ si ] > 0 && si > 0 ) {
          si -- ;
        }
        if ( si < ri || r [ si ] > 0 ) {
          System . out . println ( "No" ) ;
          return null ;
        }
        r [ si ] = c ;
      }
    }
    System . out . println ( "Yes" ) ;
    System . out . println ( Arrays . toString ( r ) ) ;
  }
}
