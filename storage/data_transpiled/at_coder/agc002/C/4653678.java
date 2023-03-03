public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int l = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i ] + a [ i + 1 ] >= l ) {
      System . out . println ( "Possible" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "Impossible" ) ;
    exit ( ) ;
  }
  List < Integer > li = Lists . newArrayList ( 1 , i + 1 ) ;
  li . add ( n - 1 , i + 1 , - 1 ) ;
  li . add ( i + 1 ) ;
  for ( Integer x : li ) {
    System . out . println ( x ) ;
  }
}
