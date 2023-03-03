public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( S . get ( 0 ) == Integer . MAX_VALUE / S . size ( ) ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int diff = Integer . MAX_VALUE - Integer . MIN_VALUE ;
    int P = B / diff ;
    int Q = A - Integer . MAX_VALUE * S . get ( 0 ) / S . size ( ) ;
    System . out . println ( P + " " + Q ) ;
  }
  return P ;
}
