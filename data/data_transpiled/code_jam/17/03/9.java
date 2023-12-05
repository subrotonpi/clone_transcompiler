public static void solve ( int N , int K ) {
  Map < Integer , Integer > cnt = new HashMap < > ( ) ;
  cnt . put ( N , 1 ) ;
  while ( cnt . size ( ) > 0 ) {
    int n = Collections . max ( cnt . keySet ( ) ) ;
    if ( K <= cnt . get ( n ) ) {
      return new Integer ( n / 2 ) + ( n - 1 ) / 2 ;
    }
    else {
      K -= cnt . get ( n ) ;
    }
    if ( ( n - 1 ) / 2 > 0 ) {
      cnt . put ( ( n - 1 ) / 2 , cnt . getOrDefault ( ( n - 1 ) / 2 , 0 ) + cnt . get ( n ) ) ;
    }
    if ( n / 2 > 0 ) {
      cnt . put ( n / 2 , cnt . getOrDefault ( n / 2 , 0 ) + cnt . get ( n ) ) ;
    }
    cnt . remove ( n ) ;
  }
  {
    int ntest = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < ntest ;
    i ++ ) {
      N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
      K = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
      int ma = solve ( N , K ) ;
      int mi = solve ( N , K ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ma + " " + mi ) ;
    }
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    new AnonymousClass ( ) . main ( ) ;
  }
}
