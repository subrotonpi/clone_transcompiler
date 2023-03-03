public static void print ( int N ) {
  int [ ] P = new int [ N ] ;
  for ( String _ : input ( ) . split ( " " ) ) {
    P [ i ] = Integer . parseInt ( _ ) - 1 ;
  }
  ArrayList < Integer > Q = new ArrayList < > ( Arrays . asList ( P ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Q . add ( new Integer ( P [ i ] ) ) ;
  }
  int [ ] A = new int [ 1 ] ;
  int [ ] B = new int [ 10 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = 1 ;
    B [ i ] = 1 ;
  }
}
