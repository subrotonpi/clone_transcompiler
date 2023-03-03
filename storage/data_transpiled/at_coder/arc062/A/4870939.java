public static int N = Integer . parseInt ( input ) {
  List < List < Integer >> P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  int [ ] T = new int [ N ] ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = P . get ( i ) . get ( 0 ) ;
    A [ i ] = P . get ( i ) . get ( 1 ) ;
  }
  int t = T [ 0 ] ;
  int a = A [ 0 ] ;
  int k = 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    k1 = ( int ) ( ( T [ i - 1 ] * k - 1 ) / T [ i ] + 1 ) ;
    k2 = ( int ) ( ( A [ i - 1 ] * k - 1 ) / A [ i ] + 1 ) ;
    k = Math . max ( k1 , k2 ) ;
  }
  return k * ( T [ N - 1 ] + A [ N - 1 ] ) ;
}
