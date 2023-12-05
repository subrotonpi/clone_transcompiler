public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) B . add ( Collections . singletonList ( i ) ) ;
  int [ ] [ ] A = new int [ M ] [ N ] ;
  A [ 1 ] = B . get ( 0 ) ;
  A [ 2 ] = B . get ( 1 ) ;
  A [ 2 ] = B . get ( 2 ) ;
  return A ;
}
