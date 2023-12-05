@ SafeVarargs public static < T > Graph < T > graph ( ) {
  class Graph < T > {
    private final Map < T , Integer > graph ;
    {
      this . graph = new HashMap < > ( ) ;
    }
    @ Override public int size ( ) {
      return graph . size ( ) ;
    }
    @ Override public void addEdge ( T src , T dst ) {
      this . graph . get ( src ) . add ( dst ) ;
      this . graph . get ( dst ) . add ( src ) ;
    }
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  Graph < T > friends = new Graph < > ( ) ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    T a = Integer . parseInt ( input ( ) ) ;
    T b = Integer . parseInt ( input ( ) ) ;
    friends . addEdge ( a , b ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List < T > nums = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < friends . graph . get ( i + 1 ) . size ( ) ;
    j ++ ) {
      for ( int k = 0 ;
      k < friends . graph . get ( j ) . size ( ) ;
      k ++ ) {
        if ( ! friends . graph . get ( i + 1 ) . containsKey ( k ) ) {
          nums . add ( friends . graph . get ( i + 1 ) . get ( k ) ) ;
        }
      }
    }
    Set < T > set = new HashSet < > ( nums ) ;
    if ( set . contains ( i + 1 ) ) {
      set . remove ( i + 1 ) ;
    }
    System . out . println ( set . size ( ) ) ;
  }
  return friends ;
}
