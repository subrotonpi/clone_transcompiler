static final int [ ] getRoots ( ) {
  System . setProperty ( "java.awt.headless" , "true" ) ;
  final int mod = 10 * 9 + 7 ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] graph = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    graph [ i ] = new int [ n ] ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    graph [ a ] [ b ] = b ;
    graph [ b ] [ a ] = a ;
  }
  final int [ ] white = new int [ n ] ;
  final int [ ] black = new int [ n ] ;
  {
    int res = 1 ;
  }
}
