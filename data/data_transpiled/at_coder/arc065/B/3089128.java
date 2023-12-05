@ VisibleForTesting static int [ ] [ ] solve ( int n , int k , int l ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  int l = Integer . parseInt ( input ( ) ) ;
  class UnionFind implements Comparator < Integer > {
    int [ ] table = new int [ size ] ;
    public int size ( ) {
      table [ 0 ] = - 1 ;
      for ( int i = 0 ;
      i < size ;
      i ++ ) {
        table [ i ] = i ;
      }
      return table [ 0 ] ;
    }
    public int find ( int x ) {
      if ( table [ x ] < 0 ) {
        return x ;
      }
      else {
        table [ x ] = find ( table [ x ] ) ;
        return table [ x ] ;
      }
    }
    public void union ( int x , int y ) {
      int s1 = find ( x ) ;
      int s2 = find ( y ) ;
      if ( s1 != s2 ) {
        if ( table [ s1 ] > table [ s2 ] ) {
          table [ s2 ] = s1 ;
        }
        else if ( table [ s1 ] < table [ s2 ] ) {
          table [ s1 ] = s2 ;
        }
        else {
          table [ s1 ] = s2 ;
          table [ s2 ] -- ;
        }
      }
      return ;
    }
  }
  UnionFind road = new UnionFind ( n ) ;
  UnionFind train = new UnionFind ( n ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    road . union ( a - 1 , b - 1 ) ;
  }
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    train . union ( a - 1 , b - 1 ) ;
  }
  int [ ] roadRoot = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int num = road . find ( i ) ;
    roadRoot [ i ] = num ;
  }
  int [ ] trainRoot = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int num = train . find ( i ) ;
    trainRoot [ i ] = num ;
  }
  int [ ] count = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ )