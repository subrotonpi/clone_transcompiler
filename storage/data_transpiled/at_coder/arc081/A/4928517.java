@ VisibleForTesting static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  Map < Integer , Integer > c = new HashMap < > ( A ) ;
  List < Integer > op = new ArrayList < > ( ) ;
  for ( Map . Entry < Integer , Integer > a : c . entrySet ( ) ) {
    for ( int i = 0 ;
    i < a . getValue ( ) / 2 ;
    i ++ ) {
      op . add ( a . getKey ( ) ) ;
    }
  }
  Collections . sort ( op , Collections . reverseOrder ( ) ) ;
  if ( op . size ( ) < 2 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( op . get ( 0 ) * op . get ( 1 ) ) ;
  }
}
