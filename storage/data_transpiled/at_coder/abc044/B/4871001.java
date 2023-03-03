public static void input ( Scanner in ) {
  Map < String , Integer > map = new HashMap < String , Integer > ( ) ;
  for ( String s : in . nextLine ( ) . split ( "\\s+" ) ) {
    map . put ( s , map . getOrDefault ( s , 0 ) + 1 ) ;
  }
  boolean flag = true ;
  for ( int x : map . values ( ) ) {
    if ( x % 2 != 0 ) {
      flag = false ;
    }
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
