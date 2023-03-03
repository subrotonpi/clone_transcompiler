static final void dfs ( int n , List < String > ans ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> G = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    G . add ( new ArrayList < > ( ) ) ;
  }
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G . get ( a ) . add ( b ) ;
  }
  Set < Integer > visited = new HashSet < > ( ) ;
}
