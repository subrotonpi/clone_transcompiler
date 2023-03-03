static final int [ ] [ ] G ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  int N = 2000 ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  int [ ] [ ] dp = new int [ N ] [ N ] ;
  int [ ] col = new int [ N ] ;
  int [ ] cnt = new int [ 2 ] ;
  boolean [ ] visit = new boolean [ N ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    G [ a ] [ b ] = 1 ;
    G [ b ] [ a ] = 1 ;
  }
  boolean dfs = false ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    visit [ u ] = 1 ;
    col [ u ] = c ;
    cnt [ c ] ++ ;
    for ( int v = 0 ;
    v < n ;
    v ++ ) {
      if ( v == u || G [ u ] [ v ] == 1 ) continue ;
      if ( visit [ v ] == 1 && col [ v ] == c ) return false ;
      if ( ! visit [ v ] && ! dfs ( v , c ^ 1 ) ) return false ;
    }
  }
  int num = 0 ;
  dp [ 0 ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! visit [ i ] ) {
      num ++ ;
      cnt [ 0 ] = cnt [ 1 ] = 0 ;
      if ( ! dfs ( i , 0 ) ) {
        System . out . println ( - 1 ) ;
        System . exit ( 0 ) ;
      }
      for ( int j = 0 ;
      j < n ;
      j ++ ) for ( int k = 0 ;
      k < 2 ;
      k ++ ) if ( j >= cnt [ k ] ) dp [ num ] [ j ] |= dp [ num - 1 ] [ j - cnt [ k ] ] ;
    }
  }
  int ans = m ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( dp [ num ] [ i ] ) ans = Math . min ( ans , i * ( i - 1 ) / 2 + ( n