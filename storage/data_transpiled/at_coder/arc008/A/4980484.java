public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n % 10 >= 7 ) {
    System . out . println ( ( n / 10 + 1 ) * 100 ) ;
  }
  else {
    System . out . println ( ( n / 10 ) * 100 + ( n % 10 ) * 15 ) ;
  }
}
