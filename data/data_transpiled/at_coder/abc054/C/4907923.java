@ VisibleForTesting static Iterable < Integer > permutations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > E = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = ( Integer ) input . nextLine ( ) ;
    int b = ( Integer ) input . nextLine ( ) ;
    E . add ( new Integer ( a ) ) ;
  }
  int [ ] V = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    V [ i ] = i + 1 ;
  }
  int oneStrikeCnt = 0 ;
  for ( int [ ] vertexs : permutations ( V ) ) {
    if ( vertexs [ 0 ] != 1 ) {
      continue ;
    }
    boolean oneStrike = true ;
    for ( int vertexIndex = 0 ;
    vertexIndex < vertexs . length - 1 ;
    vertexIndex ++ ) {
      boolean flag = false ;
      for ( int i = 0 ;
      i < M ;
      i ++ ) {
        int a = E . get ( i ) ;
        int b = E . get ( i ) ;
        if ( ( a == vertexs [ vertexIndex ] && b == vertexs [ vertexIndex + 1 ] ) || ( a == vertexs [ vertexIndex + 1 ] && b == vertexs [ vertexIndex ] ) ) {
          flag = true ;
          break ;
        }
      }
      if ( ! flag ) {
        oneStrike = false ;
        break ;
      }
    }
    if ( oneStrike ) {
      oneStrikeCnt ++ ;
    }
  }
  return E ;
}
