public static void input ( ) {
  int count = 0 ;
  List < Integer > countList = new ArrayList < > ( ) ;
  String seq = "A" ;
  seq = "T" ;
  seq = "G" ;
  for ( char base : s ) {
    if ( seq . indexOf ( base ) >= 0 ) {
      count ++ ;
    }
    else {
      countList . add ( count ) ;
      count = 0 ;
    }
    countList . add ( count ) ;
  }
  System . out . println ( max ( countList ) ) ;
}
