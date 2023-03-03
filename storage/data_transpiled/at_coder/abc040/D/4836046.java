static final String solve ( ) {
  final String input = "Enter a union of two sets of three sets: " ;
  class UnionFind {
    int [ ] parent = new int [ N ] ;
    int [ ] size = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      parent [ i ] = i ;
      size [ i ] = 1 ;
    }
    @ Override public int find ( int x ) {
      if ( parent [ x ] == x ) {
        return x ;
      }
      else {
        return find ( parent [ x ] ) ;
      }
    }
    @ Override public void union ( int x , int y ) {
      int px = find ( x ) ;
      int py = find ( y ) ;
      if ( px == py ) {
        return ;
      }
      if ( size [ px ] < size [ py ] ) {
        parent [ px ] = py ;
        size [ py ] += size [ px ] ;
      }
      else {
        parent [ py ] = px ;
        size [ px ] += size [ py ] ;
      }
    }
    @ Override public boolean same ( int x , int y ) {
      return find ( x ) == find ( y ) ;
    }
  }
  {
    int N = Integer . parseInt ( input ) ;
    int M = Integer . parseInt ( input ) ;
    List < List < Integer >> road = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      road . add ( Collections . singletonList ( new Integer ( input ) ) ) ;
    }
    int Q = Integer . parseInt ( input ) ;
    List < List < Integer >> query = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int q = Integer . parseInt ( input ) ;
      int year = Integer . parseInt ( input ) ;
      query . add ( Arrays . asList ( i , q , year ) ) ;
    }
    Arrays . sort ( road ) ;
    Arrays . sort ( query ) ;
    UnionFind Un = new UnionFind ( N ) ;
    int [ ] ans = new int [ Q ] ;
    int left = 0 ;
    for ( int i = 0 ;
    i < query . size ( ) ;
    i ++ ) {
      ans [ i ] = 0 ;
      left = 0 ;
      for ( int j = 0 ;
      j < query . size ( ) ;
      j ++ ) {
        if ( road [ j ] [ 2 ] > q ) {
          Un . union ( road [ j ] [ 0 ] - 1 , road