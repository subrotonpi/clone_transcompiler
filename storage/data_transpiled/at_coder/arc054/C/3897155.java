public static int det ( int [ ] [ ] a ) {
  int n = a . length ;
  if ( n == 1 ) return a [ 0 ] [ 0 ] ;
  int [ ] [ ] b = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      b [ i ] [ j ] = a [ i ] [ j ] ;
    }
  }
  int k = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( b [ i ] [ 0 ] == 1 ) {
      k = i ;
      break ;
    }
  }
  if ( k == - 1 ) {
    return 0 ;
  }
  else {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      b [ k ] [ j ] = b [ 0 ] [ j ] ;
    }
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( b [ i ] [ 0 ] == 1 ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        b [ i ] [ j ] = ( b [ i ] [ j ] + b [ 0 ] [ j ] ) % 2 ;
      }
    }
  }
  int [ ] [ ] c = new int [ n ] [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      c [ i ] [ j ] = b [ i ] [ j ] ;
    }
  }
  return det ( c ) ;
}
int N = Integer . parseInt ( input ( ) ) ;
a = new int [ N ] [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  a [ i ] = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    a [ i ] [ j ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = det ( a ) ;
  if ( ans == 1 ) {
    System . out . println ( "Odd" ) ;
  }
  else {
    System . out . println ( "Even" ) ;
  }
  return ans ;
}
