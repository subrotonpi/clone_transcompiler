@ InputFunction public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > info = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    info . add ( Collections . singletonList ( i ) ) ;
  }
  info = new ArrayList < > ( info ) ;
  info . sort ( ) ;
  int ans = 0 ;
  int cutPos = - 1 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( cutPos <= info . get ( i ) . intValue ( ) ) {
      ans ++ ;
      cutPos = info . get ( i ) . intValue ( ) ;
    }
  }
  System . out . println ( ans ) ;
}
