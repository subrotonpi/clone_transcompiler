public static int [ ] getInput ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
  return new int [ ] {
    N , K , A }
    ;
    /*solve the number of letters in the input*/
    int [ ] sumPerDigitList = sumDigit ( A ) ;
    int [ ] K_b = to2Digit ( K + 1 ) ;
    int [ ] cand = new int [ 40 ] ;
    for ( int i = 0 ;
    i < 40 ;
    i ++ ) {
      if ( K_b [ i ] == 1 ) {
        cand [ i ] = calcOpt ( i , K_b , sumPerDigitList , N ) ;
      }
    }
    /*calcOpt the number of letters in the input*/
    int [ ] opt = new int [ 40 ] ;
    for ( int i = 0 ;
    i < 40 ;
    i ++ ) {
      if ( j < i ) {
        opt [ i ] += Math . max ( N - sumPerDigitList [ i ] , sumPerDigitList [ i ] ) * 2 * j ;
      }
      else if ( j == i ) {
        opt [ i ] += sumPerDigitList [ i ] * 2 * j ;
      }
      else {
        if ( K_b [ j ] == 1 ) {
          opt [ i ] += ( N - sumPerDigitList [ i ] ) * 2 * j ;
        }
        else {
          opt [ i ] += sumPerDigitList [ i ] * 2 * j ;
        }
      }
    }
    /*sumDigit the sum of letters in the input*/
    int [ ] sumPerDigitList = new int [ 40 ] ;
    int [ ] numbers = new int [ 40 ] ;
    for ( int i = 0 ;
    i < 40 ;
    i ++ ) {
      sumPerDigitList [ i ] = sumDigit ( numbers [ i ] ) ;
      numbers [ i ] = numbers [ i ] / 2 ;
    }
    /*to2Digit the number of letters in the input*/
    int [ ] digits = new int [ 40 ] ;
    for ( int i = 0 ;
    i < 40 ;
    i ++ ) {
      digits [ i ] = digits [ i ] % 2 ;
      i ++ ;
    }
    /*solve the number of letters in the input*/
    return digits ;
    