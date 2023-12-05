@ VisibleForTesting static String [ ] [ ] graph ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] G = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] [ b ] = b - 1 ;
    G [ b - 1 ] [ a ] = a - 1 ;
  }
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = 0 ;
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  q . add ( 0 ) ;
  int r = 0 ;
  int flag = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) q . add ( i ) ;
  return X ;
}
