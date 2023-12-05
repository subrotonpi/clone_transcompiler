public static int dp ( int score , int i ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = new int [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) s [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  memo = new int [ 200 ] [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    memo [ j ] [ j ] = - 1 ;
  }
  /* dp(score, i) */
  if ( i == n ) {
    if ( score % 10 == 0 ) {
      memo [ i ] [ score ] = 0 ;
      return 0 ;
    }
    else {
      memo [ i ] [ score ] = score ;
      return score ;
    }
  }
  System . out . println ( dp ( 0 , 0 ) ) ;
}
