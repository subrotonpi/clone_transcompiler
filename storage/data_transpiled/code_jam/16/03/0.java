@ Generates static public void random ( String s , int b ) {
  int n = 0 ;
  for ( int i = s . length ( ) ;
  i < b ;
  i ++ ) {
    n = b * n + ( s . charAt ( i ) - '0' ) ;
  }
  System . out . println ( "Case #1:" ) ;
  n = Integer . parseInt ( readLine ( s ) ) ;
  int q = Integer . parseInt ( readLine ( s ) ) ;
  int M = 1000 ;
  HashSet < String > a = new HashSet < String > ( ) ;
  while ( a . size ( ) < q ) {
    String s = '1' + StringUtil . repeat ( "01" , new int [ ] {
      randrange ( 2 ) }
      , n ) + '1' ;
      if ( a . contains ( s ) ) continue ;
      ArrayList < Integer > l = new ArrayList < Integer > ( ) ;
      for ( int b : xrange ( 2 , 11 ) ) {
        int N = fromBase ( s , b ) ;
        int t = - 1 ;
        for ( int j : xrange ( 2 , M + 1 ) ) {
          if ( j >= N ) break ;
          if ( N % j == 0 ) {
            t = j ;
            break ;
          }
        }
        l . add ( t ) ;
      }
      if ( - 1 == l . size ( ) ) continue ;
      System . out . println ( s + " " + StringUtil . join ( l , " " ) ) ;
      a . add ( s ) ;
    }
    System . out . println ( "Case #2:" ) ;
    n = Integer . parseInt ( readLine ( s ) ) ;
    q = Integer . parseInt ( readLine ( s ) ) ;
    M = 1000 ;
    a . clear ( ) ;
    while ( a . size ( ) < q ) {
      String s = '1' + StringUtil . repeat ( "01" , new int [ ] {
        randrange ( 2 ) }
        , n ) + '1' ;
        if ( a . contains ( s ) ) continue ;
        ArrayList < Integer > l = new ArrayList < Integer > ( ) ;
        for ( int b : xrange ( 2 , 11 ) ) {
          int N = fromBase ( s , b ) ;
          int t = - 1 ;
          for ( int j : xrange ( 2 , M + 1 ) ) {
            if ( j >= N ) break ;
            if ( N % j == 0 ) {
              t = j ;
              break ;
            }
          }
          l . add ( t ) ;
        }
        if ( - 1 == l . size ( ) ) continue ;
        System . out .