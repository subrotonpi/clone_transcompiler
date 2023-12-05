public static int n ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i != m ) {
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
  return m ;
}
