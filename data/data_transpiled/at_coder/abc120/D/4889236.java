public static int [ ] [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] bridge = new int [ M ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    bridge [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      bridge [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    }
  }
  int [ ] [ ] nod = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    nod [ i ] = new int [ N ] ;
  }
  int e = 0 ;
  int totale = ( int ) ( N * ( N - 1 ) / 2 ) ;
  /* joint a and b */
  int na = nod [ i ] [ 0 ] ;
  int nb = nod [ i ] [ 1 ] ;
  if ( na == nb ) {
    return e ;
  }
  else {
    e += nod [ na ] [ 1 ] . length * nod [ nb ] [ 1 ] . length ;
    if ( na < nb ) {
      nod [ na ] [ 1 ] . addAll ( nod [ nb ] [ 1 ] ) ;
      for ( int j = 0 ;
      j < nod [ nb ] [ 1 ] . length ;
      j ++ ) {
        nod [ i ] [ 0 ] = na ;
      }
    }
    else {
      nod [ nb ] [ 1 ] . addAll ( nod [ na ] [ 1 ] ) ;
      for ( int j = 0 ;
      j < nod [ na ] [ 1 ] . length ;
      j ++ ) {
        nod [ na ] [ j ] = nb ;
      }
    }
    return e ;
  }
  int [ ] [ ] ans = new int [ M ] [ M ] ;
  for ( int i = M - 1 ;
  i >= 0 ;
  i -- ) {
    ans [ i ] = totale - e ;
    e = joint ( bridge [ i ] [ 0 ] , bridge [ i ] [ 1 ] , e ) ;
  }
  for ( int i = M - 1 ;
  i >= 0 ;
  i -- ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
