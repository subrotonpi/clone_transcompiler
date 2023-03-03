public static int N = Integer . parseInt ( input ) {
  List < Integer > lr = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) lr . add ( Collections . singletonList ( i ) ) ;
  return lr . size ( ) - 1 + 1 ;
}
