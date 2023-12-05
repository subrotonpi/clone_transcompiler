public static int N ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i <= t . length - 1 ;
  i ++ ) {
    ans += Math . min ( t [ i + 1 ] - t [ i ] , T ) ;
  }
  ans += T ;
  System . out . println ( ans ) ;
  return T ;
}
