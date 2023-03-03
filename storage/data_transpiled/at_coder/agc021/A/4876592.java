public static int N ( ) {
  int N ;
  N = input . nextInt ( ) ;
  if ( N == 1 ) {
    System . out . println ( Integer . parseInt ( N ) ) ;
  }
  else {
    System . out . println ( Math . max ( Integer . parseInt ( N ) , ( N . length ( ) - 1 ) * 9 + Integer . parseInt ( N . substring ( 0 , 1 ) ) - 1 ) ) ;
  }
  return N ;
}
