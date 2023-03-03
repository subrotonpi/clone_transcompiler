public static final int [ ] getDigit ( ) {
  final int b = Integer . parseInt ( input . nextLine ( ) ) ;
  final int c = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( 10 * b + c ) % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return new int [ ] {
    b , c }
    ;
  }
  