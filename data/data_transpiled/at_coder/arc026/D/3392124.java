public static void UnionFind ( int n ) {
  int [ ] par = new int [ n ] ;
  int [ ] rank = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
    rank [ i ] = 0 ;
  }
  int x ;
  boolean same ( x , y ) {
    if ( par [ x ] == x ) {
      return ;
    }
    else {
      par [ x ] = find ( par [ x ] ) ;
      return ;
    }
  }
  boolean union ( x , y ) {
    x = find ( par [ x ] ) ;
    y = find ( par [ y ] ) ;
    if ( rank [ x ] < rank [ y ] ) {
      par [ x ] = y ;
    }
    else {
      par [ y ] = x ;
      if ( rank [ x ] == rank [ y ] ) {
        rank [ x ] ++ ;
      }
    }
  }
  n = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  m = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  int [ ] [ ] edge = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    edge [ i ] = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  }
  C = new UnionFind ( n ) ;
  Arrays . sort ( edge , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      double s = 0 ;
      for ( int i = 0 ;
      i < m ;
      i ++ ) {
        int ai = edge [ i ] [ 2 ] ;
        int bi = edge [ i ] [ 3 ] ;
        int ci = edge [ i ] [ 4 ] ;
        int ti = edge [ i ] [ 5 ] ;
        if ( ( ci - ti * o1 ) < 0 ) {
          s += ci - ti * o1 ;
          u . union ( ai , bi ) ;
        }
        else if ( ( ! ( u . same ( ai , bi ) ) && ( s + ci - ti * o1 ) <= 0 ) ) {
          s += ci - ti * o1 ;
          u . union ( ai , bi ) ;
        }
      }
      for ( int i = 0 ;
      i < n - 1 ;
      i ++ ) {
        if ( ! u . same ( i , i + 1 ) ) {
          return false ;
        }
      }
      return true ;
    }
  }
  ) ;
  double lb = 0.0 ;
  double ub = 1000000.0 ;
  while ( ( ub - lb ) > 0.001 ) {
    double