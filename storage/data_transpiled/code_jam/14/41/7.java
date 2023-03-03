static int compute ( int N , int X , int [ ] S ) {
  final List < Integer > s = new ArrayList < > ( Arrays . asList ( S ) ) ;
  Collections . sort ( s ) ;
  int c = 0 ;
  int a = 0 ;
  int b = N - 1 ;
  while ( a < b ) {
    if ( s . get ( a ) + s . get ( b ) <= X ) {
      a ++ ;
      b -- ;
    }
    else {
      a ++ ;
    }
    c ++ ;
  }
  if ( a == b ) {
    c ++ ;
  }
  return c ;
}
