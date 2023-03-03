public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int t : xrange ( T ) ) {
    int K = Integer . parseInt ( readLine ( ) . split ( " " ) [ 0 ] ) ;
    int C = Integer . parseInt ( readLine ( ) . split ( " " ) [ 1 ] ) ;
    int S = Integer . parseInt ( readLine ( ) . split ( " " ) [ 2 ] ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ":" + "," ) ;
    if ( S * C < K ) System . out . println ( "IMPOSSIBLE" ) ;
    else {
      Set < Integer > u = new HashSet < Integer > ( ) ;
      int la = 0 ;
      while ( la < K ) {
        int s = 0 ;
        for ( int i : xrange ( C ) ) {
          s *= K ;
          s += Math . min ( K - 1 , la ) ;
          la ++ ;
        }
        u . add ( s + 1 ) ;
      }
      System . out . println ( Arrays . toString ( new Object [ ] {
        u }
        ) ) ;
      }
    }
  }
  