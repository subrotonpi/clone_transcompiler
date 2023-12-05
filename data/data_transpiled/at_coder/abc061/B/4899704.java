@ VisibleForTesting static LinkedHashMap < Integer , List < Integer >> map ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) L . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  LinkedHashMap < Integer , List < Integer >> X = new LinkedHashMap < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X . put ( i + 1 , new ArrayList < > ( ) ) ;
  for ( int a = 0 ;
  a < L . size ( ) ;
  a ++ ) {
    int b = L . get ( a ) ;
    X . put ( a , new ArrayList < > ( ) ) ;
    X . put ( b , new ArrayList < > ( ) ) ;
    X . put ( b , new ArrayList < > ( ) ) ;
  }
  for ( final Map . Entry < Integer , List < Integer >> x : X . entrySet ( ) ) {
    System . out . println ( x . getValue ( ) . size ( ) ) ;
  }
  return X ;
}
