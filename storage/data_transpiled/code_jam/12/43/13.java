static boolean check ( int [ ] heights , int [ ] hf ) {
  for ( int i = 0 ;
  i < hf . length ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= hf . length ;
    j ++ ) {
      int akt = hf [ i ] - 1 ;
      if ( j != akt ) {
        int x1 = j - i ;
        int y1 = heights [ j ] - heights [ i ] ;
        int x2 = akt - i ;
        int y2 = heights [ akt ] - heights [ i ] ;
        if ( x1 * y2 - x2 * y1 <= 0 ) {
          return false ;
        }
      }
    }
  }
  /* generate random integers */
  int [ ] highestFrom = new int [ 400 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    highestFrom [ i ] = new int [ n ] ;
  }
  int t = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int tt = 1 ;
  tt <= t ;
  tt ++ ) {
    n = Integer . parseInt ( scanner . nextLine ( ) ) ;
    String line = scanner . nextLine ( ) ;
    int [ ] highestFrom = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) highestFrom [ i ] = Integer . parseInt ( line . trim ( ) ) ;
    boolean w = false ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      for ( int j = i + 1 ;
      j <= highestFrom [ i ] - 1 ;
      j ++ ) {
        if ( highestFrom [ j ] > highestFrom [ i ] ) {
          w = true ;
        }
      }
    }
    if ( w ) {
      System . out . println ( "Case #" + tt + ": Impossible" ) ;
    }
    else {
      w = false ;
      heights = new int [ n ] ;
      while ( ! w ) {
        heights = generate ( n ) ;
        w = check ( heights , highestFrom ) ;
      }
      String res = "Case #" + tt + ": " ;
      for ( int i = 0 ;
      i < heights . length ;
      i ++ ) {
        res += heights [ i ] + " " ;
      }
      System . out . println ( res ) ;
    }
  }
  return true ;
}
