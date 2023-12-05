public static int [ ] getSums ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] Csum = new int [ N + 1 ] ;
  int tmp = 0 ;
  int cnt = 0 ;
  for ( int i : a ) {
    cnt ++ ;
    tmp += i ;
    Csum [ cnt ] = tmp ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i <= N - K ;
  i ++ ) {
    ans += Csum [ i + K ] - Csum [ i ] ;
  }
  System . out . println ( ans ) ;
  return Csum ;
}
