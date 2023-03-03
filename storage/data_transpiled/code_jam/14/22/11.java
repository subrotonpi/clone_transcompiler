private static HashMap < Integer , Integer > cache = new HashMap < Integer , Integer > ( ) {
  int A , B , K ;
  {
    if ( upto >= A . length ( ) ) return 1 ;
    if ( ( upto >= B ) && ( upto <= K ) ) return cache . get ( new Integer ( upto ) ) ;
    int a = Integer . parseInt ( A ) ;
    int b = Integer . parseInt ( B ) ;
    int k = Integer . parseInt ( K ) ;
    int ans = 0 ;
    for ( int ma = 0 ;
    ma <= 1 ;
    ma ++ ) {
      for ( int mb = 0 ;
      mb <= 1 ;
      mb ++ ) {
        int mk = ma & mb ;
        if ( abound && ma > a ) continue ;
        if ( bbound && mb > b ) continue ;
        if ( kbound && mk > k ) continue ;
        ans += f ( upto + 1 , abound && ma == a , bbound && mb == b , kbound && mk == k ) ;
      }
    }
    cache . put ( new Integer ( upto ) , ans ) ;
    return cache ;
  }
  private String do {
    cache . clear ( ) ;
    A = Integer . parseInt ( A ) ;
    B = Integer . parseInt ( B ) ;
    K = Integer . parseInt ( K ) ;
    return String . valueOf ( f ( 0 , true , true , true ) ) ;
  }
  private int f ( int upto , int abound , int bbound , int kbound ) {
    int ma = Integer . parseInt ( B ) ;
    int mb = Integer . parseInt ( K ) ;
    int mk = ma & mb ;
    int mk = mb & mk ;
    return ans ;
  }
}
