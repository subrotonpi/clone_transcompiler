public static int [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int ans = 10 * 10 ;
  for ( int i = 0 ;
  i < 1 << N ;
  i ++ ) {
    List < Integer > li1 = new ArrayList < Integer > ( ) ;
    List < Integer > li2 = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( ( i >> j & 1 ) == 1 ) ) li1 . add ( t [ j ] ) ;
      else li2 . add ( t [ j ] ) ;
    }
    ans = Math . max ( Math . min ( li1 . size ( ) , li2 . size ( ) ) , ans ) ;
  }
  return ans ;
}
