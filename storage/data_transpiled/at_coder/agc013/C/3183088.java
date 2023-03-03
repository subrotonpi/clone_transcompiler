@ VisibleForTesting static void binarySearch ( int [ ] [ ] input , int n ) {
  int l = ( int ) input [ 0 ] [ 0 ] ;
  int t = ( int ) input [ 1 ] [ 0 ] ;
  int [ ] x = new int [ n ] , y = new int [ n ] , c = 0 ;
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = ( int ) input [ 0 ] [ 0 ] ;
    int b = ( int ) input [ 1 ] [ 0 ] ;
    x [ i ] = a ;
    if ( b != x [ i ] [ 1 ] ) c ++ ;
    y [ i ] = c ;
    if ( b - 1 ) ans [ i ] = ( a - t ) % l ;
    else ans [ i ] = ( a + t ) % l ;
  }
  Arrays . sort ( ans ) ;
  int ans3 ;
  if ( x [ i ] [ 1 ] - 1 ) ans3 = binarySearch ( ans , ans2 ) ;
  else ans3 = binarySearch ( ans , ans2 ) - 1 ;
  int num = ( int ) ( t / ( l / 2 ) ) ;
  int d ;
  if ( x [ i ] [ 1 ] - 1 ) {
    p = ( - ( t - num * ( l / 2 ) ) * 2 + x [ i ] [ 0 ] ) % l ;
    d = ( y [ - 1 ] * num + y [ - 1 ] - y [ binarySearch ( x , p , 0 ) - 1 ] ) % n ;
  }
  else {
    p = ( ( t - num * ( l / 2 ) ) * 2 + x [ 0 ] [ 0 ] ) ;
    d = ( y [ - 1 ] * num + y [ binarySearch ( x , p , 3 ) - 1 ] ) % n ;
  }
  if ( x [ i ] [ 1 ] - 1 ) d = - d ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) System . out . println ( ans [ ( ans3 - d + i ) % n ] ) ;
}
