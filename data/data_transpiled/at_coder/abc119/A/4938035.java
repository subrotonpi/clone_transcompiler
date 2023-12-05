public static void input ( ) {
  String s = input . readLine ( ) ;
  if ( Integer . parseInt ( s . substring ( 0 , 4 ) ) < 2019 ) {
    System . out . println ( "Heisei" ) ;
  }
  else if ( Integer . parseInt ( s . substring ( 0 , 4 ) ) == 2019 && Integer . parseInt ( s . substring ( 5 , 7 ) ) < 5 ) {
    System . out . println ( "Heisei" ) ;
  }
  else {
    System . out . println ( "TBD" ) ;
  }
}
