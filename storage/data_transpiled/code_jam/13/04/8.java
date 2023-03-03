public static String ldiff ( List < Chest > d1 , List < Chest > d2 ) {
  List < Chest > d1c = new LinkedList < Chest > ( d1 ) ;
  for ( Chest e : d2 ) {
    if ( d1c . contains ( e ) ) d1c . remove ( e ) ;
  }
  return d1c . toString ( ) ;
}
