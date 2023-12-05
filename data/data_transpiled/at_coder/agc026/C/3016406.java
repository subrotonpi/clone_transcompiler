static final double [ ] [ ] range ( int i , int j ) {
  int inf = i * j ;
  double eps = 1.0 / j ;
  int mod = 10 * j + 7 ;
  int [ ] dd = {
    ( - 1 ) , ( 0 ) , ( 1 ) , ( 1 ) , ( 0 ) , ( 0 , - 1 ) }
    ;
    int [ ] ddn = {
      ( - 1 ) , ( 0 ) , ( - 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 0 ) , ( - 1 ) }
      ;
      /* LI */
      /* LIT */
      /* LF */
      /* LS */
      /* I */
      int [ ] [ ] ints = new int [ 2 ] [ 2 ] ;
      /* F */
      /* S */
      input = new Scanner ( System . in ) ;
      /* pf */
      System . out . println ( "Input: " + input ) ;
      /* main */
      int n = Integer . parseInt ( input ) ;
      /* s */
      String s1 = input . substring ( 0 , n ) ;
      String s2 = input . substring ( n ) ;
      TreeMap < Integer , Double > d1 = new TreeMap < Integer , Double > ( ) ;
      TreeMap < Integer , Double > d2 = new TreeMap < Integer , Double > ( ) ;
      int [ ] ii = new int [ 2 ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        ii [ j ] = 2 * i ;
      }
      for ( int j = 0 ;
      j < 2 * n ;
      j ++ ) {
        String t = "" ;
        String t2 = "" ;
        String t3 = "" ;
        String t4 = "," ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( ( ii [ j ] & i ) != 0 ) {
            t += s1 . charAt ( j ) ;
            t3 += s2 . charAt ( j ) ;
          }
          else {
            t2 += s1 . charAt ( j ) ;
            t4 += s2 . charAt ( j ) ;
          }
        }
        d1 . put ( t + t2 , 1 ) ;
        d2 . put ( t3 + t4 , 1 ) ;
      }
      int r = 0 ;
      for ( int k : d1 . keySet ( ) ) {
        r += d1 . get ( k ) * d2 . get ( k ) ;
      }
      return r ;
    }
    