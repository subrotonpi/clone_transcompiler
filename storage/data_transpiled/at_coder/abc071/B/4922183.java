{
  alphabet = new HashMap ( ) ;
  backet . put ( 1 , "a" ) ;
  backet . put ( 2 , "b" ) ;
  backet . put ( 0 , 0 ) ;
  String S = input . nextLine ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    backet . put ( ( int ) S . charAt ( i ) - 97 , 1 ) ;
  }
  if ( backet . isEmpty ( ) ) {
    System . out . println ( "None" ) ;
  }
  else {
    System . out . println ( ( char ) ( backet . indexOf ( 0 ) + 97 ) ) ;
  }
}
