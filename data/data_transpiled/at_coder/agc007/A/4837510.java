public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , h ) ) , w = Integer . parseInt ( input . substring ( w ) ) ;
  int a = 0 , b = 0 ;
  String ans = "Possible" ;
  for ( int y = 0 ;
  y < h ;
  y ++ ) {
    String m = input . substring ( y , y + 1 ) ;
    a = m . indexOf ( "#" ) ;
    if ( a < b ) {
      ans = "Impossible" ;
      break ;
    }
    b = m . lastIndexOf ( "#" ) ;
  }
  System . out . println ( ans ) ;
}
