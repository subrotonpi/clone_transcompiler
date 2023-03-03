public static void main ( String N , int M , int X , int Y ) {
  Scanner input = new Scanner ( System . in ) ;
  List < Integer > x = new LinkedList < Integer > ( ) ;
  List < Integer > y = new LinkedList < Integer > ( ) ;
  x . add ( X ) ;
  y . add ( Y ) ;
  int max_x = max ( x ) ;
  int min_y = min ( y ) ;
  if ( max_x < min_y ) {
    System . out . println ( "No War" ) ;
  }
  else {
    System . out . println ( "War" ) ;
  }
}
