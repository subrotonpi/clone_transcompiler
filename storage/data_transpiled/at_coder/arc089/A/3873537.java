public static int N = Integer . parseInt ( input ) {
  String [ ] txy = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) txy [ i ] = input . nextLine ( ) ;
  int [ ] nowPos = {
    0 , 0 }
    ;
    int nowTime = 0 ;
    boolean failFlag = false ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int t = Integer . parseInt ( txy [ i ] ) ;
      int x = Integer . parseInt ( txy [ i ] ) ;
      int y = Integer . parseInt ( txy [ i ] ) ;
      if ( ( x + y ) % 2 != t % 2 ) failFlag = true ;
      int distance = ( Math . abs ( nowPos [ 0 ] - x ) + Math . abs ( nowPos [ 1 ] - y ) ) ;
      if ( distance > t ) failFlag = true ;
      if ( failFlag ) {
        System . out . println ( "No" ) ;
        exit ( ) ;
      }
    }
    System . out . println ( "Yes" ) ;
    return 0 ;
  }
  