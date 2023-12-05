public static int input ( ) {
  int ans = 0 ;
  for ( char c : S ) {
    if ( c == '+' ) {
      ans ++ ;
    }
    else {
      ans -- ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
