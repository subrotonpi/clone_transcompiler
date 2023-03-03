public static int n ( ) {
  int pre = 0 ;
  int ans = 0 ;
  for ( int i : map . get ( ) . split ( " " ) ) {
    if ( i < pre ) {
      ans += pre - i ;
    }
    pre = i ;
  }
  else {
    System . out . println ( ans + i ) ;
  }
  return ans ;
}
