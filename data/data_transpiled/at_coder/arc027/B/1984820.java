public static void UnionFind ( ) {
  int [ ] table = new int [ size ] ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    table [ i ] = - 1 ;
  }
  int x = 0 ;
  while ( x >= 0 ) {
    x = table [ x ] ;
  }
  int y = 0 ;
  while ( y >= 0 ) {
    int s1 = x + 1 ;
    int s2 = y + 1 ;
    if ( s1 != s2 ) {
      if ( table [ s1 ] != table [ s2 ] ) {
        if ( table [ s1 ] < table [ s2 ] ) {
          table [ s2 ] = s1 ;
        }
        else {
          table [ s1 ] = s2 ;
        }
      }
      else {
        table [ s1 ] += - 1 ;
        table [ s2 ] = s1 ;
      }
    }
    return ;
  }
  boolean same ( x , y ) {
    return x == y ;
  }
  int N = Integer . parseInt ( input ( ) ) ;
  char [ ] S1 = new char [ N ] ;
  int [ ] S2 = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S1 [ i ] = input . charAt ( i ) ;
    S2 [ i ] = input . charAt ( i ) ;
  }
  UnionFind uf = new UnionFind ( 100 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    uf . unite ( ( char ) S1 [ i ] , ( char ) S2 [ i ] ) ;
  }
  int res = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int curr = 0 ;
    for ( int d = ( char ) '0' ;
    d <= ( char ) '0' + 10 ;
    d ++ ) {
      if ( uf . same ( d , ( char ) S1 [ i ] ) == true ) {
        curr = 1 ;
        break ;
      }
    }
    if ( curr != 1 ) {
      if ( i == 0 ) {
        curr = 9 ;
      }
      else {
        curr = 10 ;
      }
      uf . unite ( ( char ) S1 [ i ] , ( char ) '0' ) ;
    }
    res *= curr ;
  }
  System . out . println ( res ) ;
}
