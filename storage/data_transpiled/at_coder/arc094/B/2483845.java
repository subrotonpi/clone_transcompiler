@ VisibleForTesting static int from ( int q ) {
  int a , b ;
  int c ;
  int d ;
  q = Integer . parseInt ( input . nextLine ( ) ) ;
  while ( ( a = input . nextInt ( ) ) > 0 ) {
    b = input . nextInt ( ) ;
    c = a * b ;
    d = ( int ) Math . sqrt ( c ) ;
    if ( ( a == b ) && ( d == c ) ) {
      System . out . println ( ( d - 1 ) * 2 ) ;
    }
    else if ( ( d * d == c ) && ( d * ( d + 1 ) < c ) ) {
      System . out . println ( d * 2 - 1 ) ;
    }
    else {
      System . out . println ( ( d - 1 ) * 2 ) ;
    }
    q -- ;
  }
  return d ;
}
