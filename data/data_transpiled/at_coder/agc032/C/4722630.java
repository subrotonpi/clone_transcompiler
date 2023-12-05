@ VisibleForTesting static int [ ] solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final SortedMap < Integer , Integer > edges = new TreeMap < > ( ) ;
  final Counter < Integer > edgeNum = new Counter < > ( ) ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    edgeNum . setCount ( a ) ;
    edgeNum . setCount ( b ) ;
    edges . put ( a , b ) ;
    edges . get ( b , a ) ;
  }
  /* solve */
  final Collection < Integer > values = edgeNum . values ( ) ;
  for ( final Integer v : values ) {
    if ( v % 2 == 1 ) {
      return false ;
    }
  }
  final List < Integer > four = new ArrayList < > ( ) ;
  for ( final Integer v : edgeNum . entrySet ( ) ) {
    if ( v >= 6 ) {
      return true ;
    }
    if ( v >= 4 ) {
      four . add ( v ) ;
    }
  }
  if ( four . size ( ) >= 3 ) {
    return true ;
  }
  if ( four . size ( ) <= 1 ) {
    return false ;
  }
  final int v0 = four . get ( 0 ) ;
  final int v1 = four . get ( 1 ) ;
  int pathNum = 0 ;
  /* dfs for each child */
  for ( final Integer child : edges . get ( v ) ) {
    if ( child == from ) {
      continue ;
    }
    else {
      if ( child == v1 ) {
        return 1 ;
      }
      else if ( child == v0 ) {
        return 0 ;
      }
      else {
        return dfs ( child , v ) ;
      }
    }
    for ( final Integer child : edges . get ( v0 ) ) {
      pathNum += dfs ( child , v0 ) ;
    }
    if ( pathNum == 4 ) {
      return false ;
    }
    else if ( pathNum == 2 ) {
      return true ;
    }
  }
  if ( solve ( ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return null ;
}
