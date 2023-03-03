public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , input . indexOf ( " " ) ) ) ;
  int w = Integer . parseInt ( input . substring ( input . indexOf ( " " ) + 1 , input . indexOf ( " " ) ) ) ;
  List < String > hw = new ArrayList < String > ( ) ;
  for ( int j = 0 ;
  j < h ;
  j ++ ) hw . add ( Collections . singletonList ( input . substring ( i , j + 1 ) ) ) ;
  boolean [ ] tf = new boolean [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) tf [ i ] = true ;
  List < String > ans = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < hw . size ( ) ;
  i ++ ) {
    if ( hw . get ( i ) . indexOf ( "." ) != w ) ans . add ( hw . get ( i ) ) ;
    for ( int j = 0 ;
    j < hw . get ( i ) . length ( ) ;
    j ++ ) {
      if ( hw . get ( i ) . charAt ( j ) == '#' ) tf [ j ] = false ;
    }
  }
  for ( int i = 0 ;
  i < ans . size ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < tf . length ;
    j ++ ) {
      if ( ! tf [ j ] ) System . out . print ( ans . get ( i ) . charAt ( j ) + " " ) ;
    }
    System . out . println ( "" ) ;
  }
}
