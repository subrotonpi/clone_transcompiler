@ InputFunction public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > req = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    req . add ( Collections . singletonList ( i ) ) ;
  }
  Collections . sort ( req , new Comparator < Integer > ( ) {
  }
  ) ;
  int max = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( ! req . get ( i ) . equals ( max ) ) {
      max = req . get ( i ) . intValue ( ) - 1 ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
