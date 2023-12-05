public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N % 9 == 0 ) {
    System . out . println ( '9' * ( N / 9 ) ) ;
  }
  else {
    System . out . println ( Integer . toString ( N % 9 ) * ( N / 9 + 1 ) ) ;
  }
  return N ;
}
