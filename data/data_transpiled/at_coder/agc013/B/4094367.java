@ VisibleForTesting static Collection < Integer > readAllNodes ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > [ ] G = new Set [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    G [ a ] . add ( b ) ;
    G [ b ] . add ( a ) ;
  }
  Queue < Integer > q = new ArrayDeque < > ( ) ;
  q . add ( 0 ) ;
  int [ ] used = new int [ N ] ;
  used [ N ] = 1 ;
  while ( true ) {
    int flag = 0 ;
    a = q . get ( ) ;
    for ( int i = 0 ;
    i < used . length ;
    i ++ ) {
      q . add ( i ) ;
      used [ i ] = 1 ;
      flag ++ ;
    }
  }
}
