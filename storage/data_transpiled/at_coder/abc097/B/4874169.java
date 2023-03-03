public static int n = Integer . parseInt ( input ) {
  int [ ] x = new int [ 33 ] ;
  for ( int i = 1 ;
  i <= 33 ;
  i ++ ) {
    x = x [ i ] ;
  }
  Arrays . sort ( x ) ;
  final int b = x . length ;
  System . out . println ( x [ b - 1 ] ) ;
}
