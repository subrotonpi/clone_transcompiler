@ VisibleForTesting static void copyAndPrint ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  Map < Integer , Integer > abc = new HashMap < > ( ) ;
  Map < Integer , Boolean > used = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = ( Integer ) Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int b = ( Integer ) Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int c = ( Integer ) Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    abc . put ( a , b , c ) ;
    used . put ( a , b , false ) ;
  }
  double [ ] [ ] spth = new double [ N + 1 ] [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    spth [ i ] [ i ] = 0 ;
  }
  for ( Map . Entry < Integer , Integer > ab : abc . entrySet ( ) ) {
    spth [ ab . getKey ( ) ] [ ab . getValue ( ) ] = spth [ ab . getKey ( ) ] [ ab . getValue ( ) ] + c ;
  }
}
