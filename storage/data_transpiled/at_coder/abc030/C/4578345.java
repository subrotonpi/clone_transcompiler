public static void input ( Scanner input ) {
  int n = input . nextInt ( ) , m = input . nextInt ( ) ;
  int x = input . nextInt ( ) , y = input . nextInt ( ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) b [ i ] = input . nextInt ( ) ;
  int times = 0 ;
  int ans = 0 ;
  char here = "a" ;
  int p = 0 ;
  int q = 0 ;
  int pf = 0 ;
  int qf = 0 ;
  while ( pf == 0 && qf == 0 ) {
    if ( here == "a" ) {
      for ( int i = p ;
      i < n ;
      i ++ ) {
        if ( times <= a [ i ] ) {
          times = a [ i ] + x ;
          p = i ;
          here = "b" ;
          if ( i == n - 1 ) pf = 1 ;
          break ;
        }
        if ( i == n - 1 ) pf = 1 ;
      }
    }
    else {
      for ( int i = q ;
      i < m ;
      i ++ ) {
        if ( times <= b [ i ] ) {
          times = b [ i ] + y ;
          q = i ;
          here = "a" ;
          ans ++ ;
          if ( i == m - 1 ) qf = 1 ;
          break ;
        }
        if ( i == m - 1 ) qf = 1 ;
      }
    }
  }
  if ( here == "a" ) {
    for ( int i = p ;
    i < n ;
    i ++ ) {
      if ( times <= a [ i ] ) {
        times = a [ i ] + x ;
        p = i ;
        here = "b" ;
        if ( i == n - 1 ) pf = 1 ;
        break ;
      }
      if ( i == n - 1 ) pf = 1 ;
    }
  }
  else {
    for ( int i = q ;
    i < m ;
    i ++ ) {
      if ( times <= b [ i ] ) {
        times = b [ i ] + y ;
        q = i ;
        here = "a" ;
        ans ++ ;
        if ( i == m - 1 ) qf = 1 ;
        break ;
      }
      if ( i == m - 1 ) qf = 1 ;
    }
  }
  System . out . println ( ans ) ;
}
