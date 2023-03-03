static int solve ( int a , int b ) {
  a = Math . min ( a , b ) ;
  b = Math . max ( a , b ) ;
  if ( a == b ) {
    return 2 * a - 2 ;
  }
  int c = ( int ) Math . sqrt ( a * b ) + 2 ;
  do {
    if ( c * c < a * b ) {
      if ( c * ( c + 1 ) >= a * b ) {
        return 2 * c - 2 ;
      }
      else {
        return 2 * c - 1 ;
      }
    }
    else {
      c -- ;
    }
  }
  while ( c > 1 ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    a = Integer . parseInt ( input . nextLine ( ) ) ;
    b = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( solve ( a , b ) ) ;
  }
  return 0 ;
}
