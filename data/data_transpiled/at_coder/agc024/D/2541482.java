@ VisibleForTesting static int [ ] solve ( int n , int [ ] links ) {
  @ SuppressWarnings ( "resource" ) final int [ ] [ ] ans = new int [ n ] [ ] ;
  {
    Deque < Integer > q = new LinkedList < > ( ) ;
    for ( int v = 0 ;
    v < n ;
    v ++ ) {
      q . add ( new Integer ( v ) ) ;
    }
    int v = 0 ;
    while ( q . hasNext ( ) ) {
      v = q . poll ( ) ;
      a = Integer . parseInt ( input . nextLine ( ) ) ;
      b -- ;
      links [ a ] [ b ] = v ;
    }
    System . out . println ( solve ( n , links ) ) ;
  }
  final int [ ] anc = new int [ links . length ] ;
  q = new LinkedList < > ( ) ;
  for ( int u = 0 ;
  u < n ;
  u ++ ) {
    ans [ u ] = - 1 ;
  }
  for ( int u = 0 ;
  u < n ;
  u ++ ) {
    ans [ u ] = 1 ;
  }
  int a = u ;
  while ( q . hasNext ( ) ) {
    u = q . poll ( ) ;
    a = Integer . parseInt ( input . nextLine ( ) ) ;
    anc [ u ] = a ;
    q . add ( new Integer ( w ) ) ;
  }
  final int [ ] path = new int [ n ] ;
  path [ 0 ] = u ;
  while ( a != v ) {
    a = anc [ a ] ;
    path [ 0 ] = a ;
  }
  return path ;
}
