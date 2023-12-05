public static boolean hantei ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] xyh = new int [ N ] [ 3 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) xyh [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int maxh = 0 ;
  int minh = 10 * 9 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( xyh [ i ] [ 2 ] > maxh ) maxh = xyh [ i ] [ 2 ] ;
    if ( xyh [ i ] [ 2 ] < minh ) minh = xyh [ i ] [ 2 ] ;
  }
  return ( true ) ;
}
