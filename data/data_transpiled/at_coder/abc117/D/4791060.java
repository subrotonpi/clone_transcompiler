@ VisibleForTesting static int [ ] getSortedBinaries ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > A = Lists . newArrayList ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    A . add ( Integer . toBinaryString ( Integer . parseInt ( s ) ) ) ;
  }
  int l = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l = Math . max ( l , A . get ( i ) . length ( ) ) ;
  }
  Map < Integer , Integer > count = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < A . get ( i ) . length ( ) ;
    j ++ ) {
      if ( A . get ( i ) . charAt ( A . get ( i ) . length ( ) - j - 1 ) == '1' ) {
        count . put ( j , 1 ) ;
      }
    }
  }
  l = Math . max ( count . keySet ( ) , N ) ;
  /*if (A.isEmpty()) {
  return 0;
  }*/
  if ( ! A . contains ( "0" ) ) {
    int res = 0 ;
    for ( int i = 0 ;
    i < A . size ( ) ;
    i ++ ) {
      res += Math . max ( count . get ( i ) , N - count . get ( i ) ) * 2 * 2 * i ;
    }
    return res ;
  }
  if ( A . get ( 0 ) . equals ( "1" ) ) {
    return Math . max ( rec ( "1" * ( A . size ( ) - 1 ) ) + count . get ( A . size ( ) - 1 ) * 2 * 2 * ( A . size ( ) - 1 ) , rec ( A . subList ( 1 , A . size ( ) ) ) + ( N - count . get ( A . size ( ) - 1 ) ) * 2 * 2 * ( A . size ( ) - 1 ) ) ;
  }
  else {
    return rec ( A . subList ( 1 , A . size ( ) ) + count . get ( A . size ( ) - 1 ) * 2 * 2 * ( A . size ( ) - 1 ) ) ;
  }
}
