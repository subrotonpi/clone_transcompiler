public static void print ( int n ) {
  String [ ] h = input . nextLine ( ) . split ( " " ) ;
  int [ ] array = new int [ n ] ;
  for ( String _h : h ) {
    array [ i ] = Integer . parseInt ( _h ) ;
  }
  int counter = array [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( array [ i ] > array [ i - 1 ] ) {
      counter += array [ i ] - array [ i - 1 ] ;
    }
  }
  System . out . println ( counter ) ;
}
