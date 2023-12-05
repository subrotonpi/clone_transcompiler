static final int [ ] [ ] solve ( int [ ] [ ] data ) {
  for ( int testCase = 1 ;
  testCase <= Integer . MAX_VALUE ;
  testCase ++ ) {
    final int P = Integer . parseInt ( System . console ( testCase ) [ 0 ] [ 0 ] ) ;
    final int K = Integer . parseInt ( System . console ( testCase ) [ 0 ] [ 1 ] ) ;
    final int L = Integer . parseInt ( System . console ( testCase ) [ 0 ] [ 1 ] ) ;
    final List < List < Integer >> list = Stream . of ( Arrays . asList ( data ) ) . limit ( L ) . collect ( Collectors . toList ( ) ) ;
    Collections . sort ( list , new Comparator < List < Integer >> ( ) {
      @ Override public int compare ( final List < Integer > z ) {
        return z . get ( 0 ) . compareTo ( z . get ( 0 ) ) ;
      }
    }
    ) ;
    final int [ ] assigned = new int [ K ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      assigned [ i ] = 0 ;
    }
    int k = 0 ;
    int press = 0 ;
    for ( List < Integer > d : list ) {
      assigned [ k ] ++ ;
      if ( ( assigned [ k ] > P ) && ( press > P ) ) break ;
      press += d . get ( 0 ) * assigned [ k ] ;
      k ++ ;
      if ( ( k >= assigned . length ) && ( press > P ) ) k = 0 ;
    }
    if ( ( assigned [ k ] > P ) && ( press > P ) ) System . out . println ( "Case #" + testCase + ": Impossible" ) ;
    else System . out . println ( "Case #" + testCase + ": " + press ) ;
  }
  return null ;
}
