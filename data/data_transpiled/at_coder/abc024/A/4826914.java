public static int A = Integer . parseInt ( input ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( S + T >= D ) {
    System . out . println ( A * S + B * T - C * ( S + T ) ) ;
  }
  else {
    System . out . println ( A * S + B * T ) ;
  }
  return S ;
}
