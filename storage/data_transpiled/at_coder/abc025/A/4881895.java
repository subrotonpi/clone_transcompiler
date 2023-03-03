static final String getString ( ) {
  String S = input ( ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  ArrayList < String > arr = new ArrayList < > ( Collections . singletonList ( S ) ) ;
  String [ ] names = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    names [ i ] = arr . get ( i ) + "" ;
  }
  return names [ N - 1 ] ;
}
