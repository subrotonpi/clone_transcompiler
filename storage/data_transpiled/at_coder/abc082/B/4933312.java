public static void print ( String s ) {
  String t = input ( ) ;
  ArrayList < String > sSorted = new ArrayList < String > ( s ) ;
  ArrayList < String > tSorted = new ArrayList < String > ( t ) ;
  Collections . sort ( sSorted ) ;
  Collections . sort ( tSorted ) ;
  if ( sSorted . compareTo ( tSorted ) < 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
