public static void print ( String s ) {
  String t = input . nextLine ( ) . trim ( ) ;
  Arrays . sort ( s ) ;
  Arrays . sort ( t ) ;
  int sl = Arrays . binarySearch ( s , t ) ;
  int tl = Arrays . binarySearch ( t , s ) ;
  if ( sl < tl ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
