public static int convert ( int m , boolean e ) {
  if ( m % 5 == 0 ) return m ;
  else {
    if ( e ) return m + ( 5 - m % 5 ) ;
    else return m - ( m % 5 ) ;
  }
  boolean [ ] blocks = new boolean [ 12 * 24 ] ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int e = Integer . parseInt ( input . nextLine ( ) ) ;
    int sb = ( int ) ( s / 100 ) * 12 + ( int ) convert ( s % 100 ) / 5 ;
    int eb = ( int ) ( e / 100 ) * 12 + ( int ) convert ( e % 100 , true ) / 5 ;
    for ( int a = sb ;
    a < eb ;
    a ++ ) blocks [ a ] = true ;
  }
  boolean pb = false ;
  for ( int i = 0 ;
  i < blocks . length ;
  i ++ ) {
    if ( pb == false && blocks [ i ] == true ) System . out . print ( String . format ( "%02d%02d-" , i / 12 , 5 * ( i % 12 ) ) ) ;
    else if ( pb == true && blocks [ i ] == false ) System . out . println ( String . format ( "%02d%02d" , i / 12 , 5 * ( i % 12 ) ) ) ;
    else if ( blocks [ i ] == true && blocks [ i ] == false ) System . out . println ( "2400" ) ;
    pb = blocks [ i ] ;
  }
  return blocks [ 0 ] ? m : m ;
}
