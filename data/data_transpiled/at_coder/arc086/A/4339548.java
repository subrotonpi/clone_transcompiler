public static void N ( int N , int K ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final Map < Integer , Integer > a = new LinkedHashMap < Integer , Integer > ( A ) ;
  a . sort ( Comparator . reverseOrder ( ) ) ;
  int k = a . size ( ) ;
  int ans = 0 ;
  int i = 0 ;
  while ( k > K ) {
    ans += a . get ( i ) . intValue ( ) ;
    i ++ ;
    k -- ;
  }
  System . out . println ( ans ) ;
}
