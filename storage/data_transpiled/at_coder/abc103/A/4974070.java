public static void main ( String input ) {
  A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . substring ( i , i + 1 ) ) ) ;
  }
  Collections . sort ( A ) ;
  int res = 0 ;
  for ( int i = 1 ;
  i < A . size ( ) ;
  i ++ ) {
    res += A . get ( i ) - A . get ( i - 1 ) ;
  }
  System . out . println ( res ) ;
}
