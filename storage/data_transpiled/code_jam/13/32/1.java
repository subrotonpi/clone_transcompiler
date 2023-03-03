public static int T = Integer . parseInt ( input ) {
  for ( int TT = 1 ;
  TT <= T ;
  TT ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) , y = Integer . parseInt ( input . readLine ( ) ) ;
    int s = 0 ;
    int now = 1 ;
    String ans = "" ;
    while ( s < Math . abs ( x ) + Math . abs ( y ) || s % 2 != Math . abs ( x + y ) % 2 ) {
      s += now ;
      now ++ ;
    }
    for ( int i = now - 1 ;
    i > 0 ;
    i -- ) {
      s -= i ;
      if ( Math . abs ( x - i ) + Math . abs ( y ) <= s ) {
        x -= i ;
        ans += 'E' ;
      }
      else if ( Math . abs ( x + i ) + Math . abs ( y ) <= s ) {
        x += i ;
        ans += 'W' ;
      }
      else if ( Math . abs ( x ) + Math . abs ( y - i ) <= s ) {
        y -= i ;
        ans += 'N' ;
      }
      else {
        y += i ;
        ans += 'S' ;
      }
    }
    ans = ans . substring ( 0 , ans . length ( ) - 1 ) ;
    System . out . println ( "Case #" + TT + ": " + ans ) ;
  }
  return T ;
}
