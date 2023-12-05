public static void main ( String [ ] args ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ans = new ArrayList < > ( ) ;
  int [ ] x = new int [ 90001 ] ;
  int [ ] y = new int [ 90001 ] ;
  int [ ] dp = new int [ 90001 ] ;
  for ( int i = 0 ;
  i < A . size ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < A . size ( ) ;
    j ++ ) {
      int a = A . get ( j ) ;
      x [ a ] = j ;
      y [ a ] = i ;
    }
  }
  for ( int i = D + 1 ;
  i <= H * W ;
  i ++ ) {
    dp [ i ] = dp [ i - D ] + Math . abs ( x [ i ] - x [ i - D ] ) + Math . abs ( y [ i ] - y [ i - D ] ) ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int L = Integer . parseInt ( input . nextLine ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    ans . add ( dp [ R ] - dp [ L ] ) ;
  }
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
}
