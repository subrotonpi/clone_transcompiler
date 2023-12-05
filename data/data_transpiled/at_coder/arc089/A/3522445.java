public static int N = Integer . parseInt ( input ) {
  int [ ] list = new int [ N ] ;
  list [ 0 ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    list [ i ] = new int [ ] {
      t , x , y }
      ;
    }
    boolean b ;
    boolean ret = true ;
    for ( int i = 0 ;
    i <= N ;
    i ++ ) {
      int t1 = list [ i ] ;
      int x1 = list [ i ] ;
      int y1 = list [ i + 1 ] ;
      int t2 = list [ i + 2 ] ;
      int x2 = list [ i + 3 ] ;
      int y2 = list [ i + 4 ] ;
      b = isReachable ( t1 , x1 , y1 , t2 , x2 , y2 ) ;
      if ( b == false ) {
        ret = false ;
        break ;
      }
    }
    if ( ret == true ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
    return ret ;
  }
  