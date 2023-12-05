static final int N = Integer . parseInt ( input ) {
  int M = input . nextInt ( ) ;
  HashMap < Integer , Integer > dic = new HashMap < > ( ) ;
  for ( int i = 2 ;
  i <= ( int ) ( M * 0.5 ) ;
  i ++ ) {
    if ( M % i == 0 ) {
      dic . putIfAbsent ( i , 1 ) ;
      M /= i ;
      while ( M % i == 0 ) {
        dic . put ( i , 1 ) ;
        M /= i ;
      }
    }
    if ( M == 1 ) break ;
  }
  if ( M != 1 ) dic . put ( M , 1 ) ;
  long ans = 1 ;
  for ( Integer k : dic . keySet ( ) ) {
    int x = dic . get ( k ) ;
    int tmp = 1 ;
    for ( int i = N ;
    i < x + N ;
    i ++ ) tmp *= i ;
    ans *= tmp / Math . factorial ( x ) ;
    ans %= 1000000007 ;
  }
  System . out . println ( ans % 1000000007 ) ;
  return ans ;
}
