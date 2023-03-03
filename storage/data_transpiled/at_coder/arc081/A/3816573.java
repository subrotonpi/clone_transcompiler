@ VisibleForTesting static LinkedHashMap < Integer , Integer > from ( int [ ] input ) {
  LinkedHashMap < Integer , Integer > map = new LinkedHashMap < > ( ) ;
  int [ ] rec = {
    0 , 0 }
    ;
    int N = Integer . parseInt ( input [ 0 ] ) ;
    List < Integer > A = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A . add ( A . get ( i ) ) ;
    }
    return map ;
  }
  