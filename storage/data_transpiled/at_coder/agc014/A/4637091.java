static final int [ ] getNegativeInstances ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  C = Integer . parseInt ( input . nextLine ( ) ) ;
  int ab = B - A ;
  int bc = C - B ;
  if ( ( A % 2 == 1 ) & ( B % 2 == 1 ) & ( C % 2 == 1 ) ) {
    System . out . println ( 0 ) ;
  }
  else if ( ( ab == 0 ) & ( bc == 0 ) ) {
    System . out . println ( - 1 ) ;
  }
  else {
    for ( int k = 0 ;
    k < 30 ;
    k ++ ) {
      if ( ( ( ab % 2 ) == 1 ) | ( ( bc % 2 ) == 1 ) ) {
        System . out . println ( k ) ;
        break ;
      }
      ab = ( int ) ( ab / 2 ) ;
      bc = ( int ) ( bc / 2 ) ;
    }
  }
  return new int [ ] {
    ab , bc }
    ;
  }
  