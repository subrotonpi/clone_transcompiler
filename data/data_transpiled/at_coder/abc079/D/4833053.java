static final class Edge {
  int i ;
  int j ;
  int i ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Edge > G = new LinkedList < Edge > ( ) ;
  for ( i = 0 ;
  i < 10 ;
  i ++ ) {
    G . add ( new Edge ( i , i ) ) ;
  }
  for ( i = 0 ;
  i < 10 ;
  i ++ ) {
    int [ ] tmp = new int [ N ] ;
    for ( j = 0 ;
    j < tmp . length ;
    j ++ ) {
      tmp [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    for ( i = 0 ;
    i < tmp . length ;
    i ++ ) {
      if ( ( i != j ) && ( ( i != - 1 ) || ( i != o ) ) ) {
        G . get ( i ) . add ( new Edge ( j , tmp [ j ] ) ) ;
      }
    }
  }
  int [ ] ans = new int [ 10 ] ;
  for ( j = 0 ;
  j < N ;
  j ++ ) {
    int [ ] tmp = new int [ N ] ;
    for ( i = 0 ;
    i < tmp . length ;
    i ++ ) {
      tmp [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    for ( i = 0 ;
    i < tmp . length ;
    i ++ ) {
      if ( ( i != - 1 ) && ( ( i != o ) || ( i != o ) ) ) {
        ans [ i ] ++ ;
      }
    }
  }
  return new Edge ( ) {
    @ Override public List < Edge > getEdges ( ) {
      double [ ] d = new double [ 10 ] ;
      for ( i = 0 ;
      i < d . length ;
      i ++ ) {
        d [ i ] = Double . POSITIVE_INFINITY ;
      }
      d [ o ] = 0 ;
    }
  }
  ;
}
