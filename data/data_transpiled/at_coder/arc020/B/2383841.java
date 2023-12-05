@ VisibleForTesting static int from ( String input ) {
  int n = ( Integer ) input . split ( " " ) . length , c = Integer . parseInt ( input . substring ( 0 , n ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  int [ ] a1 = new int [ n ] , a2 = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) a1 [ i ] = a [ i ] ;
    else a2 [ i ] = a [ i ] ;
  }
  int answer ;
  if ( a1 [ 0 ] == a1 . length && a2 [ 0 ] == a2 . length ) {
    if ( a1 [ 0 ] != a2 [ 0 ] ) answer = 0 ;
    else answer = a2 . length * c ;
  }
  else if ( a1 [ 0 ] == a1 . length && a2 [ 0 ] != a2 [ 0 ] ) {
    int [ ] c2 = new int [ 2 ] ;
    if ( a1 [ 0 ] == c2 [ 0 ] ) answer = ( a2 . length - c2 [ 1 ] ) * c ;
    else answer = ( a2 . length - c2 [ 0 ] ) * c ;
  }
  else if ( a1 [ 0 ] != a1 . length && a2 [ 0 ] != a2 [ 0 ] ) {
    int [ ] c1 = new int [ 2 ] ;
    if ( a2 [ 0 ] == c1 [ 0 ] ) answer = ( a1 . length - c1 [ 1 ] ) * c ;
    else answer = ( a1 . length - c1 [ 0 ] ) * c ;
  }
  else {
    int [ ] c1 = new int [ 2 ] ;
    if ( a1 [ 0 ] != c2 [ 0 ] ) answer = ( a1 . length + c2 [ 0 ] ) * c ;
    else answer = Math . min ( a1 . length - c1 [ 0 ] + c2 [ 0 ] ) * c ;
  }
  System . out . println ( answer ) ;
  return answer ;
}
