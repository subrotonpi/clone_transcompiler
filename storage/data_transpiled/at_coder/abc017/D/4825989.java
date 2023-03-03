public static void input ( Scanner input , int n , int m ) {
  int [ ] f = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) f [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] dp = new int [ n + 1 ] ;
  dp [ 0 ] = 1 ;
  dp [ 1 ] = 1 ;
  int [ ] ruiseki = new int [ n + 1 ] ;
  ruiseki [ 0 ] = 1 ;
  ruiseki [ 1 ] = 2 ;
  HashMap < Integer , Integer > memo = new HashMap < > ( ) ;
  memo . put ( f [ 0 ] , 0 ) ;
  int pos = - 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( ! memo . containsKey ( f [ i ] ) ) {
      if ( pos == - 1 ) {
        dp [ i + 1 ] = ruiseki [ i ] ;
        ruiseki [ i + 1 ] = ruiseki [ i ] + dp [ i + 1 ] ;
        memo . put ( f [ i ] , i ) ;
      }
      else {
        dp [ i + 1 ] = ruiseki [ i ] - ruiseki [ pos ] ;
        ruiseki [ i + 1 ] = ruiseki [ i ] + dp [ i + 1 ] ;
        memo . put ( f [ i ] , i ) ;
      }
    }
    else {
      if ( memo . get ( f [ i ] ) > pos ) {
        dp [ i + 1 ] = ruiseki [ i ] - ruiseki [ memo . get ( f [ i ] ) ] ;
        ruiseki [ i + 1 ] = ruiseki [ i ] + dp [ i + 1 ] ;
        pos = memo . get ( f [ i ] ) ;
        memo . put ( f [ i ] , i ) ;
      }
      else {
        dp [ i + 1 ] = ruiseki [ i ] - ruiseki [ pos ] ;
        ruiseki [ i + 1 ] = ruiseki [ i ] + dp [ i + 1 ] ;
        memo . put ( f [ i ] , i ) ;
      }
    }
    dp [ i + 1 ] %= MOD ;
    ruiseki [ i + 1 ] %= MOD ;
  }
  System . out . println ( dp [ n ] % MOD ) ;
}
