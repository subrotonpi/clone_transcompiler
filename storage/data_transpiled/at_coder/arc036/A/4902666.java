public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] tt = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) tt [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) {
    if ( tt [ i ] + tt [ i - 1 ] + tt [ i - 2 ] < k ) {
      System . out . println ( i + 1 ) ;
      return ;
    }
  }
  System . out . println ( - 1 ) ;
}
