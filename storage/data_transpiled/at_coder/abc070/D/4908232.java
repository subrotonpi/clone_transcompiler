static final int [ ] getDijkstras ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] d = new int [ N ] ;
  float INF = Float . MAX_VALUE ;
  class Info {
    int i ;
    float cost ;
    int a , b , c ;
  }
  List < Info > G = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    G . add ( new Info ( i , 0 ) ) ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    G . get ( a - 1 ) . add ( new Info ( b - 1 , c ) ) ;
    G . get ( b - 1 ) . add ( new Info ( a - 1 , c ) ) ;
  }
  /* dijkstra */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d [ i ] = INF ;
    d [ i ] = 0 ;
    int [ ] h = new int [ N ] ;
    HeapSort . sort ( h , 0 , s ) ;
    while ( h . length != 0 ) {
      int [ ] p = new int [ G . get ( v ) . length ] ;
      System . arraycopy ( h , 0 , p , 0 , p . length ) ;
      int v = p [ 1 ] ;
      if ( d [ v ] < p [ 0 ] ) continue ;
      for ( int i = 0 ;
      i < G . get ( v ) . length ;
      i ++ ) {
        Info e = G . get ( v ) [ i ] ;
        if ( d [ e . to ] > d [ v ] + e . cost ) {
          d [ e . to ] = d [ v ] + e . cost ;
          HeapSort . sort ( h , d [ e . to ] , e . to ) ;
        }
      }
    }
  }
  int Q = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  dijkstra ( K - 1 ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int ans = 0 ;
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    ans += d [ x - 1 ] ;
    ans += d [ y -