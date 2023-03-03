static final void solve ( ) throws IOException {
  InputStream in = new FileInputStream ( "d-small.in" ) ;
  OutputStream out = new FileOutputStream ( "d.out" ) ;
  System . setIn ( in ) ;
  System . setOut ( out ) ;
  /* dfs */
  int n = a . length ;
  if ( dep == n ) {
    return true ;
  }
  for ( int i : xrange ( n ) ) {
    if ( b [ i ] != null ) {
      continue ;
    }
    boolean flag = false ;
    for ( int j : xrange ( n ) ) {
      if ( c [ j ] != null ) {
        continue ;
      }
      if ( a [ i ] >> j & 1 ) {
        flag = true ;
        b [ i ] = c [ j ] = true ;
        if ( ! dfs ( dep + 1 , a , b , c ) ) {
          return ;
        }
        b [ i ] = c [ j ] = false ;
      }
    }
    if ( ! flag ) {
      return ;
    }
  }
  /* check */
  int n = a . length ;
  boolean [ ] b = new boolean [ n ] ;
  boolean [ ] c = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = false ;
    c [ i ] = false ;
  }
  /* calc */
  int num = 19930131 ;
  if ( dep == n ) {
    if ( check ( a ) ) {
      ans = num ;
    }
  }
  else {
    for ( int i : xrange ( 1 << n ) ) {
      if ( ( a [ dep ] & i ) != a [ dep ] ) {
        continue ;
      }
      int delta = Integer . valueOf ( a [ dep ] ^ i ) . intValue ( ) ;
      int tmp = a [ dep ] ;
      a [ dep ] = i ;
      ans = Math . min ( ans , calc ( dep + 1 , a , num + delta ) ) ;
      a [ dep ] = tmp ;
    }
  }
  /* calc */
  T = input . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    n = input . nextInt ( ) ;
    a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = Integer . valueOf ( input . nextInt ( ) , 2 ) ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + calc ( 0 , a , 0 ) ) ;
    