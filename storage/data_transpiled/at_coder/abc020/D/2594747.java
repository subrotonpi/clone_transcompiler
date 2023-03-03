@ VisibleForTesting static int from ( String input ) {
  int n = ( Integer ) input . split ( " " ) [ 0 ] ;
  int k = ( Integer ) input . split ( " " ) [ 1 ] ;
  int a [ ] = new int [ k ] , num = 10 * 9 + 7 , ans = 0 ;
  for ( int i = 1 ;
  i <= ( int ) ( Math . sqrt ( k ) ) ;
  i ++ ) {
    if ( k == i * i ) a [ i ] = i ;
    else if ( k % i == 0 ) a [ i ] = k / i ;
  }
  /* fact */
  List < Integer > L = new ArrayList < > ( ) , i = 2 ;
  while ( i * i <= x ) {
    while ( x % i == 0 ) {
      x = x / i ;
      L . add ( i ) ;
    }
    i ++ ;
  }
  if ( x > 1 ) L . add ( x ) ;
  /* pri */
  int f = fact ( x , y ) , p = ( 1 + y ) * y / 2 ;
  for ( int i = 1 ;
  i <= f ;
  i ++ ) {
    for ( int j : combinations ( f , i ) ) {
      num = 1 ;
      for ( int k = j ;
      k < i ;
      k ++ ) num *= k ;
      if ( num <= y && i % 2 == 1 ) p -= ( num + ( y / num ) * num ) * ( y / num ) / 2 ;
      else if ( num <= y ) p += ( num + ( y / num ) * num ) * ( y / num ) / 2 ;
    }
  }
  return p % mod ;
}
