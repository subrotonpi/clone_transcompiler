public static void main ( int t , String [ ] args ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] levels = new int [ N ] [ ] ;
  for ( int i : xrange ( N ) ) levels [ i ] = ArrayUtil . parseInt ( readLine ( ) . split ( " " ) ) ;
  int r = 0 ;
  int s = 0 ;
  while ( true ) {
    boolean c = false ;
    for ( int i : xrange ( N ) ) {
      if ( levels [ i ] [ 1 ] != - 1 && levels [ i ] [ 1 ] <= s ) {
        if ( levels [ i ] [ 0 ] != - 1 ) s ++ ;
        s ++ ;
        r ++ ;
        levels [ i ] = new int [ ] {
          - 1 , - 1 }
          ;
          c = true ;
          break ;
        }
      }
      if ( c ) continue ;
      int max_2v = - 1 ;
      int max_2i = - 1 ;
      for ( int i : xrange ( N ) ) {
        if ( levels [ i ] [ 0 ] != - 1 && levels [ i ] [ 0 ] <= s ) {
          if ( levels [ i ] [ 1 ] > max_2v ) {
            max_2v = levels [ i ] [ 1 ] ;
            max_2i = i ;
          }
        }
      }
      if ( max_2v != - 1 ) {
        r ++ ;
        s ++ ;
        levels [ max_2i ] = - 1 ;
        continue ;
      }
      break ;
    }
    if ( s == N * 2 ) System . out . println ( "Case #" + ( t + 1 ) + ": " + r ) ;
    else System . out . println ( "Case #" + ( t + 1 ) + ": Too Bad" ) ;
  }
  