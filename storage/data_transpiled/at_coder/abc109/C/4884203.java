public static int N ( String input ) {
  int X = Integer . parseInt ( input ) ;
  int xn = Integer . parseInt ( input ) ;
  int [ ] dxn = new int [ xn ] ;
  for ( int i = 0 ;
  i < dxn . length ;
  i ++ ) {
    dxn [ i ] = Math . abs ( xn [ i ] ) ;
  }
  return N ;
}
