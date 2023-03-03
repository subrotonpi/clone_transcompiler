public static void print ( int n , int a , int b ) {
  Scanner input = new Scanner ( System . in ) ;
  int [ ] [ ] sd = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sd [ i ] = input . nextInt ( ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < sd . length ;
  i ++ ) {
    String s = sd [ i ] [ 0 ] ;
    String d = sd [ i ] [ 1 ] ;
    int dist = Math . min ( b , Math . max ( a , Integer . parseInt ( d ) ) ) ;
    if ( s . equals ( "East" ) ) {
      res += dist ;
    }
    else {
      res -= dist ;
    }
  }
  if ( res == 0 ) {
    System . out . println ( 0 ) ;
  }
  else if ( res > 0 ) {
    System . out . println ( "East " + res ) ;
  }
  else {
    System . out . println ( "West " + - res ) ;
  }
}
