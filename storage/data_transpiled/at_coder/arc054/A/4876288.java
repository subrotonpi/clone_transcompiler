public static void main ( String [ ] args ) {
  int l = Integer . parseInt ( input . readLine ( ) ) ;
  int x = Integer . parseInt ( input . readLine ( ) ) ;
  int y = Integer . parseInt ( input . readLine ( ) ) ;
  int s = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  if ( s == d ) {
    System . out . println ( 0 ) ;
    return ;
  }
  int [ ] ds = s < d ? new int [ ] {
    d - l , d }
    : new int [ ] {
      d , d + l }
      ;
      int res = ( ds [ 1 ] - s ) / ( x + y ) ;
      if ( x < y ) {
        res = Math . min ( res , ( s - ds [ 0 ] ) / ( y - x ) ) ;
      }
      System . out . println ( res ) ;
    }
    