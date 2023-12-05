public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < String > said = new HashSet < > ( ) ;
  String first = input . nextLine ( ) ;
  said . add ( first ) ;
  String last = first . substring ( first . length ( ) - 1 ) ;
  boolean isShiritori = true ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    String word = input . nextLine ( ) ;
    if ( said . contains ( word ) || word . charAt ( 0 ) != last ) {
      isShiritori = false ;
    }
    said . add ( word ) ;
    last = word . substring ( word . length ( ) - 1 ) ;
  }
  if ( isShiritori ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
