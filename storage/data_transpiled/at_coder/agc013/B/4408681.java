@ VisibleForTesting static Collection < Integer > [ ] getInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] g = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    g [ a ] [ b ] = b ;
    g [ b ] [ a ] = a ;
  }
  int start = - 1 ;
  for ( int v = 0 ;
  v < n ;
  v ++ ) {
    if ( g [ v ] . length == 0 ) {
      continue ;
    }
    start = v ;
    break ;
  }
  int [ ] memo = new int [ n ] ;
  memo [ start ] = 1 ;
  int count = 0 ;
  Queue < Integer > q1 = new LinkedList < Integer > ( ) ;
  Queue < Integer > q2 = new LinkedList < Integer > ( ) ;
  for ( int v : g [ start ] ) {
    if ( memo [ v ] == 1 ) {
      continue ;
    }
    count ++ ;
    if ( count > 2 ) {
      break ;
    }
    memo [ v ] = 1 ;
    if ( count == 1 ) {
      q1 . add ( v ) ;
    }
    else if ( count == 2 ) {
      q2 . add ( v ) ;
    }
  }
  ArrayList < Integer > ans1 = new ArrayList < Integer > ( ) ;
  ans1 . add ( start ) ;
  while ( q1 . size ( ) > 0 ) {
    Integer node = q1 . poll ( ) ;
    ans1 . add ( node ) ;
    int flag = 0 ;
    for ( Integer nv : g [ node ] ) {
      if ( memo [ nv ] == 1 ) {
        continue ;
      }
      memo [ nv ] = 1 ;
      q2 . add ( nv ) ;
      flag = 1 ;
      break ;
    }
    if ( flag == 0 ) {
      break ;
    }
  }
  int [ ] ans2 = new int [ n ] ;
  while ( q2 . size ( ) > 0 ) {
    Integer node = q2 . poll ( ) ;
    ans2 . add ( node ) ;
  }
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    ans [ i ] = ans1 [ i ] + 1 ;
  }
  System . out . println ( ans . length ) ;
  System . out . println (