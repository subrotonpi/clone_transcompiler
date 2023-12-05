public static int K = Integer . parseInt ( input ) {
  if ( K != 10 && K != 792 ) {
    exit ( ) ;
  }
  {
    List < String > S = Lists . newArrayList ( String . valueOf ( N ) ) ;
    int SN = 0 ;
    for ( String i : S ) {
      SN += Integer . parseInt ( i ) ;
    }
    return N / SN ;
  }
  {
    int D = Integer . parseInt ( input . nextLine ( ) ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int temp = ( n + 10 * ( D + 1 ) ) / ( 10 * ( D + 1 ) ) ;
    return 10 * ( D + 1 ) * temp - 1 ;
  }
  List < Integer > L = new ArrayList < Integer > ( ) ;
  L . add ( 1 ) ;
  int k = 1 ;
  for ( int i = 1 ;
  i < K ;
  i ++ ) {
    int N = L . get ( k - 1 ) + 1 ;
    int x = X ( 0 , N ) ;
    int tmp = snuke ( N ) ;
    int ans = N ;
    for ( int d = 0 ;
    d < String . valueOf ( N ) . length ( ) ;
    d ++ ) {
      x = X ( d , N ) ;
      if ( snuke ( x ) < tmp ) {
        tmp = snuke ( x ) ;
        ans = x ;
      }
    }
    L . add ( ans ) ;
    k ++ ;
  }
  for ( int i = 0 ;
  i < L . size ( ) ;
  i ++ ) {
    System . out . println ( L . get ( i ) ) ;
  }
  return L . size ( ) ;
}
