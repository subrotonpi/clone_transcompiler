public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int total = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int sum = 0 ;
    int temp = i ;
    for ( int m = 0 ;
    m < 5 ;
    m ++ ) {
      sum += temp % 10 ;
      temp = temp / 10 ;
    }
    if ( A <= sum && sum <= B ) {
      total += i ;
    }
  }
  return total ;
}
