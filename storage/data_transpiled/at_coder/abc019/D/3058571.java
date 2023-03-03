@ Sys public static void System ( ) {
  int n = Integer . parseInt ( input ) ;
  int num = 0 , ans = 0 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    System . out . println ( "?" + 1 + i ) ;
    System . out . flush ( ) ;
    int a = Integer . parseInt ( input ) ;
    if ( a > num ) num = a ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i != d ) {
      System . out . println ( "?" + d + i ) ;
      System . out . flush ( ) ;
      int a = Integer . parseInt ( input ) ;
      ans = Math . max ( ans , a ) ;
    }
  }
  System . out . println ( "!" + ans ) ;
}
