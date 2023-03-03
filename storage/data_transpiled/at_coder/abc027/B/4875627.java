public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( Arrays . binarySearch ( a ) % N != 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int x = Arrays . binarySearch ( a ) / N ;
    int leftSum = 0 ;
    int bridge = 0 ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      leftSum += a [ i ] ;
      int rightSum = Arrays . binarySearch ( a , i ) - leftSum ;
      if ( leftSum != x * ( i + 1 ) || rightSum != x * ( N - i - 1 ) ) {
        bridge ++ ;
      }
    }
    System . out . println ( bridge ) ;
  }
}
