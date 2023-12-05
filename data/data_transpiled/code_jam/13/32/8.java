static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int ca : xrange ( 1 , T + 1 ) ) {
  Arrays . fill ( X , Integer . parseInt ( System . console ( ) . readLine ( ) ) ) ;
  Arrays . fill ( Y , Integer . parseInt ( System . console ( ) . readLine ( ) ) ) ;
  System . out . printf ( "Case #%d: " , ca ) ;
  if ( X > 0 ) {
    for ( int i = 0 ;
    i < X ;
    i ++ ) {
      System . out . print ( "W" ) ;
      System . out . print ( "E" ) ;
    }
  }
  else {
    X = - X ;
    for ( int i = 0 ;
    i < X ;
    i ++ ) {
      System . out . print ( "E" ) ;
      System . out . print ( "W" ) ;
    }
  }
  if ( Y > 0 ) {
    for ( int i = 0 ;
    i < Y ;
    i ++ ) {
      System . out . print ( "S" ) ;
      System . out . print ( "N" ) ;
      System . out . print ( "S" ) ;
    }
  }
  else {
    Y = - Y ;
    for ( int i = 0 ;
    i < Y ;
    i ++ ) {
      System . out . print ( "N" ) ;
      System . out . print ( "S" ) ;
    }
  }
  System . out . println ( "" ) ;
}
