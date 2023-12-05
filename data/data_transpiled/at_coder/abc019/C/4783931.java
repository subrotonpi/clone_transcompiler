public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = A . get ( i ) ;
    while ( a % 2 == 0 ) {
      a = a / 2 ;
    }
    A . set ( i , a ) ;
  }
  System . out . println ( Sets . newHashSet ( A ) . size ( ) ) ;
  return N ;
}
