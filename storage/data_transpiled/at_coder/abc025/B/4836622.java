public static int N ( int N , int A , int B ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    d = Integer . parseInt ( input . nextLine ( ) ) ;
    d = Math . max ( Math . min ( d , B ) , A ) ;
    if ( s . equals ( "West" ) ) d *= - 1 ;
    ans += d ;
  }
  if ( ans == 0 ) {
    System . out . println ( ans ) ;
  }
  else if ( ans < 0 ) {
    System . out . println ( "West" + Math . abs ( ans ) ) ;
  }
  else {
    System . out . println ( "East" + ans ) ;
  }
  return ans ;
}
