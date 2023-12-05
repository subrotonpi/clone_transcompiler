public static String print ( ) {
  int n = input . nextInt ( ) ;
  String ans ;
  if ( n <= 59 ) {
    ans = "Bad" ;
  }
  else if ( n <= 89 ) {
    ans = "Good" ;
  }
  else if ( n <= 99 ) {
    ans = "Great" ;
  }
  else {
    ans = "Perfect" ;
  }
  return ans ;
}
