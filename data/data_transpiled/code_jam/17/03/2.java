public static int tnum = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int ti = 0 ;
  ti < tnum ;
  ti ++ ) {
    int n = Integer . parseInt ( scanner . nextLine ( ) ) , k = Integer . parseInt ( scanner . nextLine ( ) ) ;
    n ++ ;
    int [ ] c = {
      1 , 0 }
      ;
      while ( c [ 0 ] + c [ 1 ] < k ) {
        k -= c [ 0 ] + c [ 1 ] ;
        int [ ] d = {
          0 , 0 }
          ;
          int [ ] cands = {
            ( n / 2 ) , ( ( n + 1 ) / 2 ) , ( ( n + 1 ) / 2 ) , ( ( n + 1 ) / 2 ) , ( ( n + 2 ) / 2 ) }
            ;
            for ( int m = 0 ;
            m < cands . length ;
            m ++ ) {
              int cnt = cands [ m ] ;
              if ( m == n / 2 ) d [ 0 ] += cnt ;
              else if ( m == n / 2 + 1 ) d [ 1 ] += cnt ;
              else System . out . println ( "What?" ) ;
            }
            c = d ;
            n = n / 2 ;
          }
          int ans = c [ 1 ] >= k ? n + 1 : n ;
          System . out . println ( "Case #" + ( ti + 1 ) + ": " + ( ans + 1 ) / 2 - 1 + " " + ( ans ) / 2 - 1 ) ;
          return ans ;
        }
      }
      