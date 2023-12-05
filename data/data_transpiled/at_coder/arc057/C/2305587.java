public static int X = Integer . parseInt ( input ) {
  int L = X * X ;
  int R = ( X + 1 ) * X ;
  int P = 100 ;
  int res = L ;
  while ( true ) {
    if ( L <= L / P * P < R ) {
      res = L / P ;
    }
    else if ( L <= ( L + P - 1 ) / P * P < R ) {
      res = ( L + P - 1 ) / P ;
    }
    else {
      break ;
    }
    P *= 100 ;
  }
  System . out . println ( res ) ;
  return res ;
}
