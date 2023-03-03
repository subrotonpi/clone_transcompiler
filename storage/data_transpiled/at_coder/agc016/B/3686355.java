@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( String s : input . split ( " " ) ) {
    A . add ( Integer . parseInt ( s ) ) ;
  }
  Map < Integer , Integer > ctr = new HashMap < > ( A ) ;
  if ( ctr . size ( ) >= 3 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  if ( ctr . size ( ) == 1 ) {
    int k = Collections . binarySearch ( A , 0 , ctr . get ( 0 ) ) ;
    if ( k == 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else if ( N <= k ) {
      System . out . println ( "No" ) ;
    }
    else if ( N >= 2 * k ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( k == N - 1 ? "Yes" : "No" ) ;
    }
  }
  else {
    final int k1 = ctr . keySet ( ) . iterator ( ) . next ( ) ;
    final int v1 = ctr . get ( k1 ) ;
    final int k2 = ctr . keySet ( ) . iterator ( ) . next ( ) ;
    final int v2 = ctr . keySet ( ) . iterator ( ) . next ( ) ;
    if ( k2 - k1 != 1 || k2 >= N ) {
      System . out . println ( "No" ) ;
    }
    else if ( v1 > k1 ) {
      System . out . println ( "No" ) ;
    }
    else {
      System . out . println ( v2 / 2 + v1 >= k2 ? "Yes" : "No" ) ;
    }
  }
  return A ;
}
