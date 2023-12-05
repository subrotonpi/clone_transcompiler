public static int N = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = Math . abs ( X - x [ i ] ) ;
  }
  Arrays . sort ( x ) ;
  return x . length ;
}
