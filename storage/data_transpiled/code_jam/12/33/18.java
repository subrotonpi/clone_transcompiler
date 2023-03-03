static int S ( int i , int j , int r ) {
  int c ;
  int [ ] As ;
  int [ ] Bs ;
  int result ;
  Integer key = new Integer ( i ) ;
  if ( ( key = TABLE . get ( key ) ) != null ) return TABLE . get ( key ) ;
  if ( A . length == i ) {
    if ( r == 0 || r > 0 ) {
      TABLE . put ( key , 0 ) ;
      return 0 ;
    }
    final int nr = r ;
    final int tr = r ;
    int s = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    assert 2 * N == M ;
    assert s == As [ 2 * N ] ;
    Bs = Arrays . asList ( As [ 2 * N ] ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      Bs [ i ] = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    }
    result = Math . min ( s , nr ) ;
    TABLE . put ( key , val ) ;
    return result ;
  }
  if ( B . length == j ) {
    if ( r == 0 || r > 1 ) {
      TABLE . put ( key , 0 ) ;
      return 0 ;
    }
    final int nr = r ;
    final int tr = r ;
    int s = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Bs [ i ] = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    }
    result = Math . min ( s , nr ) ;
    TABLE . put ( key , val ) ;
    return result ;
  }
  final int n1 = A [ i ] ;
  final int t1 = B [ j ] ;
  final int n2 = B [ j ] ;
  int ex1 = 0 ;
  int ex2 = 0 ;
  if ( r != 0 ) {
    final int t = r ;
    if ( t == 0 ) {
      if ( t1 == tr ) n1 += nr ;
      else {
        ( n1 == tr ) t1 = - 1 ;
        ex1 = - 1 ;
      }
    }
    else {
      if ( t2 == tr ) n2 += nr ;
      else {
        ( n2 == tr ) t2 = - 1 ;
        ex2 = - 1 ;
      }
    }
  }
  if ( t1 == t2 ) {
    c = Math . min ( n1 , n2 ) ;
    n1 -= c ;
    n2 -= c ;
    assert n1 == 0 || n2 == 0 ;
    if ( n1 > 0 ) r = new Integer ( 0 ) ;
    