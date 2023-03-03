static final int [ ] inpl ( ) {
  return Arrays . stream ( input . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = inpl ( ) ;
  int A = inpl ( ) ;
  int B = inpl ( ) ;
  boolean rev = ( A < B ) ;
  B = new Integer ( B ) ;
  A = new Integer ( A ) ;
  if ( B < - ( - N / A ) || A + B - 1 > N ) {
    System . out . println ( - 1 ) ;
    System . exit ( 0 ) ;
  }
  List < Integer > st = new LinkedList < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    st . add ( i ) ;
  }
  if ( B < 1 ) {
    st . add ( B ) ;
  }
  return st . toArray ( ) ;
}
