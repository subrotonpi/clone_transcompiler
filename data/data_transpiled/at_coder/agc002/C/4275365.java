public static int N = Integer . parseInt ( input ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int pre = A [ 0 ] ;
  int index = - 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( pre + A [ i ] >= L ) {
      index = i ;
      break ;
    }
    pre = A [ i ] ;
  }
  if ( index == - 1 ) {
    System . out . println ( "Impossible" ) ;
  }
  else {
    System . out . println ( "Possible" ) ;
    int i = 1 ;
    while ( i < index ) {
      System . out . println ( i ) ;
      i ++ ;
    }
    i = N - 1 ;
    while ( index - 1 < i ) {
      System . out . println ( i ) ;
      i -- ;
    }
  }
  return index ;
}
