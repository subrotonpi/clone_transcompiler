@ MoreIO public static String input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  int [ ] a = list ( n ) ;
  return a [ 0 ] % gcd ( a ) == 0 && max ( a ) >= k ? "POSSIBLE" : "IMPOSSIBLE" ;
}
