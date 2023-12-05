public static List < Integer > num = new ArrayList < > ( ) {
  for ( String n : input . nextLine ( ) . replaceAll ( " " , "" ) . split ( " " ) ) {
    if ( num . indexOf ( 5 ) == 2 && num . indexOf ( 7 ) == 1 ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
}
