static int N ( int a , int N ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > b = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    b . add ( i + 1 ) ;
  }
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    map . put ( i + 1 , b . get ( i ) ) ;
  }
  int [ ] c = new int [ N + 1 ] ;
  c [ N + 1 ] = - 1 ;
  int w = a ;
  int i = 0 ;
  while ( k > 0 ) {
    if ( c [ w ] != - 1 ) {
      int start = c [ w ] ;
      int end = i ;
      k %= ( end - start ) ;
      break ;
    }
    w = map . get ( w ) ;
  }
  return w ;
}
