public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  List < Integer > des = new ArrayList < > ( ) ;
  des . add ( 0 ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    L . add ( Collections . singletonList ( Integer . valueOf ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( L ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( des . get ( des . size ( ) - 1 ) < L . get ( i ) . intValue ( ) ) {
      ans ++ ;
      des . add ( L . get ( i ) . intValue ( ) - 1 ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
