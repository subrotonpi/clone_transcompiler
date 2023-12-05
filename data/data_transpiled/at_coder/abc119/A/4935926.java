public static void main ( String input ) {
  int y = Integer . parseInt ( input . substring ( 0 , input . indexOf ( "/" ) ) ) ;
  int m = Integer . parseInt ( input . substring ( input . indexOf ( "/" ) + 1 , input . length ( ) ) ) ;
  int d = Integer . parseInt ( input . substring ( input . indexOf ( "/" ) + 1 , input . length ( ) ) ) ;
  if ( y < 2019 ) {
    System . out . println ( "Heisei" ) ;
  }
  else if ( y == 2019 && m <= 4 ) {
    System . out . println ( "Heisei" ) ;
  }
  else {
    System . out . println ( "TBD" ) ;
  }
}
