static final int [ ] [ ] G ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  int [ ] [ ] H = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    G [ i ] [ i ] -- ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] [ b - 1 ] -- ;
    G [ b - 1 ] [ a - 1 ] -- ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( G [ i ] [ j ] == 1 ) H [ i ] [ j ] ++ ;
    }
  }
  int [ ] [ ] A = new int [ N ] [ N ] ;
  int k = 0 ;
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  int [ ] reached = new int [ N ] ;
  int [ ] dist = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( G [ i ] [ j ] == 1 ) H [ i ] [ j ] = j ;
    }
  }
  int [ ] [ ] A = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] [ 0 ] = 1 ;
  k = 0 ;
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  int [ ] reached = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) reached [ i ] = 0 ;
  dist [ i ] = - 1 ;
  while ( ( ! ( q . isEmpty ( ) ) ) && ( q . poll ( ) != null ) ) {
    int r = q . poll ( ) ;
    A [ k ] [ dist [ r ] ] = r ;
    for ( int p : H [ r ] ) {
      if ( reached [ p ] == 0 ) {
        q . add ( p ) ;
        dist [ p ] = ( dist [