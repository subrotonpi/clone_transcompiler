@ VisibleForTesting static LinkedHashMap < Integer , Integer > solve ( int N , int M ) {
  HashMap < Integer , HashSet < Integer >> F_C_of_S = new HashMap < Integer , HashSet < Integer >> ( ) ;
  HashMap < Integer , HashSet < Integer >> C_of_S = new HashMap < Integer , HashSet < Integer >> ( ) ;
  int [ ] parent = new int [ M ] ;
  {
    int i = 0 ;
    for ( int s : P_of_C . get ( ) . values ( ) ) {
      if ( ( cost + 1 ) < dist [ s ] ) {
        dist [ s ] = cost + 1 ;
        Q . appendLeft ( new Integer ( cost + 1 ) ) ;
      }
    }
  }
  {
    int px ;
    int py ;
    {
      if ( ( parent [ x ] < 0 ) || ( parent [ x ] > Integer . MAX_VALUE ) ) return x ;
      else {
        parent [ x ] = y = root ( parent [ x ] ) ;
        return y ;
      }
    }
  }
  {
    int px ;
    int py ;
    {
      if ( ( parent [ px ] > parent [ py ] ) || ( parent [ py ] > parent [ px ] ) ) return x ;
    }
    {
      parent [ px ] += parent [ py ] ;
      parent [ py ] = px ;
      return y ;
    }
  }
  {
    ArrayList < Integer > pqcs = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int p = Integer . parseInt ( input ( ) ) ;
      int q = Integer . parseInt ( input ( ) ) ;
      int c = p - 1 ;
      p ++ ;
      q -- ;
      pqcs . add ( new Integer ( p ) ) ;
      if ( ! ( c >= F_C_of_S . get ( p ) ) ) F_C_of_S . get ( p ) . add ( c ) ;
      else unite ( F_C_of_S . get ( p ) . get ( c ) , i ) ;
      C_of_S . putIfAbsent ( p , new HashSet < Integer > ( ) ) . add ( c ) ;
      if ( ! ( c >= F_C_of_S . get ( q ) ) ) {
        F_C_of_S . get ( q ) . add ( c ) ;
      }
      else unite ( F_C_of_S . get ( q ) . get ( c ) , i ) ;
      C_of_S . putIfAbsent ( q , new HashSet < Integer > ( ) ) . add ( c ) ;
    }
  }
  HashMap < Integer , HashSet < Integer >> S_of_ @ @