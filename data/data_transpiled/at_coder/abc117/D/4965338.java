static final int [ ] getMath ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int bitNum = Math . floor ( Math . log2 ( Math . max ( Math . max ( a , k ) , 0 ) ) ) + 1 ;
  int [ ] numOne = new int [ bitNum ] ;
  for ( int i = 0 ;
  i < bitNum ;
  i ++ ) {
    int numOneTmp = 0 ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      numOneTmp += ( a [ j ] >> i ) & 1 ;
    }
    numOne [ i ] = numOneTmp ;
  }
  int bitK ;
  if ( k == 0 ) bitK = 1 ;
  else bitK = Math . floor ( Math . log2 ( k ) ) + 1 ;
  int constantAns = 0 ;
  for ( int i = bitK ;
  i < bitNum ;
  i ++ ) {
    constantAns += numOne [ i ] * 2 * i ;
  }
  int ans = 0 ;
  for ( int i = bitK ;
  i > 0 ;
  i -- ) {
    if ( 2 * i > k ) {
      constantAns += numOne [ i ] * 2 * i ;
    }
    else {
      int variantAns = numOne [ i ] * 2 * i ;
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        if ( numOne [ j ] >= ( n + 1 ) / 2 ) {
          variantAns += numOne [ j ] * 2 * j ;
        }
        else {
          variantAns += ( n - numOne [ j ] ) * 2 * j ;
        }
      }
      ans = Math . max ( ans , constantAns + variantAns ) ;
      constantAns += ( n - numOne [ i ] ) * 2 * i ;
      k -= 2 * i ;
    }
  }
  ans = Math . max ( ans , constantAns ) ;
  System . out . println ( ans ) ;
  return numOne ;
}
