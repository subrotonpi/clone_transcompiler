public static int [ ] getDoubleArray ( String a , String b ) {
  int [ ] ans = new int [ 10 ] ;
  int A = Integer . parseInt ( a ) ;
  int B = Integer . parseInt ( b ) ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    a = Integer . parseInt ( a ) ;
    b = Integer . parseInt ( b ) ;
  }
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    a = Integer . parseInt ( i ) ;
    int A1 = Integer . parseInt ( a [ 1 ] + a [ 2 ] ) ;
    for ( int j = 0 ;
    j < 10 ;
    j ++ ) {
      a = Integer . parseInt ( j ) ;
      int A2 = Integer . parseInt ( a [ 0 ] + a [ 1 ] + a [ 2 ] ) ;
      int A3 = Integer . parseInt ( a [ 0 ] + a [ 1 ] + j ) ;
      ans = Math . max ( ans , A1 - B , A2 - B , A3 - B ) ;
    }
  }
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    a = Integer . parseInt ( a ) ;
    int B1 = Integer . parseInt ( i + b [ 1 ] + b [ 2 ] ) ;
    for ( int j = 0 ;
    j <= 10 ;
    j ++ ) {
      a = Integer . parseInt ( j ) ;
      int B2 = Integer . parseInt ( b [ 0 ] + j + b [ 2 ] ) ;
      int B3 = Integer . parseInt ( b [ 0 ] + b [ 1 ] + j ) ;
      ans = Math . max ( ans , A - B1 , A - B2 , A - B3 ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
