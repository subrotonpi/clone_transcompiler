public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N >= 2 && A <= B ) {
    System . out . println ( ( N - 2 ) * B - ( N - 2 ) * A + 1 ) ;
  }
  else if ( N >= 2 ) {
    System . out . println ( 0 ) ;
  }
  else if ( A == B ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return A ;
}
