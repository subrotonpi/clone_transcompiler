public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( k == 0 ) {
    System . out . println ( n * n ) ;
    exit ( ) ;
  }
  for ( int i = k + 1 ;
  i <= n ;
  i ++ ) {
    int p = n / i ;
    int q = n % i ;
    ans += p * ( i - k ) ;
    ans += Math . max ( q - k + 1 , 0 ) ;
  }
  System . out . println ( ans ) ;
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    main ( ) ;
  }
}
