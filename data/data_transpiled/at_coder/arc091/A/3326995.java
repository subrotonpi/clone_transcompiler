public static int getN ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == 1 || m == 1 ) {
    if ( n == 1 && m == 1 ) {
      System . out . println ( 1 ) ;
    }
    else {
      System . out . println ( Math . max ( n , m ) - 2 ) ;
    }
  }
  else {
    System . out . println ( ( m - 2 ) * ( n - 2 ) ) ;
  }
  return n ;
}
