public static List < Integer > inpl ( ) {
  return Arrays . asList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  @ SuppressWarnings ( "unchecked" ) Map < Integer , Integer > A = inpl ( ) ;
  @ SuppressWarnings ( "rawtypes" ) Map < Integer , Integer > B = inpl ( ) ;
  @ SuppressWarnings ( "rawtypes" ) Map < Integer , Integer > C = inpl ( ) ;
  @ SuppressWarnings ( "rawtypes" ) Map < Integer , Integer > D = inpl ( ) ;
  @ SuppressWarnings ( "rawtypes" ) Map < Integer , Integer > H = new HashMap < Integer , Integer > ( ) ;
  H . put ( new Integer ( 0 ) , 1 ) ;
  List < Integer > x = new ArrayList < Integer > ( ) ;
  x . add ( new Integer ( 100 * A ) ) ;
  x . add ( new Integer ( 100 * B ) ) ;
  x . add ( new Integer ( 0 ) ) ;
  x . add ( new Integer ( 0 ) ) ;
  boolean flag = true ;
  while ( flag ) {
    flag = false ;
    for ( Integer i : x ) {
      int i = i + 1 ;
      int j = H . size ( ) ;
      int ni = H . get ( i ) ;
      int ni = H . get ( j ) ;
      int nj = H . get ( ni ) ;
      if ( ni < n ) {
        ni = H . get ( j ) ;
        nj = H . get ( ni ) ;
      }
    }
  }
  return x ;
}
