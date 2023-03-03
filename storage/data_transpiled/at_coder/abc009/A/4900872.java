public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( 1 <= N && N <= 1000 ) {
    System . out . println ( N / 2 + N % 2 ) ;
  }
  return N ;
}
