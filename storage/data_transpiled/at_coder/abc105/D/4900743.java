public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] sumA = new int [ N + 1 ] ;
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  map . put ( 0 , 1 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sumA [ i + 1 ] = sumA [ i ] + A [ i ] ;
    sumA [ i + 1 ] = sumA [ i + 1 ] % M ;
    if ( map . containsKey ( sumA [ i + 1 ] ) ) {
      map . put ( sumA [ i + 1 ] , 1 ) ;
    }
    else {
      map . put ( sumA [ i + 1 ] , 1 ) ;
    }
  }
  int answer = 0 ;
  for ( int i : map . keySet ( ) ) {
    answer += map . get ( i ) * ( map . get ( i ) - 1 ) / 2 ;
  }
  System . out . println ( answer ) ;
  return null ;
}
