public static int [ ] [ ] readAllRecords ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N + 1 ] ;
  for ( int a = 1 ;
  a <= N ;
  a ++ ) {
    A [ a ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  LinkedList < Integer > rec = new LinkedList < Integer > ( ) ;
  for ( int a = 0 ;
  a < 30 ;
  a ++ ) {
    int c = 2 * a ;
    if ( c > D ) {
      continue ;
    }
    kaijou . add ( a ) ;
  }
  int [ ] [ ] R = rec . toArray ( ) ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    R [ a ] [ a ] = R [ a ] [ a ] ;
  }
  return R ;
}
