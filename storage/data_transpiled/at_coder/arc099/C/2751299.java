@ VisibleForTesting static int [ ] [ ] createG0 ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > [ ] G0 = new Set [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    G0 [ i ] = new Set < Integer > ( ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      G0 [ a - 1 ] . add ( b - 1 ) ;
      G0 [ b - 1 ] . add ( a - 1 ) ;
    }
  }
  Set < Integer > [ ] G = new Set [ N ] ;
  for ( int g : G0 ) {
    G [ g ] = A [ g ] ;
  }
  int b = 1 << ( N / 2 ) ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( c [ i ] != - 1 ) continue ;
    int p = 0 ;
    int s = 0 ;
    Deque < Integer > que = new LinkedList < Integer > ( ) ;
    que . add ( i ) ;
    c [ i ] = 0 ;
    while ( que . isEmpty ( ) ) {
      int v = que . poll ( ) ;
      s ++ ;
      if ( c [ v ] == 0 ) {
        p ++ ;
      }
      for ( int w : G [ v ] ) {
        if ( c [ w ] == - 1 ) {
          c [ w ] = c [ v ] ^ 1 ;
          que . add ( w ) ;
        }
        else if ( c [ w ] == c [ v ] ) {
          System . out . println ( - 1 ) ;
          exit ( 0 ) ;
        }
      }
    }
    b = ( b >>> ( s - 1 ) ) ;
  }
  return c ;
}
