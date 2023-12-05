public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  List < Integer > B = A . stream ( ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
  int n = B . size ( ) ;
  /* Counter of the elements of the array */
  Counter < Integer > counter = new Counter < Integer > ( ) ;
  for ( int a : A ) {
    if ( ( counter . containsKey ( a ) ) ) {
      counter . increment ( a ) ;
    }
    else {
      counter . increment ( a ) ;
    }
  }
  int ans = 0 ;
  if ( ( n > K ) && ( n > K ) ) {
    Map < Integer , Integer > dict = counter . get ( n ) ;
    int count = 1 ;
    for ( Map . Entry < Integer , Integer > e : dict . entrySet ( ) ) {
      if ( ( count > K ) && ( e . getValue ( ) ) ) {
        ans += e . getValue ( ) ;
        count ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
