, * ▁ @ see ▁ # countDigits ( int ) ▁ * / public static Scanner input ( Scanner s , int a , int g ) {
  Scanner c = s . useDelimiter ( " " ) ;
  if ( a == g ) {
    if ( ( s . length ( ) - c . nextInt ( ) * 2 ) % 2 != 0 ) {
      System . out . println ( "Second" ) ;
    }
    else {
      System . out . println ( "First" ) ;
    }
  }
  else {
    if ( ( s . length ( ) - max ( c . nextInt ( ) , c . nextInt ( ) ) * 2 ) % 2 != 0 ) {
      System . out . println ( "First" ) ;
    }
    else {
      System . out . println ( "Second" ) ;
    }
  }
  return new Scanner ( s ) ;
}
