public static int ans ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < 12 ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    if ( s . indexOf ( 'r' ) > 0 ) {
      ans ++ ;
    }
  }
  return ans ;
}
