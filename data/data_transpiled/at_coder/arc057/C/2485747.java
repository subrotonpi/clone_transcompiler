public static int [ ] get ( ) {
  int S = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  String s1 = String . valueOf ( S * S ) . substring ( 0 , S - 1 ) + "0" ;
  String s2 = String . valueOf ( ( S + 1 ) * S ) . substring ( 0 , S - 1 ) + "0" ;
  /* Get the number of digits */
  int top1 = Integer . parseInt ( s1 . substring ( 2 * d ) . substring ( 0 , s1 . length ( ) - 1 ) ) ;
  int top2 = Integer . parseInt ( s2 . substring ( 2 * d ) . substring ( 0 , s2 . length ( ) - 1 ) ) ;
  if ( Integer . parseInt ( s1 ) == 0 || Integer . parseInt ( s1 ) == 0 ) top1 ++ ;
  if ( Integer . parseInt ( s2 ) == 0 ) top2 -- ;
  int ad = 0 ;
  do {
    int l = Integer . parseInt ( s1 ) ;
    int r = Integer . parseInt ( s2 ) ;
    if ( l > r ) break ;
    ad ++ ;
  }
  while ( ad < 10 ) ;
  return new int [ ] {
  }
  ;
}
