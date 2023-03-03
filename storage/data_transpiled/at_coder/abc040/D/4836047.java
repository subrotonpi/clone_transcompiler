static final int [ ] solve ( ) {
  final int N = 10 ;
  final BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  class UnionFind implements UnionFind {
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
    int N = Integer . parseInt ( input . readLine ( ) ) ;
    int M = Integer . parseInt ( input . readLine ( ) ) ;
    List < List < Integer >> road = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      road . add ( Collections . singletonList ( new Integer ( input . readLine ( ) ) ) ) ;
    }
    int Q = Integer . parseInt ( input . readLine ( ) ) ;
    List < int [ ] > query = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int q = Integer . parseInt ( input . readLine ( ) ) ;
      int year = Integer . parseInt ( input . readLine ( ) ) ;
      query . add ( new int [ ] {
        i , q , year }
        ) ;
      }
      Arrays . sort ( road ) ;
      Arrays . sort ( query ) ;
      UnionFind Un = new UnionFind ( N ) ;
      int [ ] ans = new int [ Q ] ;
      int left = 0 ;
      for ( int i = 0 , n = query . length ;
      i < n ;
      i ++ ) {
        int q = query . get ( i ) ;
        for ( int j = left ;
        j < M ;
        j ++ ) {
          if ( road [ j ] [