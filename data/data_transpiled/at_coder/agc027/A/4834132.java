public static int N ( int x ) {
  int [ ] a = ( int [ ] ) input . split ( " " ) ;
  Arrays . sort ( a ) ;
  int out = 0 ;
  for ( int i : a ) {
    if ( x >= i ) {
      x -= i ;
      out ++ ;
    }
    else {
      break ;
    }
  }
  return out ;
}
