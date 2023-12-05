public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A > B ) System . out . println ( 0 ) ;
  else if ( N == 1 && A != B ) System . out . println ( 0 ) ;
  else {
    int minSum = A * ( N - 1 ) + B ;
    int maxSum = A + ( N - 1 ) * B ;
    System . out . println ( maxSum - minSum + 1 ) ;
  }
  return N ;
}
