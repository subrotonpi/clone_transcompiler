static final int [ ] [ ] getSortValues ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N + 2 ] ;
  PriorityQueue < SortKey > q = new PriorityQueue < SortKey > ( ) ;
  for ( int i = 1 ;
  i <= M ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ s ] ++ ;
    a [ t + 1 ] -- ;
    q . add ( new SortKey ( s , t , i ) ) ;
  }
  Collections . sort ( q ) ;
  int t = 0 ;
  List < Integer > result = new ArrayList < > ( ) ;
  TreeSet < SortKey > j = new TreeSet < > ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    while ( q . size ( ) > 0 && q . get ( 0 ) . key == i ) {
      java . util . PriorityQueue < SortKey > _q = new java . util . PriorityQueue < > ( q ) ;
      heapSort ( j , _q . poll ( ) ) ;
    }
    t += a [ i ] ;
    if ( t >= 2 ) {
      while ( j . size ( ) > 0 && j . get ( 0 ) . key == i ) {
        result . add ( new SortKey ( j . get ( 1 ) ) ) ;
      }
    }
    else {
      j . clear ( ) ;
    }
  }
  Collections . sort ( result ) ;
  System . out . println ( result . size ( ) ) ;
  if ( result . size ( ) > 0 ) {
    System . out . println ( Arrays . toString ( result ) ) ;
  }
  return result . toArray ( new Integer [ result . size ( ) ] [ ] ) ;
}
