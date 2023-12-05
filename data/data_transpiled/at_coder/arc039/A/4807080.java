public static int convert ( String a , String b ) {
  String sa = Integer . toString ( a ) ;
  String sb = Integer . toString ( b ) ;
  char [ ] digit = new char [ 10 ] ;
  for ( int i = 0 ;
  i <= 10 ;
  i ++ ) {
    digit [ i ] = String . valueOf ( i ) ;
  }
  int ans = - ( 2 * 32 ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < digit . length ;
    j ++ ) {
      if ( i == 0 && j == 0 ) {
        continue ;
      }
      int ta = Integer . parseInt ( sa . substring ( 0 , i ) + digit [ j ] + sa . substring ( i + 1 ) ) ;
      ans = Math . max ( ans , ta - b ) ;
    }
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < digit . length ;
    j ++ ) {
      if ( i == 0 && j == 0 ) {
        continue ;
      }
      int tb = Integer . parseInt ( sb . substring ( 0 , i ) + digit [ j ] + sb . substring ( i + 1 ) ) ;
      ans = Math . max ( ans , a - tb ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
