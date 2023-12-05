private static int findCircLen ( int [ ] bnext ) {
  int [ ] circ = new int [ bnext . length ] ;
  BitSet visited = new BitSet ( bnext . length ) ;
  int vis_id = 0 ;
  for ( int i = 0 ;
  i < bnext . length ;
  i ++ ) {
    int nr_case = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( visited . get ( i ) ) continue ;
    int j = i ;
    vis_id ++ ;
    do {
      j = bnext [ j ] ;
      if ( visited . get ( j ) ) break ;
      visited . set ( j ) ;
    }
    while ( j != vis_id ) ;
    if ( visited . get ( j ) != vis_id ) continue ;
    int clen = 0 ;
    int src = j ;
    int t = src ;
    do {
      t = bnext [ t ] ;
      clen ++ ;
      if ( t == src ) break ;
    }
    while ( t != src ) ;
    t = src ;
    do {
      circ [ t ] = clen ;
      t = bnext [ t ] ;
      if ( t == src ) break ;
    }
    while ( t != src ) ;
  }
  class TGroup {
    int id ;
    int size ;
  }
  class TCircle {
    TGroup ( TGroup ( ) null ) ;
  }
  public TCircle ( TCircle id ) {
    int size ;
  }
  public TCircle ( TCircle id ) {
    int size ;
    size = 0 ;
    for ( int i = 0 ;
    i < circ . length ;
    i ++ ) {
      size ++ ;
    }
  }
  int [ ] circ = findCircLen ( bnext ) ;
  int [ ] vtx2type = new int [ size ] ;
  /* We don't have a version of this version of this version of this version of this version of this version of this version of this version of this version of this version of this version of this version of this version. */
  for ( int i = 0 ;
  i < circ . length ;
  i ++ ) {
    vtx2type [ i ] = i - 1 ;
  }
  int max = 0 ;
  for ( int i = 0 ;
  i < circ . length ;
  i ++ ) {
    int len = 0 ;
    for ( int j = 0 ;
    j < circ