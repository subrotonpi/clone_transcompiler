public static int [ ] [ ] ints ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = a + b ;
  int x = s / 2 ;
  if ( s % 2 == 0 ) {
    System . out . println ( Integer . valueOf ( x ) ) ;
  }
  else {
    System . out . println ( Integer . valueOf ( x ) + 1 ) ;
  }
  return ints ( s ) ;
}
