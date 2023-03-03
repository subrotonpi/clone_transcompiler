public static int N = Integer . parseInt ( input ) {
  int [ ] a = Ints . fromCharAtLeast ( input . nextInt ( ) ) ;
  int dp = 1 ;
  int half = ( Integer . SIZE + 1 ) / 2 ;
  for ( int n : a ) dp |= dp << n ;
  dp >>= half ;
  for ( int i = 0 ;
  i < 1000000000 ;
  i ++ ) {
    if ( ( dp & 1 ) != 0 ) {
      System . out . println ( half + i ) ;
      break ;
    }
    dp >>= 1 ;
  }
  return dp ;
}
