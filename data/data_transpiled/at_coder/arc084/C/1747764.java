public static int K = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > ans ;
  if ( K % 2 == 0 ) {
    ans = new ArrayList < > ( N / 2 ) ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) ans . add ( K ) ;
  }
  else {
    int back = N / 2 ;
    int mid = K / 2 + 1 ;
    ans = new ArrayList < > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) ans . add ( mid ) ;
  }
  return N ;
}
