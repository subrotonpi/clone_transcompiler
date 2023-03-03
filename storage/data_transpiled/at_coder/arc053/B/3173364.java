@ Function public static void input ( ) {
  String s = input . nextLine ( ) ;
  LinkedHashMap < String , Integer > ds = new LinkedHashMap < String , Integer > ( ) ;
  ds . put ( s , 0 ) ;
  int odd = 0 ;
  int even = 0 ;
  for ( int i : ds . values ( ) ) {
    if ( i % 2 != 0 ) {
      odd ++ ;
    }
    else {
      even += i ;
    }
  }
  if ( odd < 2 ) {
    System . out . println ( s . length ( ) ) ;
  }
  else {
    System . out . println ( ( s . length ( ) - odd ) / 2 / odd * 2 + 1 ) ;
  }
}
