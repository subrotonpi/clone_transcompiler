public static int H = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( H % 3 == 0 || W % 3 == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    int ans = Math . min ( H , W ) ;
    for ( int i = 0 ;
    i <= 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j <= 1 ;
      j ++ ) {
        int a = ( H / 3 ) + i ;
        int b = ( W / 2 ) + j ;
        int tmp = Math . max ( a * W , ( H - a ) * b , ( H - a ) * ( W - b ) ) - Math . min ( a * W , ( H - a ) * b , ( H - a ) * ( W - b ) ) ;
        ans = Math . min ( ans , tmp ) ;
      }
    }
    for ( int i = 0 ;
    i <= 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j <= 1 ;
      j ++ ) {
        int a = ( W / 3 ) + i ;
        int b = ( H / 2 ) + j ;
        int tmp = Math . max ( a * H , ( W - a ) * b , ( W - a ) * ( H - b ) ) - Math . min ( a * H , ( W - a ) * b , ( W - a ) * ( H - b ) ) ;
        ans = Math . min ( ans , tmp ) ;
      }
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
