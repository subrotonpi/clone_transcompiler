public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < Integer > xyz = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) xyz . add ( Integer . parseInt ( input ) ) ;
  int [ ] [ ] ans = new int [ 8 ] [ 8 ] ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    int x = xyz . get ( i ) ;
    int y = xyz . get ( i ) ;
    int z = xyz . get ( i ) ;
    for ( int j = 0 ;
    j < 8 ;
    j ++ ) ans [ j ] [ j ] = x * ( ( - 1 ) * i ) + y * ( ( - 1 ) * ( i / 2 ) ) + z * ( ( - 1 ) * ( i / 4 ) ) ;
  }
  int [ ] [ ] out = new int [ 8 ] [ ] ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    ans [ i ] = ans [ i ] [ j ] ;
  }
  return out ;
}
