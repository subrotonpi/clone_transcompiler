public static int input ( ) {
  int ans = 0 ;
  for ( char s : S ) {
    if ( s == '+' ) {
      ans ++ ;
    }
    else {
      ans -- ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
