@ VisibleForTesting static LinkedHashMap < Integer , Integer > solve ( int N , int M ) {
  HashMap < Integer , HashSet < Integer >> F_C_of_S = new HashMap < Integer , HashSet < Integer >> ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int s ;
    int cost = 0 ;
    for ( int v = 0 ;
    v < M ;
    v ++ ) {
      if ( ( cost + 1 ) < dist [ s ] ) {
        cost = cost + 1 ;
        Q . appendLeft ( new Integer ( cost + 1 ) ) ;
      }
    }
  }
  {
    int px ;
    int py ;
    {
      if ( ( cost + 1 ) < dist [ s ] ) {
        cost = cost + 1 ;
        Q . appendLeft ( new Integer ( cost + 1 ) ) ;
      }
      else {
        parent [ s ] = y = root ( parent [ s ] ) ;
        return y ;
      }
    }
  }
  {
    int px ;
    int py ;
    {
      if ( ( cost + 1 ) < dist [ s ] ) return cost ;
      if ( ( cost + 1 ) < ( dist [ s ] ) ) {
        px = cost ;
        py = cost ;
      }
      parent [ px ] += parent [ py ] ;
      parent [ py ] = px ;
      return true ;
    }
  }
  ArrayList < Integer > pqcs = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = Integer . parseInt ( input ( ) ) ;
    int q = Integer . parseInt ( input ( ) ) ;
    int c = p - 1 ;
    p -- ;
    q -- ;
    pqcs . add ( p ) ;
    if ( ! ( c >= 0 ) ) F_C_of_S . get ( p ) . add ( c ) ;
    else unite ( F_C_of_S . get ( p ) , i ) ;
    C_of_S . computeIfAbsent ( p , k -> new HashSet < Integer > ( ) ) . add ( c ) ;
    if ( ! ( c >= 0 ) ) F_C_of_S . get ( q ) . add ( c ) ;
    else unite ( F_C_of_S . get ( q ) , i ) ;
    C_of_S . computeIfAbsent ( q , k -> new HashSet < Integer > ( ) ) . add ( c ) ;
  }
  HashMap < Integer , HashSet < Integer >> S_of_C = new HashMap < Integer , HashSet < Integer >> ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = pq @ @