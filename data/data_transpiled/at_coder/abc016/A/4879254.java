public static int [ ] getBooleans ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) , d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( m % d ) == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return new int [ ] {
    m }
    ;
  }
  