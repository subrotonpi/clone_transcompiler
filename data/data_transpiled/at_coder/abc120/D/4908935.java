public static void UnionFind ( int [ ] nodes ) {
  {
    int [ ] parents = new int [ nodes . length ] ;
    int [ ] ranks = new int [ nodes . length ] ;
    int [ ] sizes = new int [ nodes . length ] ;
    for ( int k = 0 ;
    k < nodes . length ;
    k ++ ) {
      parents [ k ] = k ;
      ranks [ k ] = 0 ;
      sizes [ k ] = 1 ;
    }
  }
  {
    int x = find ( nodes [ 0 ] ) ;
    int y = find ( nodes [ 1 ] ) ;
    if ( x != y ) {
      if ( ranks [ x ] > ranks [ y ] ) {
        parents [ y ] = x ;
        sizes [ x ] += sizes [ y ] ;
      }
      else {
        parents [ x ] = y ;
        sizes [ y ] += sizes [ x ] ;
        if ( ranks [ x ] == ranks [ y ] ) ranks [ y ] ++ ;
      }
    }
  }
  {
    int x = find ( nodes [ 0 ] ) ;
    if ( parents [ x ] == x ) return ;
    parents [ x ] = find ( nodes [ 1 ] ) ;
    return ;
  }
  int size = sizes [ find ( nodes [ 0 ] ) ] ;
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  List < int [ ] > bridges = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    bridges . add ( Collections . singletonList ( new int [ ] {
      Integer . parseInt ( input ( ) ) }
      ) ) ;
    }
    int c2 = ( n * ( n - 1 ) / 2 ) ;
    Collections . reverse ( bridges ) ;
    UnionFind uf = new UnionFind ( ) ;
    uf . nodes = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int [ ] bridge : bridges ) {
        usefulHistory [ i ] = useful ;
        if ( uf . find ( bridge [ 0 ] ) != uf . find ( bridge [ 1 ] ) ) {
          int size0 = uf . size ( bridge [ 0 ] ) ;
          int size1 = uf . size ( bridge [ 1 ] ) ;
          useful += c2 ( size0 + size1 ) - c2 ( size0 ) - c2 ( size1 ) ;
          uf . union ( bridge [ 0 ] , bridge [ 1 ] ) ;
        }
      }
    }
    for ( int u : new ArrayList < > ( usefulHistory ) )