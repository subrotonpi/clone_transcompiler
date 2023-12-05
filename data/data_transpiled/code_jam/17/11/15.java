public static void solve ( String [ ] grid ) {
  String [ ] grid2 = new String [ grid . length ] ;
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    String line = grid [ i ] ;
    char lastch = 0 ;
    StringBuffer line2 = new StringBuffer ( ) ;
    for ( int j = 0 ;
    j < line . length ( ) ;
    j ++ ) {
      char ch = line . charAt ( j ) ;
      if ( ch != '?' ) {
        line2 . append ( ch ) ;
        lastch = ch ;
      }
      else if ( lastch != 0 ) {
        line2 . append ( lastch ) ;
      }
    }
    if ( line2 . length ( ) > 0 ) {
      grid2 [ i ] = ( line2 . charAt ( 0 ) ) + line2 . charAt ( line . length ( ) - 1 ) ;
    }
    else if ( grid2 . length > 0 ) {
      grid2 [ i ] = grid2 [ grid2 . length - 1 ] ;
    }
  }
  new Thread ( new Runnable ( ) {
    @ Override public void run ( ) {
      int ntest = Integer . parseInt ( input . nextLine ( ) ) ;
      for ( int itest = 0 ;
      itest < ntest ;
      itest ++ ) {
        int R = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
        int C = Integer . parseInt ( input . nextLine ( ) ) ;
        String [ ] grid = new String [ R ] ;
        for ( int i = 0 ;
        i < R ;
        i ++ ) {
          grid [ i ] = input . nextLine ( ) . trim ( ) ;
        }
        String [ ] grid2 = solve ( grid ) ;
        System . out . println ( "Case #" + ( itest + 1 ) + ":" ) ;
        for ( int i = 0 ;
        i < R ;
        i ++ ) {
          System . out . println ( grid2 [ i ] ) ;
        }
      }
    }
  }
  ) . start ( ) ;
}
