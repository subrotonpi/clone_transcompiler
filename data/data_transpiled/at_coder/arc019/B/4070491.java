public static int input ( ) {
  int length = A . length ( ) ;
  int ans = 0 ;
  int diff = 0 ;
  if ( length != 1 ) {
    for ( int i = 0 ;
    i < length / 2 ;
    i ++ ) {
      if ( A [ i ] != A [ length - 1 - i ] ) {
        diff ++ ;
      }
    }
    ans = 25 * length ;
    if ( diff == 0 && length % 2 == 1 ) {
      ans -= 25 ;
    }
    else if ( diff == 1 ) {
      ans -= 2 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
