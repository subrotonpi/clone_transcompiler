public static String print ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) A . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > p = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) for ( int j = 0 ;
  j < W ;
  j ++ ) {
    p . put ( A . get ( i ) , ( i ) ) ;
  }
  int [ ] dp = new int [ H * W + 1 ] ;
  for ( int i = 0 ;
  i < H * W ;
  i ++ ) {
    dp [ i ] = 0 ;
  }
  for ( int x = D ;
  x <= H ;
  x ++ ) {
    dp [ x ] = dp [ y ] + Math . abs ( p . get ( x ) . get ( 0 ) - p . get ( y ) . get ( 0 ) ) + Math . abs ( p . get ( x ) . get ( 1 ) - p . get ( y ) . get ( 1 ) ) ;
  }
  String ans = String . valueOf ( dp [ r ] - dp [ l ] ) ;
  System . out . println ( ans ) ;
  return ans ;
}
