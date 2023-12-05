public static int A = Integer . parseInt ( input ) {
  int tmp = A ;
  boolean ansFlg = true ;
  int ans = 1 ;
  while ( ansFlg ) {
    if ( A >= B ) {
      System . out . println ( ans ) ;
      break ;
    }
    else {
      A += tmp ;
      ans ++ ;
    }
  }
  return ans ;
}
