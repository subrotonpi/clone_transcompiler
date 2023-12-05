static int [ ] makep ( int n , int [ ] l , int mask ) {
  int a = l [ 0 ] & mask ;
  int b = l [ l . length - 1 ] & mask ;
  int ll = l . length ;
  int diff = a ^ b ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( ( ( diff >> i ) & 1 ) != 0 ) ) {
      diff = 1 << i ;
      break ;
    }
  }
  for ( int i = 1 , elem = l . length - 1 ;
  i >= 1 ;
  i -- ) {
    if ( ( i < ll / 2 ) && ( ( ( ( diff >> i ) & 1 ) != 0 ) ) ) {
      l [ i ] = ( l [ i ] & ~ diff ) | ( a & diff ) ;
    }
    else {
      l [ i ] = ( l [ i ] & ~ diff ) | ( b & diff ) ;
    }
  }
  int nextbit = mask & ~ diff ;
  if ( ( 0 != nextbit ) && ( ( ( ( nextbit >> i ) & 1 ) != 0 ) ) ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ( ( ( ( nextbit >> i ) & 1 ) != 0 ) ) ) {
        nextbit = 1 << i ;
        break ;
      }
    }
    l [ ll / 2 - 1 ] = ( l [ ll / 2 - 1 ] | ( a & ~ diff ) ) ^ nextbit ;
    l [ ll / 2 - 0 ] = ( l [ ll / 2 - 0 ] | ( a & ~ diff ) ) ^ nextbit ;
  }
  if ( ( ll > 2 ) && ( ll > 1 ) ) {
    System . arraycopy ( l , 0 , l , 0 , ll / 2 ) ;
    l [ ll / 2 ] = makep ( n , l , 0 , mask & ~ diff ) ;
    l [ ll / 2 ] = makep ( n , l , 1 , mask & ~ diff ) ;
  }
  return ( l ) ;
}
