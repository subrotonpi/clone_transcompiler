public static int bPaintLine ( int N , int R , String S ) {
  try {
    int ans = Math . max ( S . length ( ) - R + 1 , 0 ) ;
    StringBuilder sb = new StringBuilder ( S ) ;
    while ( sb . indexOf ( '.' ) != 0 ) {
      ans ++ ;
      int idx = sb . indexOf ( '.' ) ;
      for ( int j = idx ;
      j < idx + R ;
      j ++ ) {
        if ( j >= N ) break ;
        sb . setCharAt ( j , 'o' ) ;
      }
    }
    return ans ;
  }
  catch ( NumberFormatException e ) {
    return 0 ;
  }
}
