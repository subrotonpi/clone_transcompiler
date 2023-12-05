@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > lst_a = Lists . newArrayList ( ) ;
  int [ ] lst_imosu = new int [ N + 1 ] ;
  for ( int l = 0 ;
  l < N - K + 1 ;
  l ++ ) {
    int r = l + K ;
    lst_imosu [ l ] ++ ;
    lst_imosu [ r ] -- ;
  }
  List < Integer > lst_ac = Lists . newArrayList ( ) ;
  for ( int a = 0 , i_ac = lst_a ;
  a < N ;
  ++ a ) {
    ans += a * i_ac ;
  }
  System . out . println ( ans ) ;
  return lst_ac ;
}
