static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Function f = new Function ( ) {
    @ Override public int apply ( String input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  int a = f . apply ( ) ;
  int b = f . apply ( ) ;
  int c = f . apply ( ) ;
  int d = f . apply ( ) ;
  int melt = f . apply ( ) ;
  int mass = f . apply ( ) ;
  int [ ] wat = new int [ mass / 100 / a + 1 ] ;
  for ( int i = 0 ;
  i < mass / 100 / a + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < mass / 100 / b + 1 ;
    j ++ ) {
      if ( i * a + j * b <= mass / 100 ) {
        wat [ i ] = ( i * a + j * b ) * 100 ;
      }
      else {
        break ;
      }
    }
  }
  int [ ] sug = new int [ mass / c + 1 ] ;
  for ( int i = 0 ;
  i < mass / c + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < mass / d + 1 ;
    j ++ ) {
      sug [ j ] = i * c + j * d ;
    }
  }
  int [ ] ans = {
    0 , 0 }
    ;
    float cons = - Float . MAX_VALUE ;
    for ( int s : sug ) {
      for ( int w : wat ) {
        if ( w > 0 && s / w > cons && s + w <= mass && s <= w * melt / 100 ) {
          cons = s / w ;
          ans = new int [ ] {
            s + w , s }
            ;
          }
        }
      }
      System . out . println ( ( int ) ans ) ;
    }
    