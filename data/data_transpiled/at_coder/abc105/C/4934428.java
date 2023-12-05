public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  if ( N == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    String ans = "" ;
    int x = 0 ;
    int keta = 0 ;
    while ( x != N ) {
      if ( ( N - x ) % 2 * ( keta + 1 ) == 0 ) {
        ans = "0" + ans ;
      }
      else {
        ans = "1" + ans ;
        x += ( - 2 ) * keta ;
      }
      keta ++ ;
    }
    System . out . println ( ans ) ;
  }
}
