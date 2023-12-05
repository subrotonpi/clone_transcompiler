public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A * L <= B ) {
    System . out . println ( A * K ) ;
  }
  else {
    System . out . println ( Math . min ( B * ( ( K + L - 1 ) / L ) , B * ( K / L ) + A * ( K - L * ( K / L ) ) ) ) ;
  }
  return B ;
}
