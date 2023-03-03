public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  Map < Integer , Integer > B = new HashMap < Integer , Integer > ( ) ;
  Set < Integer > A_set = new HashSet < Integer > ( A ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int num = A_set . remove ( A [ i ] ) ;
    B . put ( num , i ) ;
  }
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    System . out . println ( B . get ( A [ i ] ) ) ;
  }
}
