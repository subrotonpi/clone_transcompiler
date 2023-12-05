static final Scanner in = new Scanner ( System . in ) {
  public int next ( ) {
    int casenum = Integer . parseInt ( in . nextLine ( ) ) ;
    for ( int casei = xrange ( casenum ) ;
    casei < casenum ;
    casei ++ ) {
      int res = 0 ;
      int P = Integer . parseInt ( in . nextLine ( ) ) ;
      final String [ ] strings = in . nextLine ( ) . split ( " " ) ;
      final int [ ] M = new int [ strings . length ] ;
      for ( int i = 0 ;
      i < M . length ;
      i ++ ) M [ i ] = P - Integer . parseInt ( strings [ i ] ) ;
      final int [ ] [ ] costs = new int [ strings . length ] [ strings . length ] ;
      final int [ ] attending = new int [ strings . length ] ;
      for ( int p = 0 ;
      p < strings . length ;
      p ++ ) {
        strings [ p ] = in . nextLine ( ) . split ( " " ) ;
        costs [ p ] [ i ] = Integer . parseInt ( strings [ i ] ) ;
      }
      for ( int p = 0 ;
      p < strings . length ;
      p ++ ) {
        int curoff = 0 ;
        for ( int x = xrange ( ( ( 1 << P ) / ( 1 << p ) ) ) ;
        x < M . length ;
        x ++ ) {
          boolean needstobuy = false ;
          for ( int i = curoff ;
          i < ( curoff + ( 1 << p ) ) ;
          i ++ ) {
            if ( M [ i ] > 0 ) needstobuy = true ;
          }
          if ( needstobuy ) {
            res ++ ;
            for ( int i = curoff ;
            i < ( curoff + ( ( 1 << p ) ) ) ;
            i ++ ) M [ i ] -- ;
          }
          curoff += ( 1 << p ) ;
        }
      }
      System . out . println ( "Case #" + ( casei + 1 ) + ": " + res ) ;
      return res ;
    }
  }
}
