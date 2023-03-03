public static int [ ] [ ] y ( int N , int L , int T ) {
  int [ ] x = new int [ N ] ;
  int [ ] w = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    w [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] y = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    y [ i ] [ 1 ] = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      y [ i ] [ j ] = ( x [ i ] + ( - 1 ) * ( w [ j ] + 1 ) * T ) % L ;
    }
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( w [ 0 ] < w [ i ] ) {
      count += ( 2 * T + L - x [ i ] + x [ 0 ] ) / L ;
    }
    else if ( w [ 0 ] > w [ i ] ) {
      count += ( 2 * T + x [ i ] - x [ 0 ] ) / L ;
    }
  }
  int num ;
  if ( w [ 0 ] == 1 ) {
    num = count % N ;
  }
  else {
    num = - count % N ;
  }
  if ( w [ 0 ] == 1 ) {
    Arrays . sort ( y , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        return ( o2 . intValue ( ) + ( - o1 . intValue ( ) ) ) / L ;
      }
    }
    ) ;
  }
  else {
    Arrays . sort ( y , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        return ( o2 . intValue ( ) + ( - o1 . intValue ( ) ) ) % L ;
      }
    }
    ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( y [ i ] [ 0 ] == 0 ) {
      index = i ;
      break ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( y [ ( index - num + i ) % N ] [ 1 ] ) ;
  }
  return y ;
}
