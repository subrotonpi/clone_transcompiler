public static int s = Integer . parseInt ( input ) {
  boolean syo = true ;
  int ans = 1 ;
  while ( syo ) {
    if ( s == 4 || s == 1 || s == 2 ) {
      System . out . println ( ans + 3 ) ;
      break ;
    }
    if ( s % 2 == 1 ) {
      s = s * 3 + 1 ;
    }
    else {
      s /= 2 ;
    }
    ans ++ ;
  }
  return ans ;
}
