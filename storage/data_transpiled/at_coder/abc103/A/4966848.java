public static void main ( String input ) {
  A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . substring ( i , i + 1 ) ) ) ;
  }
  A . sort ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < A . size ( ) ;
  i ++ ) {
    ans += Math . abs ( A . get ( i ) - A . get ( i - 1 ) ) ;
  }
  System . out . println ( ans ) ;
}
