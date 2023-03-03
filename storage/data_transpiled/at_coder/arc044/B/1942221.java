@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] src = Lists . newArrayList ( ) . stream ( ) . filter ( i -> i >= N ) . toArray ( ) ;
  int MOD = 10 * 9 + 7 ;
  if ( src [ 0 ] != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  Counter < Integer > ctr = new Counter < > ( src ) ;
  if ( ctr . getCount ( ) > 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int maxn = Collections . max ( ctr . keySet ( ) ) ;
  int ans = 0 ;
  int n = 1 ;
  while ( n <= maxn ) {
    if ( ctr . getCount ( n ) == 0 ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
    int tmp = ( Math . pow ( 2 , ctr . getCount ( n - 1 ) , MOD ) - 1 ) % MOD ;
    ans = ( ans * Math . pow ( tmp , ctr . getCount ( n ) , MOD ) ) % MOD ;
    n ++ ;
  }
  for ( int v : ctr . values ( ) ) {
    int e = v * ( v - 1 ) / 2 ;
    ans = ( ans * Math . pow ( 2 , e , MOD ) ) % MOD ;
  }
  System . out . println ( ans ) ;
}
