public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    L . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int [ ] par = new int [ N ] ;
  int [ ] rank = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    par [ i ] = i ;
  }
  /* find the first element in the list */
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  if ( x != y ) {
    if ( rank [ x ] < rank [ y ] ) par [ x ] = y ;
    else {
      par [ y ] = x ;
      if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    }
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    unite ( L . get ( i ) . get ( 0 ) - 1 , L . get ( i ) . get ( 1 ) - 1 , par , rank ) ;
  }
  int ans = - 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( par [ i ] == i ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return par ;
}
