static final Map < Integer , Integer > getMemory ( int total , int choose ) throws IOException {
  final Map < Integer , Integer > cmem = new HashMap < Integer , Integer > ( ) ;
  {
    if ( total < choose ) {
      return 0 ;
    }
    if ( cmem . containsKey ( new Integer ( total ) ) ) {
      return cmem . get ( new Integer ( total ) ) ;
    }
    int c = ( Math . factorial ( total ) / Math . factorial ( choose ) / Math . factorial ( total - choose ) ) % 100003 ;
    cmem . put ( new Integer ( total ) , c ) ;
    return c ;
  }
  final Map < Integer , Integer > mem = new HashMap < Integer , Integer > ( ) ;
  COUNTER = 0 ;
  {
    int n ;
    int rank ;
    int total ;
    int i ;
    int n ;
    int rank ;
    int i ;
    total ;
    if ( rank == 1 ) {
      return 1 ;
    }
    if ( ( n = mem . get ( new Integer ( rank ) ) ) != null ) {
      return mem . get ( new Integer ( rank ) ) ;
    }
    total = 0 ;
    for ( i = 1 ;
    i < rank ;
    i ++ ) {
      COUNTER ++ ;
      total += C ( n - rank - 1 , rank - i - 1 ) * g ( rank , i ) ;
    }
    mem . put ( new Integer ( rank ) , total ) ;
    return total % 100003 ;
  }
}
