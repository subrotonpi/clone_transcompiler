public static double n ( double a , double b ) {
  /*if (a < 0) return a; else if (b > 0) return b; else return a;*/
  double ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . next ( ) ;
    String d = input . next ( ) ;
    int i = Integer . parseInt ( d ) ;
    ans += ( s . equals ( "East" ) ? 1 : - 1 ) * ( d ) ;
  }
  if ( ans == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( ans >= 0 ? "East " + ans : "West " + ( - ( ans ) ) ) ;
  }
  return ans ;
}
