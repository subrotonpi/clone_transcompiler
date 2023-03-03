public static String ans ( int a , int b , int c , int k ) {
  int i = ( int ) i ;
  String ans = ( String ) input . split ( " " ) [ 0 ] ;
  if ( Math . abs ( i ) >= 10e18 ) {
    return "Unfair" ;
  }
  else {
    return ans ;
  }
  if ( k % 2 == 0 ) {
    System . out . println ( ans ( a - b ) ) ;
  }
  else {
    System . out . println ( ans ( b - a ) ) ;
  }
  return ans ;
}
