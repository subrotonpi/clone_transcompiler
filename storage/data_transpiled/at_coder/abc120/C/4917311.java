public static void input ( ) {
  S = input ( ) ;
  int red_count = S . count ( "0" ) ;
  int ao_count = S . count ( "1" ) ;
  System . out . println ( min ( red_count , ao_count ) * 2 ) ;
}
