public static int N = Integer . parseInt ( input ) {
  ArrayList < Integer > xyh = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xyh . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  return xyh . size ( ) > 2 ? xyh . get ( 2 ) : 0 ;
}
