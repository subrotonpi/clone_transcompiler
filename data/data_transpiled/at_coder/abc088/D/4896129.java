@ WorkerThread public static void bfs ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int black = 0 , white = 0 ;
  List < List < Integer >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    s . set ( i , Collections . singletonList ( input . nextLine ( ) ) ) ;
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s . get ( i ) . get ( j ) . equals ( "." ) ) {
        white ++ ;
      }
      else {
        black ++ ;
      }
    }
  }
  new Thread ( new Runnable ( ) {
    @ Override public void run ( ) {
      int ans , checked ;
      while ( ! que . isEmpty ( ) ) {
        List < Integer > xy = que . poll ( ) ;
        if ( xy . get ( 0 ) == w - 1 && xy . get ( 1 ) == h - 1 ) {
          ans = checked . get ( xy . get ( 1 ) ) . get ( xy . get ( 0 ) ) ;
          return ;
        }
        for ( int i = - 1 ;
        i < 2 ;
        i ++ ) {
          for ( int j = - 1 ;
          j < 2 ;
          j ++ ) {
            if ( i == j || i == - j ) continue ;
            if ( 0 <= xy . get ( 0 ) + i && i < w && 0 <= xy . get ( 1 ) + j && j < h ) {
              if ( checked . get ( xy . get ( 1 ) + j ) . get ( xy . get ( 0 ) + i ) == - 1 && s . get ( xy . get ( 1 ) + j ) . get ( xy . get ( 0 ) + i ) . equals ( "." ) ) {
                checked . get ( xy . get ( 1 ) + j ) . set ( xy . get ( 0 ) + i ) ;
                que . offer ( new Integer ( xy . get ( 0 ) + i ) ) ;
              }
            }
          }
        }
      }
    }
  }
  ) . start ( ) ;
  que . clear ( ) ;
  ans = - 1 ;
  checked = new ArrayList < > ( ) ;
  checked . get ( 0 ) . set ( 0 ) ;
  que . offer ( new Integer ( 0 ) ) ;
  bfs ( ) ;
  if ( ans != - 1 ) {
    System . out . println ( white - ans - 1 ) ;
  }
  