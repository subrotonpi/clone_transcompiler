@ Sys public static void Solve ( int B , int M ) {
  int MaxM = 1 << B - 2 ;
  if ( MaxM < M ) {
    print ( "IMPOSSIBLE" ) ;
    return ;
  }
  print ( "POSSIBLE" ) ;
  M -- ;
  print ( "0" + "1" ) ;
  for ( int b = 0 ;
  b < B - 2 ;
  b ++ ) {
    print ( "0" + "1" ) ;
    for ( int j = 0 ;
    j < B - b - 3 ;
    j ++ ) {
      print ( "0" + "1" ) ;
      for ( int j = 0 ;
      j < M - b - 3 ;
      j ++ ) {
        print ( "0" + "1" ) ;
        for ( int j = 0 ;
        j < M - b - 3 ;
        j ++ ) {
          print ( "0" + ( j + 2 ) ) ;
        }
        print ( "1" ) ;
        for ( int j = 0 ;
        j < M - b - 3 ;
        j ++ ) {
          print ( "0" + ( j + 1 ) ) ;
        }
        print ( " " ) ;
      }
      print ( "0" ) ;
      return ;
    }
  }
  for ( int T = 0 ;
  T < Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  T ++ ) {
    B = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    B = Integer . parseInt ( B ) ;
    M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    print ( "Case #" + ( T + 1 ) + ":" ) ;
    Solve ( B , M ) ;
  }
}
