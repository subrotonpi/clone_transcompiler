public static int k = Integer . parseInt ( input ) {
  int [ ] a = new int [ input . nextInt ( ) ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  {
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      a [ i ] = n - ( n % a [ i ] ) ;
    }
  }
  int s = 0 ;
  int t = 2 + k * max ( a ) ;
  while ( t - s > 1 ) {
    int m = ( s + t ) / 2 ;
    if ( g ( m , a , k ) > 2 ) {
      t = m ;
    }
    else {
      s = m ;
    }
  }
  int p = 0 ;
  int q = 2 + k * max ( a ) ;
  while ( q - p > 1 ) {
    int m = ( p + q ) / 2 ;
    if ( g ( m , a , k ) >= 2 ) {
      q = m ;
    }
    else {
      p = m ;
    }
  }
  int c = 1 ;
  int res ;
  if ( g ( s , a , k ) == 2 ) {
    res = s ;
  }
  else if ( g ( t , a , k ) == 2 ) {
    res = t ;
  }
  else {
    c = - 1 ;
  }
  int res2 ;
  if ( g ( q , a , k ) == 2 ) {
    res2 = q ;
  }
  else if ( g ( p , a , k ) == 2 ) {
    res2 = p ;
  }
  else {
    c = - 1 ;
  }
  if ( c == 1 ) {
    System . out . println ( res2 + " " + res ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return s ;
}
