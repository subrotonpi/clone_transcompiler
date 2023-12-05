@ MoreIO public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = list ( N ) ;
  int g = gcd ( a ) ;
  if ( max ( a ) >= K && K % g == 0 ) {
    System . out . println ( "POSSIBLE" ) ;
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
}
