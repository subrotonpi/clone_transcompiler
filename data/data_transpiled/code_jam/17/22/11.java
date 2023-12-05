public static String solveEasy ( int r , int y , int b ) {
  int [ ] x = {
    r , y , b }
    ;
    String [ ] cols = {
      "R" , "Y" , "B" }
      ;
      int tot = r + y + b ;
      for ( int i : xrange ( 3 ) ) {
        if ( ( x [ i ] * 2 ) > tot ) return "IMPOSSIBLE" ;
      }
      int best = Collections . max ( new int [ 3 ] , new Comparator < Integer > ( ) {
        public int compare ( Integer o1 , Integer o2 ) {
          int n = Integer . parseInt ( input . nextLine ( ) ) ;
          int r = Integer . parseInt ( input . nextLine ( ) ) ;
          int o = Integer . parseInt ( input . nextLine ( ) ) ;
          int g = Integer . parseInt ( input . nextLine ( ) ) ;
          int b = Integer . parseInt ( input . nextLine ( ) ) ;
          int v = Integer . parseInt ( input . nextLine ( ) ) ;
          System . out . println ( "Case #" + testCase + ": " + solve ( n , r , o , y , g , b , v ) ) ;
          return 0 ;
        }
      }
      ) ;
      int at = - 1 ;
      for ( int i : xrange ( 3 ) ) {
        if ( ( i == best ) && ( x [ i ] == 0 ) ) continue ;
        rat ++ ;
        int ran = rs [ rat ] ;
        for ( int j = 0 ;
        j < ran ;
        j ++ ) {
          if ( ( x [ i ] > 0 ) && ( x [ i ] == 0 ) ) {
            ans [ j ] = ans [ j ] + cols [ i ] ;
            x [ i ] -- ;
          }
          else break ;
        }
      }
      /* In case */
      {
        int [ ] x = {
          r , y , b }
          ;
          int [ ] l = {
            g , v , o }
            ;
            String [ ] cols = {
              "R" , "Y" , "B" }
              ;
              String [ ] offs = {
                "GR" , "VY" , "OB" }
                ;
                tot = r + y + b + g + v + o ;
                for ( int i : xrange ( 3 ) ) {
                  if ( ( l [ i ] > x [ i ] ) && ( l [ i ] > x [ i ] ) ) return "IMPOSSIBLE" ;
                  if ( ( l [ i ] == 0 ) && ( x [ i ]