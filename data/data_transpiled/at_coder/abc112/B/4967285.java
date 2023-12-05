public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int l = Integer . parseInt ( input ) ;
  int ans = 999999 ;
  for ( ;
  n > 0 ;
  n -- ) {
    int c = Integer . parseInt ( input ) ;
    int t = Integer . parseInt ( input ) ;
    if ( t <= l ) {
      if ( c < ans ) {
        ans = c ;
      }
    }
  }
  if ( ans == 999999 ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( ans ) ;
  }
}
