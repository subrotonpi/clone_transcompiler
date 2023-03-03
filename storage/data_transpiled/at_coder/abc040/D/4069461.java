public static int N ( Scanner input , int M ) {
  int [ ] [ ] Roads = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a , b , y ;
    a = input . nextInt ( ) ;
    b = input . nextInt ( ) ;
    a = a - 1 ;
    b = b - 1 ;
    Roads [ i ] = a ;
  }
  Arrays . sort ( Roads , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return o1 [ 2 ] - o2 [ 2 ] ;
    }
  }
  ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] Info = new int [ Q ] [ ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int v = input . nextInt ( ) ;
    int w = input . nextInt ( ) ;
    v -- ;
    Info [ i ] = v ;
    Info [ i ] [ v ] = w ;
  }
  Arrays . sort ( Info , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return o1 [ 2 ] - o2 [ 2 ] ;
    }
  }
  ) ;
  class UnionFind {
    int [ ] par = new int [ N ] ;
    int [ ] rank = new int [ N ] ;
    int [ ] size = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int v = input . nextInt ( ) ;
      int w = input . nextInt ( ) ;
      v -- ;
      if ( v > w ) {
        par [ i ] = i ;
        rank [ i ] = v ;
      }
      else {
        par [ i ] = find ( par [ i ] ) ;
        return par [ i ] ;
      }
    }
    void union ( int x , int y ) {
      int x = input . nextInt ( ) ;
      int y = input . nextInt ( ) ;
      if ( x == y ) return ;
      if ( rank [ x ] < rank [ y ] ) {
        par [ x ] = y ;
        size [ y ] += size [ x ] ;
        size [ x ] = 0 ;
      }
      else {
        par [ y ] = x ;
        size [ x ] += size [ y ] ;
        size [ y ] = 0 ;
        if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
      }
    }
  }
  UnionFind UF