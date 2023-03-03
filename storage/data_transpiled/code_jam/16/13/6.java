public static int _T = Integer . parseInt ( readLine ( ) ) {
  for ( int _t = 1 ;
  _t <= _T ;
  _t ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] F = map . get ( Integer . parseInt ( readLine ( ) ) - 1 ) ;
    int [ ] pred = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) pred [ F [ i ] ] = i ;
    int [ ] tmp = new int [ N ] ;
    int res = 0 ;
    int res_pairs = 0 ;
    for ( int root = 0 ;
    root < N ;
    root ++ ) {
      if ( F [ F [ root ] ] == root && F [ root ] < root ) continue ;
      else if ( F [ F [ root ] ] == root ) {
        int n = 2 ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) tmp [ i ] = - 1 ;
        tmp [ root ] = 0 ;
        tmp [ F [ root ] ] = 0 ;
        Queue < Integer > Q = new LinkedList < Integer > ( ) ;
        Q . add ( root ) ;
        while ( Q . size ( ) > 0 ) {
          int c = Q . poll ( ) ;
          for ( int p : pred [ c ] ) {
            if ( tmp [ p ] > - 1 ) continue ;
            tmp [ p ] = tmp [ c ] + 1 ;
            Q . add ( p ) ;
          }
        }
        n += Collections . max ( tmp ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) tmp [ i ] = - 1 ;
        tmp [ root ] = 0 ;
        tmp [ F [ root ] ] = 0 ;
        Q = new LinkedList < Integer > ( ) ;
        Q . add ( F [ root ] ) ;
        while ( Q . size ( ) > 0 ) {
          int c = Q . poll ( ) ;
          for ( int p : pred [ c ] ) {
            if ( tmp [ p ] > - 1 ) continue ;
            tmp [ p ] = tmp [ c ] + 1 ;
            Q . add ( p ) ;
          }
        }
        n += Collections . max ( tmp ) ;
        res_pairs += n ;
      }
      else {
        for ( int i = 0 ;
        i < N ;
        i ++ ) tmp [ i ] = false ;
        int n = 1 ;
        tmp [ root ] = true ;
        int c = F [ root ] ;
        while ( ! tmp [ c ] ) {
          n ++ ;
          tmp [ c ] = true ;
          c = F