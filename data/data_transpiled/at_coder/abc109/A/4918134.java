public static int [ ] getOne ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( ( a * b ) % 2 ) == 0 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
  }
  return new int [ ] {
    a , b }
    ;
  }
  