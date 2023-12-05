public static void print ( int n = Integer . parseInt ( input ) ) {
  String [ ] sn = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sn [ i ] = input . next ( ) ;
  }
  int m = 0 , a = 0 , r = 0 , c = 0 , h = 0 ;
  for ( String s : sn ) {
    switch ( s ) {
      case "M" : m ++ ;
      break ;
    }
  }
  System . out . println ( m * a * r + m * a * c + m * a * h + m * r * c + r * h ) ;
}
