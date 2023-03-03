public static String print ( ) {
  int n = input . nextInt ( ) ;
  String s ;
  if ( n == 100 ) {
    s = "Perfect" ;
  }
  else if ( n > 89 ) {
    s = "Great" ;
  }
  else if ( n > 59 ) {
    s = "Good" ;
  }
  else {
    s = "Bad" ;
  }
  return s ;
}
