public static int N ( int N , int A , int B ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . next ( ) ;
    int d = Math . min ( B , Math . max ( A , Integer . parseInt ( s ) ) ) ;
    if ( s . equals ( "East" ) ) d *= - 1 ;
    ans += d ;
  }
  if ( ans == 0 ) {
    System . out . println ( "0" ) ;
  }
  else if ( ans < 0 ) {
    System . out . println ( "East" + ( - ans ) ) ;
  }
  else {
    System . out . println ( "West" + ans ) ;
  }
  return ans ;
}
