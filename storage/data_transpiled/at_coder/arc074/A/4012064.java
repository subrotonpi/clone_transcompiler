public static int H = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( H % 3 == 0 || W % 3 == 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int ans = Math . min ( H , W ) ;
  for ( int i = 1 ;
  i < W ;
  i ++ ) {
    int a = i * H ;
    int b ;
    int c ;
    int tmp = Math . max ( a , b ) ;
    if ( H % 2 != 0 ) {
      b = ( W - i ) * ( H / 2 ) ;
      c = ( W - i ) * ( H / 2 + 1 ) ;
      tmp = Math . max ( a , b ) - Math . min ( a , b ) ;
    }
    else {
      b = ( W - i ) * ( H / 2 ) ;
      tmp = Math . max ( a , b ) - Math . min ( a , b ) ;
    }
    ans = Math . min ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
