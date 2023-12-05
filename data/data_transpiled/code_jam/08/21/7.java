@ Sys public static void Sys ( ) throws Exception {
  int tno = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( tno ) ;
  i ++ ) {
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int A = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int B = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int C = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int D = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int X = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int Y = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] tab = new int [ 9 ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      tab [ X % 3 + 3 * ( Y % 3 ) ] ++ ;
      X = ( A * X + B ) % M ;
      Y = ( C * Y + D ) % M ;
    }
    int res = 0 ;
    for ( int x = 0 ;
    x < 3 ;
    x ++ ) {
      for ( int y = 0 ;
      y < 3 ;
      y ++ ) {
        int z = tab [ x + 3 * y ] ;
        res += z * ( z - 1 ) * ( z - 2 ) / 6 ;
      }
    }
    for ( int x = 0 ;
    x < 3 ;
    x ++ ) {
      res += tab [ x ] * tab [ x + 3 ] * tab [ x + 6 ] ;
    }
    for ( int y = 0 ;
    y < 3 ;
    y ++ ) {
      res += tab [ 3 * y ] * tab [ 3 * y + 1 ] * tab [ 3 * y + 2 ] ;
    }
    int [ ] perm = {
      ( 0 , 1 , 2 ) , ( 0 , 2 , 1 ) , ( 1 , 0 , 2 ) , ( 1 , 2 , 0 ) , ( 2 , 0 , 1 ) , ( 2 , 1 , 0 ) }
      ;
      for ( int [ ] per : perm ) {
        res += tab [ 0 + 3 * per [ 0 ] ] * tab [ 1 + 3 * per [ 1 ] ] * tab [ 2 + 3 * per [ 2 ] ] ;
        