public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == 1 ) {
    System . out . println ( n * k ) ;
  }
  else {
    System . out . println ( k * ( k - 1 ) * ( n - 1 ) ) ;
  }
  return k ;
}
