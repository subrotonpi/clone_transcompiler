static final double input ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int n = Math . floor ( Math . sqrt ( a ) ) + 1 ;
  HashMap < Integer , Integer > t = new HashMap < > ( ) ;
  long ans = 1 ;
  for ( int i = b + 1 ;
  i <= a ;
  i ++ ) {
    int x = i ;
    for ( int j = 2 ;
    j < n ;
    j ++ ) {
      if ( ! t . containsKey ( j ) ) t . put ( j , 0 ) ;
      while ( x % j == 0 ) {
        x /= j ;
        t . put ( j , 1 ) ;
      }
      if ( x == 1 ) break ;
    }
    if ( x != 1 ) {
      if ( ! t . containsKey ( x ) ) t . put ( x , 0 ) ;
      t . put ( x , 1 ) ;
    }
  }
  for ( Map . Entry < Integer , Integer > e : t . entrySet ( ) ) {
    ans *= ( e . getValue ( ) + 1 ) ;
    ans %= 1000000007 ;
  }
  System . out . println ( ans ) ;
}
