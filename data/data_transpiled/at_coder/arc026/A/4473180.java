public static void ans ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N <= 5 ) System . out . println ( N * B ) ;
  else System . out . println ( ( N - 5 ) * A + B * 5 ) ;
}
