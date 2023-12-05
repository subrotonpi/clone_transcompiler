public static int [ ] [ ] [ ] dijkstra ( int R , int C , int K ) {
  String [ ] S = new String [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) S [ i ] [ 0 ] = input . charAt ( i ) ;
  int si = 0 ;
  int sj = - 1 ;
  int ci = 0 ;
  int cj = - 1 ;
  int gi = 0 ;
  int gj = - 1 ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    String s = S [ i ] ;
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      int base = S . charAt ( j ) == 'E' ? 1 : 0 ;
      int [ ] [ ] lst = res_g [ i ] [ j ] ;
      for ( int k1 = 0 ;
      k1 < lst . length - 1 ;
      k1 ++ ) {
        int d1 = lst [ k1 ] . length ;
        for ( int k2 = 0 ;
        k2 < lst [ k2 ] . length ;
        k2 ++ ) {
          int d2 = res_c [ i ] [ j ] . length ;
          while ( l >= 0 && k1 + d2 + lst [ k2 ] . charAt ( 0 ) + base > K ) l -- ;
          if ( l < 0 ) break ;
        }
        ans = Math . min ( ans , d1 + d2 * 2 + lst [ k1 ] . length ) ;
      }
    }
  }
  System . out . println ( ans < INF ? - 1 : ans ) ;
  int [ ] [ ] [ ] res = new int [ R ] [ R ] [ C ] ;
  int [ ] [ ] [ ] dist = new int [ R ] [ K + 1 ] [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    int [ ] [ ] que = new int [ R ] [ R ] ;
    for ( int j = 0 ;
    j < R ;
    j ++ ) {
      int [ ] di = new int [ R ] ;
      for ( int k = 0 ;
      k < R ;
      k ++ ) {
        int tmp = di [ k ] ;
        if ( dist [ vi ] [ vj ] [ k ] < cost ) continue ;
        if ( S . charAt ( ui ) == 'T' ) {
          if ( k + 1 <= K && cost + 1 < dist [ ui ] [ uj ] [ k + 1 ] ) {
            dist [ ui ] [ uj ] [ k + 1 ] = cost + 1 ;
            