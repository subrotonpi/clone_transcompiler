public static int T = Integer . parseInt ( Scanner in ) {
  for ( int testCase : xrange ( 1 , T + 1 ) ) {
    int [ ] wires = new int [ 2 ] ;
    int N = in . nextInt ( ) ;
    for ( int i : xrange ( N ) ) {
      int a = in . nextInt ( ) ;
      int b = in . nextInt ( ) ;
      wires [ i ] = new int [ ] {
        a , b }
        ;
      }
      int ans = 0 ;
      for ( int i : xrange ( N ) ) {
        for ( int j : xrange ( i ) ) {
          int [ ] temp = {
            wires [ i ] , wires [ j ] }
            ;
            Arrays . sort ( temp ) ;
            if ( temp [ 0 ] > temp [ 1 ] ) ans ++ ;
          }
        }
        System . out . println ( "Case #" + testCase + ": " + ans ) ;
      }
      return ans ;
    }
    