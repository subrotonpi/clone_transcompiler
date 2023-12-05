public static int [ ] [ ] findUnion ( int n ) {
  int [ ] [ ] a = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = new int [ n ] ;
  Arrays . sort ( a ) ;
  int [ ] [ ] gra = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] [ 0 ] = i ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) gra [ i ] [ 2 ] = a [ i + 1 ] [ 2 ] = a [ i + 1 ] [ 0 ] - a [ i ] [ 0 ] ;
  Arrays . sort ( a , new Comparator < int [ ] > ( ) {
    public int compare ( int [ ] o1 , int [ ] o2 ) {
      return o2 [ 1 ] - o1 [ 1 ] ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) gra [ i ] [ 2 ] = a [ i ] [ 2 ] = a [ i + 1 ] [ 2 ] = a [ i + 1 ] [ 1 ] - a [ i ] [ 1 ] ;
  int [ ] union = new int [ n ] ;
  int uc = 0 ;
  int ans = 0 ;
  Arrays . sort ( gra , new Comparator < int [ ] > ( ) {
    public int compare ( int [ ] o1 , int [ ] o2 ) {
      int [ ] table = new int [ size ] ;
      for ( int i = 0 ;
      i < size ;
      i ++ ) {
        table [ i ] = - 1 ;
      }
      int find = 0 ;
      while ( find >= 0 ) {
        find = 0 ;
      }
      int s1 = find ;
      int s2 = find == 0 ? 0 : find ;
      if ( s1 != s2 ) {
        if ( table [ s1 ] != table [ s2 ] ) {
          if ( table [ s1 ] < table [ s2 ] ) {
            union [ s2 ] = s1 ;
          }
          else {
            union [ s1 ] = s2 ;
          }
        }
        else {
          union [ s1 ] += - 1 ;
          union [ s2 ] = s1 ;
        }
      }
      return union ;
    }
  }
  ) ;
  UnionFind uni = new UnionFind ( n ) ;
  for ( int i = 0 ;
  i < gra . length ;
  i ++ ) {
    int [ ] hen = gra [ i ] ;
    if ( ( uni . find ( hen