static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  int X = Integer . parseInt ( System . console ( ) . readLine ( ) ) , R = Integer . parseInt ( System . console ( ) . readLine ( ) ) , C = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  if ( R > C ) {
    int tmp = C ;
    C = R ;
    R = tmp ;
  }
  boolean gabriel ;
  if ( ( R * C ) % X != 0 ) {
    gabriel = false ;
  }
  else if ( X > C ) {
    gabriel = false ;
  }
  else if ( X >= 7 ) {
    gabriel = false ;
  }
  else if ( ( X + 1 ) / 2 > R ) {
    gabriel = false ;
  }
  else if ( ( X + 1 ) / 2 < R ) {
    gabriel = true ;
  }
  else if ( R == 2 ) {
    if ( X == 3 ) {
      gabriel = true ;
    }
    else {
      gabriel = false ;
    }
  }
  else if ( R == 3 ) {
    if ( X == 5 ) {
      if ( C == 5 ) {
        gabriel = false ;
      }
      else {
        gabriel = true ;
      }
    }
    else {
      gabriel = false ;
    }
  }
  else {
    gabriel = true ;
  }
  System . out . println ( "Case #" + ( t + 1 ) + ": " + ( gabriel ? "GABRIEL" : "RICHARD" ) ) ;
  return t ;
}
