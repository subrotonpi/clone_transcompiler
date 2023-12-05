public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int C = Integer . parseInt ( input . nextLine ( ) ) ;
    List < List < String >> B = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      B . add ( new ArrayList < > ( input . nextLine ( ) ) ) ;
    }
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      String x = "" ;
      for ( int c = 0 ;
      c < C ;
      c ++ ) {
        if ( B . get ( r ) . get ( c ) != "?" ) {
          x = B . get ( r ) . get ( c ) ;
          break ;
        }
      }
      if ( x != "" ) {
        for ( int c = 0 ;
        c < C ;
        c ++ ) {
          if ( B . get ( r ) . get ( c ) == "?" ) {
            B . set ( r , c , x ) ;
          }
          else {
            x = B . get ( r ) . get ( c ) ;
          }
        }
      }
    }
    int x = - 1 ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      if ( B . get ( r ) . get ( 0 ) != "?" ) {
        x = r ;
        break ;
      }
    }
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      if ( B . get ( r ) . get ( 0 ) == "?" ) {
        for ( int c = 0 ;
        c < C ;
        c ++ ) {
          B . set ( r , c , B . get ( x ) . get ( c ) ) ;
        }
      }
      else {
        x = r ;
      }
    }
    System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      System . out . println ( B . get ( r ) ) ;
    }
  }
}
