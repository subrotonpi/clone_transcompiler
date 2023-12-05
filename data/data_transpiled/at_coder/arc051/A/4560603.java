public static void print ( int x , int y , int r ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( s <= x - r && x + r <= h && t <= y - r && y + r <= w ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  if ( ( Math . max ( Math . abs ( x - s ) , Math . abs ( x - h ) ) * Math . pow ( 2 , 2 ) + Math . max ( Math . abs ( y - t ) , Math . abs ( y - w ) ) * Math . pow ( 2 , 2 ) ) * 0.5 <= r ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
