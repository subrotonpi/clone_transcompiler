public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = input . nextLine ( ) . trim ( ) . substring ( 0 , s [ i ] . length ( ) - 1 ) ;
  }
  for ( String _s : new ArrayList < String > ( s ) ) {
    System . out . println ( _s . substring ( 0 , _s . length ( ) - 1 ) ) ;
  }
}
