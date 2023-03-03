public static void print ( int a ) {
  List < List < Integer >> ar = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    int l = input . nextInt ( ) ;
    ar . add ( l ) ;
  }
  Set < Integer > br = new HashSet < > ( ) ;
  br . add ( ar . get ( 0 ) ) ;
  List < Integer > dr = new ArrayList < > ( ) ;
  for ( Integer r : br ) {
    cr . add ( r ) ;
  }
}
