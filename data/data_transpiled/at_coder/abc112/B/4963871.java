public static int N ( int N , int T ) {
  int num = 1001 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( T >= t && num >= c ) {
      num = c ;
    }
  }
  if ( num != 1001 ) {
    System . out . println ( num ) ;
  }
  else {
    System . out . println ( "TLE" ) ;
  }
  return num ;
}
