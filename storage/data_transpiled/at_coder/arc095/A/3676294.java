public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] array = new int [ n ] ;
  for ( int i = 0 ;
  i < array . length ;
  i ++ ) array [ i ] = Integer . parseInt ( input ) ;
  int [ ] use = array . clone ( ) ;
  Arrays . sort ( use ) ;
  int l = use [ n / 2 - 1 ] ;
  int r = use [ n / 2 ] ;
  for ( int i = 0 ;
  i < array . length ;
  i ++ ) {
    if ( array [ i ] <= l ) System . out . println ( r ) ;
    else System . out . println ( l ) ;
  }
}
