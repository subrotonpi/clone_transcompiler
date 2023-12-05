public static void make ( int n , Random r ) {
  Map < Integer , Integer > v = new HashMap < > ( ) ;
  v . put ( 0 , 1 ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    Map < Integer , Integer > w = new HashMap < > ( v ) ;
    for ( Map . Entry < Integer , Integer > e : v . entrySet ( ) ) {
      w . put ( e . getKey ( ) + s , v . getOrDefault ( e . getKey ( ) + s , 0 ) + e . getValue ( ) ) ;
    }
    v = w ;
  }
  make ( v . entrySet ( ) , r ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > S = make ( N / 2 , 0 ) ;
  Map < Integer , Integer > T = make ( N - N / 2 , 1 ) ;
  int ans = 0 ;
  Iterator < Integer > it = T . iterator ( ) ;
  Integer nn = ( null == it . next ( ) ) ? null : it . next ( ) ;
  Integer t , w ;
  for ( int s = 0 ;
  s < S . size ( ) ;
  s ++ ) {
    while ( w != null && s + t > X ) {
      t = it . next ( ) ;
      w = it . next ( ) ;
    }
    if ( w != null && s + t == X ) {
      ans += v * w ;
    }
  }
  System . out . println ( ans ) ;
}
