static final void main ( String [ ] args ) {
  psyco . full ( ) ;
  {
    int T = input . nextInt ( ) ;
    for ( int t = 0 ;
    t < xrange ( T ) ;
    t ++ ) {
      int P = Integer . parseInt ( input . nextLine ( ) ) ;
      int W = Integer . parseInt ( input . nextLine ( ) ) ;
      String [ ] line = input . split ( "\\s+" ) ;
      int [ ] [ ] g = new int [ P ] [ W ] ;
      for ( int p = 0 ;
      p < line . length ;
      p ++ ) {
        String l = line [ p ] ;
        int a = Integer . parseInt ( l . split ( "," ) [ 0 ] ) ;
        int b = Integer . parseInt ( l . split ( "," ) [ 0 ] ) ;
        g [ a ] [ b ] = b ;
        g [ b ] [ a ] = a ;
      }
      int [ ] gsets = new int [ P ] ;
      int [ ] Ls = new int [ P ] ;
      for ( int i = 0 ;
      i < P ;
      i ++ ) {
        gsets [ i ] = new int [ P ] ;
        for ( int j = 0 ;
        j < P ;
        j ++ ) {
          gsets [ i ] [ j ] = Integer . parseInt ( line [ p ] ) ;
          Ls [ j ] = Integer . parseInt ( line [ p ] ) ;
        }
      }
      int [ ] old = new int [ P ] ;
      Set < Integer > oldset = new HashSet < Integer > ( ) ;
      Set < Integer > visited = new HashSet < Integer > ( ) ;
      if ( 1 == g [ 0 ] [ 0 ] ) {
        System . out . println ( "Case #" + ( t + 1 ) + ": 0 " + Ls [ 0 ] ) ;
        continue ;
      }
      for ( int i = 0 ;
      i < g [ 0 ] [ 0 ] ;
      i ++ ) {
        oldset . add ( g [ 0 ] [ i ] ) ;
        old [ i ] = new int [ ] {
          g [ 0 ] [ i ] , GSets [ i ] [ 0 ] | gsets [ i ] [ 0 ] }
          ;
        }
        int found = - 1 ;
        int best = - 1 ;
        int bestp = - 1 ;
        HashMap < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
        while ( true ) {
          map . clear ( ) ;
          for ( int j = 0 ;
          