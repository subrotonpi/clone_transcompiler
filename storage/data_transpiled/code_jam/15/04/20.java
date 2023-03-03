static final String solve ( ) {
  if ( __name__ == "solve" ) {
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . print ( "Case #" + ( i + 1 ) + ": " ) ;
      int x = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      int r = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      int c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      r = Math . min ( r , c ) ;
      c = Math . max ( r , c ) ;
      String ans = "GABRIEL" ;
      if ( x == 1 ) {
      }
      else if ( x > 6 ) {
        ans = "RICHARD" ;
      }
      else if ( ( r * c ) % x != 0 ) {
        ans = "RICHARD" ;
      }
      else if ( c < x ) {
        ans = "RICHARD" ;
      }
      else if ( x > 2 && r == 1 ) {
        ans = "RICHARD" ;
      }
      else if ( x > 4 && r < 3 ) {
        ans = "RICHARD" ;
      }
      else if ( ( x = x ) == ( 4 ) || ( x = 2 ) == ( 2 ) ) {
        ans = "RICHARD" ;
      }
      else if ( ( x = x ) == ( 5 ) || ( x = 3 ) == ( 5 ) || ( x = 3 ) == ( 6 ) ) {
        ans = "RICHARD" ;
      }
      System . out . println ( ans ) ;
    }
  }
  return "" ;
}
