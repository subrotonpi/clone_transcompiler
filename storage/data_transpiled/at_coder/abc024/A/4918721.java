public static int A = Integer . parseInt ( input ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int tmp = 0 ;
  if ( S + T >= K ) tmp = - C * ( S + T ) ;
  return tmp ;
}
