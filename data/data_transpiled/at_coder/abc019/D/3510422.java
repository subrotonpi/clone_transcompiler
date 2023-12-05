public static int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > LIST = new ArrayList < Integer > ( ) ;
  LIST . add ( 0 ) ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    System . out . print ( "?" + 1 + i ) ;
    LIST . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int x = LIST . indexOf ( Collections . reverseOrder ( LIST ) ) ;
  return ANS . toArray ( ) ;
}
