public static int l = Integer . parseInt ( input ) {
  int x = Integer . parseInt ( input . readLine ( ) ) ;
  int y = Integer . parseInt ( input . readLine ( ) ) ;
  int s = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  int p = l + s - d ;
  int q = d - s ;
  int r = l - s + d ;
  if ( p == 0 || q == 0 || r == 0 ) {
    System . out . println ( 0 ) ;
  }
  else if ( q > 0 && y > x ) {
    System . out . println ( Math . min ( q / ( x + y ) , p / ( y - x ) ) ) ;
  }
  else if ( q > 0 ) {
    System . out . println ( q / ( x + y ) ) ;
  }
  else if ( q < 0 && y > x ) {
    System . out . println ( Math . min ( Math . abs ( q ) / ( y - x ) , r / ( x + y ) ) ) ;
  }
  else if ( q < 0 ) {
    System . out . println ( r / ( x + y ) ) ;
  }
  return p ;
}
