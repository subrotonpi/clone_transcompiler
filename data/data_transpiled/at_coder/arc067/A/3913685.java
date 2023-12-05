@ VisibleForTesting static Map < Integer , Integer > solve ( int m ) {
  Map < Integer , Integer > ans = Maps . newHashMap ( ) ;
  int remain = m ;
  for ( int j = 2 ;
  j <= ( int ) Math . sqrt ( m ) ;
  j ++ ) {
    if ( remain % j == 0 ) {
      int count = 0 ;
      while ( remain % j == 0 ) {
        count ++ ;
        remain /= j ;
      }
      ans . put ( j , count ) ;
    }
  }
  if ( remain != 1 ) {
    ans . put ( remain , 1 ) ;
  }
  return ans ;
}
