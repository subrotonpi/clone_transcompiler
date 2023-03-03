public static void print ( int n ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Integer . parseInt ( n / m ) == 0 ) {
    System . out . println ( m - n ) ;
  }
  else if ( n % m == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( m - n % m ) ;
  }
}
