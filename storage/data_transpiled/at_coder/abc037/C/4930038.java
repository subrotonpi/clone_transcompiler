public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    a [ i ] = i ;
  }
  int subSum = 0 ;
  int allSum = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    subSum -= a [ i - K ] ;
    subSum += a [ i ] ;
    allSum += subSum ;
  }
  System . out . println ( allSum ) ;
  return 0 ;
}
