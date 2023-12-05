public static int x ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x % 11 > 6 ) {
    System . out . println ( ( x / 11 ) * 2 + 2 ) ;
  }
  else if ( x % 11 == 0 ) {
    System . out . println ( ( x / 11 ) * 2 ) ;
  }
  else {
    System . out . println ( ( x / 11 ) * 2 + 1 ) ;
  }
  return x ;
}
