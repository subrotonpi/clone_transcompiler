public static int N ( Scanner input ) {
  int [ ] A = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  Arrays . sort ( A ) ;
  int before = - 1 ;
  int [ ] pair = new int [ 2 ] ;
  for ( int i = 0 ;
  i < pair . length - 1 ;
  i ++ ) {
    int a = sortedA [ i ] ;
    if ( a != before ) {
      before = a ;
    }
    else if ( a == before ) {
      pair [ i ] = a ;
      if ( pair . length == 2 ) break ;
      before = - 1 ;
    }
  }
  int ans = 0 ;
  if ( pair . length == 2 ) {
    ans = pair [ 0 ] * pair [ 1 ] ;
  }
  return ans ;
}
