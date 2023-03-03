public static int M = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int k : R ) {
    l . add ( k ) ;
  }
  Collections . sort ( l ) ;
  int r = l . size ( ) ;
  int c = 0 ;
  for ( int rr : r ) {
    c = ( c + rr ) / 2 ;
  }
  System . out . println ( c ) ;
  return c ;
}
