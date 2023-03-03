public static int sum ( int x , int base ) {
  int r = 0 ;
  while ( x > 0 ) {
    r += ( x % base ) * ( x % base ) ;
    x /= base ;
  }
  java . util . HashMap < Integer , Integer > happy = new java . util . HashMap < Integer , Integer > ( ) ;
  {
    if ( x == 1 ) return 1 ;
    if ( ( x = happy . containsKey ( ( x ) ) ) ) return happy . get ( ( x ) ) ;
    happy . put ( ( x ) , 0 ) ;
    int r = happy . get ( sum ( x , base ) , base ) ;
    happy . put ( ( x ) , r ) ;
    return r ;
  }
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i : xrange ( T ) ) {
    int [ ] bases = map . get ( i ) ;
    int x = 1 ;
    while ( true ) {
      x ++ ;
      boolean h = true ;
      for ( int b : bases ) {
        if ( ! happy . containsKey ( x , b ) ) {
          h = false ;
          break ;
        }
      }
      if ( h ) {
        System . out . println ( "Case #" + ( i + 1 ) + ": " + x ) ;
        break ;
      }
    }
  }
  return x ;
}
