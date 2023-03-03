static final void paint ( int v , int d , int c ) {
  System . setSecurityManager ( new RMISecurityManager ( 101010 ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] es = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) - 1 ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    es [ a ] [ b ] = b ;
    es [ b ] [ a ] = a ;
  }
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] qs = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) qs [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] mem = new int [ N ] [ Q ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] qs = new int [ Q ] ;
    for ( int j = 0 ;
    j < Q ;
    j ++ ) qs [ i ] [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  {
    int [ ] mc = mem [ v ] ;
    int [ ] md = mem [ v ] ;
    if ( d <= md ) return ;
    mem [ v ] = new int [ ] {
      mc ? c : d }
      ;
      if ( d == 0 ) return ;
      for ( int to : es [ v ] ) {
        paint ( to , d - 1 , c ) ;
      }
    }
    for ( int i = qs . length ;
    i > 0 ;
    i -- ) {
      int [ ] to = qs [ i ] ;
      paint ( to , d - 1 , c ) ;
    }
    for ( int c : mem ) {
      System . out . println ( c ) ;
    }
  }
  