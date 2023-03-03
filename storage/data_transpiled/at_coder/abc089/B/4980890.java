public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < String > arr = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr . add ( input . substring ( i , i + 1 ) ) ;
  }
  int count = 0 ;
  if ( arr . indexOf ( 'P' ) != 0 ) {
    count ++ ;
  }
  if ( arr . indexOf ( 'Y' ) != 0 ) {
    count ++ ;
  }
  if ( arr . indexOf ( 'W' ) != 0 ) {
    count ++ ;
  }
  if ( arr . indexOf ( 'G' ) != 0 ) {
    count ++ ;
  }
  if ( count == 3 ) {
    System . out . println ( "Three" ) ;
  }
  if ( count == 4 ) {
    System . out . println ( "Four" ) ;
  }
}
