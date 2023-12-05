public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int q = Integer . parseInt ( input ) ;
  String s = String . valueOf ( input ) ;
  int [ ] a = new int [ n + 1 ] ;
  a [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . substring ( i , i + 2 ) . equals ( "AC" ) ) {
      a [ i + 1 ] = a [ i ] + 1 ;
    }
    else {
      a [ i + 1 ] = a [ i ] + 0 ;
    }
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    System . out . println ( ( int ) ( a [ c - 1 ] - a [ b - 1 ] ) ) ;
  }
}
