static final double [ ] [ ] string = new double [ ] [ ] {
  string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools }
  ;
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  final double inf = 10 * 20 ;
  final double eps = 1.0 / 10 * 15 ;
  final double mod = 10 * 9 + 7 ;
  {
    LI ( ) ;
    int h = Integer . parseInt ( string [ 0 ] ) ;
    int [ ] a = new int [ h ] ;
    Dinic dn = new Dinic ( h + 2 ) ;
    int s = h + 1 ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        char c = a [ i ] [ j ] ;
        if ( c == '.' ) continue ;
        if ( c == 'o' ) dn . addEdge ( s , i , inf ) ;
        else if ( c == 'T' ) {
          dn . addEdge ( s , i , inf ) ;
          ql = 0 ;
          while ( ql != 0 && q [ ql ] == - 1 ) {
            u = q [ ql ] ++ ;
          }
        }
      }
      int r = dn . run ( s , t ) ;
      if ( r >= inf ) return - 1 ;
    }
    {
      System . out . println ( main ( ) ) ;
    }
  }
  