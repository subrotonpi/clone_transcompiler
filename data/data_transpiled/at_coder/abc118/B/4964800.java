public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > KA = null ;
  List < String > a = null ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    KA = Collections . singletonList ( input . nextLine ( ) ) ;
    List < String > A = KA . subList ( 1 , KA . size ( ) ) ;
    a . addAll ( A ) ;
  }
  for ( int j = 1 ;
  j <= M ;
  j ++ ) {
    if ( a . indexOf ( j ) == N ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
