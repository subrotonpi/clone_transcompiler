static boolean isUnionFind ( int n , int m ) {
  List < List < Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ab . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  class UnionFind implements Comparator < Integer > {
    int [ ] parent = new int [ size ] ;
    int [ ] rank = new int [ size ] ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) {
      parent [ i ] = i ;
      rank [ i ] = 0 ;
    }
    @ Override public Integer compare ( Integer x , Integer y ) {
      if ( parent [ x ] == x ) {
        return x ;
      }
      else {
        return find ( parent [ x ] ) ;
      }
    }
    @ Override public Integer compare ( Integer x , Integer y ) {
      x = find ( x ) ;
      y = find ( y ) ;
      if ( x == y ) return x ;
      if ( rank [ x ] < rank [ y ] ) {
        parent [ x ] = y ;
      }
      else {
        parent [ y ] = x ;
        if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
      }
    }
    @ Override public boolean same ( Integer x , Integer y ) {
      return find ( x ) == find ( y ) ;
    }
  }
  class C {
    UnionFind ( int x ) {
      UnionFind U = new UnionFind ( n ) ;
      for ( int i = 0 ;
      i < m ;
      i ++ ) {
        if ( i == x ) continue ;
        U . unite ( ab . get ( i ) . get ( 0 ) - 1 , ab . get ( i ) . get ( 1 ) - 1 ) ;
      }
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( ! U . same ( i , j ) ) return false ;
        }
      }
      return true ;
    }
  }
  int ans = 0 ;
  for ( int y = 0 ;
  y < m ;
  y ++ ) {
    if ( ! C ( y ) ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return true ;
}
