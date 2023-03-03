public static List < Integer > convert ( String input ) {
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  a = new ArrayList < > ( a ) ;
  int c = a . get ( 0 ) % 2 + a . get ( 1 ) % 2 + a . get ( 2 ) % 2 ;
  int ans = 0 ;
  if ( ( c == 0 ) || ( c == 3 ) ) {
    ans += a . get ( 2 ) - a . get ( 0 ) + a . get ( 2 ) - a . get ( 1 ) ;
    ans /= 2 ;
  }
  else {
    if ( ( c == 1 ) && ( a . get ( 0 ) % 2 == 0 ) ) {
      a . set ( i ) ;
    }
  }
  else if ( ( c == 2 ) && ( a . get ( 0 ) % 2 != 0 ) ) {
    a . set ( i ) ;
  }
  ans ++ ;
  ans += ( a . get ( 2 ) - a . get ( 0 ) + a . get ( 2 ) - a . get ( 1 ) ) / 2 ;
  return ans ;
}
