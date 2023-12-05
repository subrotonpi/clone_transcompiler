@ VisibleForTesting static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  List < Map . Entry < Integer , Integer >> one = new ArrayList < > ( A . subList ( 0 , 2 ) . entrySet ( ) ) ;
  List < Map . Entry < Integer , Integer >> two = new ArrayList < > ( A . subList ( 1 , 2 ) . entrySet ( ) ) ;
  if ( one . get ( 0 ) . getKey ( ) == two . get ( 0 ) . getKey ( ) ) {
    System . out . println ( C * Math . min ( N - one . get ( 0 ) . getValue ( ) - two . get ( 1 ) . getValue ( ) , N - one . get ( 1 ) . getValue ( ) - two . get ( 0 ) . getValue ( ) ) ) ;
  }
  else {
    System . out . println ( C * ( N - one . get ( 0 ) . getValue ( ) - two . get ( 0 ) . getValue ( ) ) ) ;
  }
}
