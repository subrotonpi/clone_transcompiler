public static void print ( int n , int a , int b ) {
  int c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . next ( ) ;
    String d = input . next ( ) ;
    d = Integer . parseInt ( d ) ;
    d = d < a ? a : d > b ? b : d ;
    if ( s . equals ( "East" ) ) {
      c += d ;
    }
    else {
      c -= d ;
    }
  }
  String ans ;
  if ( c == 0 ) {
    ans = 0 ;
  }
  else if ( c < 0 ) {
    ans = "West" + " " + - c ;
  }
  else {
    ans = "East" + " " + c ;
  }
  System . out . println ( ans ) ;
}
