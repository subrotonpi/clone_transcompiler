public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n % 2 == 0 ) {
    System . out . println ( ( int ) ( n / 2 ) * ( int ) ( n / 2 ) ) ;
  }
  else {
    System . out . println ( ( int ) ( n / 2 ) * ( int ) ( ( n + 1 ) / 2 ) ) ;
  }
  return n ;
}
