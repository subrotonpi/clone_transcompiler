public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  if ( Arrays . binarySearch ( a ) % N != 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int m = Arrays . binarySearch ( a ) / N ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( m * i != Arrays . binarySearch ( a , i ) ) {
      ans ++ ;
    }
  }
  return ans ;
}
