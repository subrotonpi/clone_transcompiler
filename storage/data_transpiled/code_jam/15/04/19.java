static boolean solve ( int x , int r , int c ) {
  if ( ( r * c ) % x != 0 ) return true ;
  if ( ( r < x ) && ( c < x ) ) return true ;
  if ( Math . min ( r , c ) * 2 + 1 <= x ) return true ;
  if ( x < 4 ) return false ;
  if ( x > 6 ) return true ;
  if ( x == 4 ) {
    if ( Math . min ( r , c ) <= 2 ) return true ;
    else return false ;
  }
  if ( x == 5 ) {
    if ( ( Math . min ( r , c ) == 3 ) && ( Math . max ( r , c ) == 5 ) ) return true ;
    else return false ;
  }
  if ( x == 6 ) {
    if ( Math . min ( r , c ) == 3 ) return true ;
    else return false ;
  }
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    x = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    r = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    x = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    r = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ( solve ( x , r , c ) ? "RICHARD" : "GABRIEL" ) ) ;
  }
  return false ;
}
