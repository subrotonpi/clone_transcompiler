public static void UnionFind ( ) {
  {
    table = new int [ size ] ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) {
      table [ i ] = - 1 ;
    }
    int x = 0 ;
    while ( 0 <= table [ x ] ) {
      x = table [ x ] ;
    }
    int y = 0 ;
    int r = rx ;
    if ( rx != ry ) {
      int dx = - table [ rx ] ;
      int dy = - table [ ry ] ;
      if ( dx != dy ) {
        if ( dx < dy ) {
          table [ rx ] = ry ;
          r = ry ;
        }
        else {
          table [ ry ] = rx ;
        }
      }
      else {
        table [ rx ] -- ;
        table [ ry ] = rx ;
      }
    }
    /* solve the number of elements */
    int n = 0 ;
    int m = 0 ;
    int [ ] c = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      c [ i ] = i ;
    }
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int rx = table [ rx ] ;
      int ry = table [ ry ] ;
      int r = rx ;
      if ( rx != ry ) {
        int dx = - table [ rx ] ;
        int dy = - table [ ry ] ;
        if ( dx != dy ) {
          if ( dx < dy ) {
            table [ rx ] = ry ;
            r = ry ;
          }
          else {
            table [ ry ] = rx ;
          }
        }
        else {
          table [ rx ] -- ;
          table [ ry ] = rx ;
        }
      }
    }
    /* solve the number of elements */
    int [ ] d = c . clone ( ) ;
    UnionFind uf = new UnionFind ( n ) ;
    int ans = Integer . MAX_VALUE ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int ei = e [ i ] ;
      int r = ei ;
      int a = uf . find ( a ) ;
      int b = uf . find ( b ) ;
      if ( ga != gb ) {
        int da = d [ ga ] ;
        int db = d [ gb ] ;
        if ( r < Math . max ( da , db ) ) {
          ans += r - Math . max ( da , db ) ;
          int nd = Math . min ( da , db ) ;
          int ng = uf . unite ( a , b ) ;
          d [ ng ] = nd ;
        }
      }
    }
    / * ▁ solve ▁ the ▁ number ▁ of