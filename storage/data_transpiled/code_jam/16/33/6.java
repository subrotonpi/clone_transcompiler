public static void input ( Scanner in ) {
  int t = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < xrange . size ( ) ;
  i ++ ) {
    int j = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    int p = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    int s = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    int k = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    if ( k >= s ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ( j * p * s ) ) ;
      for ( int jj = 0 ;
      jj < xrange . size ( ) ;
      jj ++ ) {
        for ( int pp = 0 ;
        pp < xrange . size ( ) ;
        pp ++ ) {
          for ( int ss = 0 ;
          ss < xrange . size ( ) ;
          ss ++ ) {
            System . out . println ( jj + ", " + pp + ", " + ss ) ;
          }
        }
      }
    }
    else if ( k >= p ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ( j * p * k ) ) ;
      for ( int jj = 0 ;
      jj < xrange . size ( ) ;
      jj ++ ) {
        for ( int pp = 0 ;
        pp < xrange . size ( ) ;
        pp ++ ) {
          for ( int ss = 0 ;
          ss < xrange . size ( ) ;
          ss ++ ) {
            System . out . println ( jj + ", " + pp + ", " + ss ) ;
          }
        }
      }
    }
    else {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ( j * p * k ) ) ;
      List < Integer > mods = new ArrayList < Integer > ( ) ;
      for ( int ss = 0 ;
      ss < xrange . size ( ) ;
      ss ++ ) {
        mods . add ( ( 2 + ss ) % p ) ;
      }
      Set < Integer > set = new HashSet < Integer > ( mods ) ;
      for ( int jj = 0 ;
      jj < xrange . size ( ) ;
      jj ++ ) {
        for ( int pp = 0 ;
        pp < xrange . size ( ) ;
        pp ++ ) {
          for ( int ss = 0 ;
          ss < xrange . size ( ) ;
          ss ++ ) {
            if