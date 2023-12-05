public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( input . substring ( 0 , input . length ( ) - 1 ) ) ;
  }
  Collections . sort ( l ) ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    System . out . println ( l . get ( i ) . toString ( ) ) ;
  }
}
