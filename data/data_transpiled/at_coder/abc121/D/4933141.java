public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  /* Calculate the sum of the bits */
  int X = X + 1 ;
  int xorSum = 0 ;
  int digit = 1 ;
  while ( digit < X ) {
    digit *= 2 ;
    int bitCount = ( X / digit ) * ( digit / 2 ) ;
    bitCount += Math . max ( 0 , ( X % digit ) - ( digit / 2 ) ) ;
    if ( bitCount % 2 == 1 ) xorSum += digit / 2 ;
  }
  return xorSum ;
}
