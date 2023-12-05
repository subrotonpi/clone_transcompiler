static void print ( ) {
  N = list ( input ) ;
  int ans = Integer . parseInt ( N . get ( 0 ) ) - 1 ;
  ans += 9 * ( N . size ( ) - 1 ) ;
  int ans2 = 0 ;
  for ( String n : N ) ans2 += Integer . parseInt ( n ) ;
  System . out . println ( max ( ans , ans2 ) ) ;
}
