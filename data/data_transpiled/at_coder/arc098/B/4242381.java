public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > numbers = new ArrayList < > ( ) ;
  for ( String s : input . nextLine ( ) . replaceAll ( "\b" , "" ) . split ( "\\s+" ) ) {
    numbers . add ( Integer . parseInt ( s ) ) ;
  }
  int startNumber = numbers . remove ( 0 ) ;
  Map < Integer , Integer > targets = new HashMap < > ( ) ;
  targets . put ( startNumber , 1 ) ;
  int total = 0 ;
  @ SuppressWarnings ( "unchecked" ) Iterator < Integer > iterator = numbers . iterator ( ) ;
  while ( iterator . hasNext ( ) ) {
    int number = iterator . next ( ) ;
    Map < Integer , Integer > nextTargets = new HashMap < > ( ) ;
    iterator = targets . entrySet ( ) . iterator ( ) ;
    while ( iterator . hasNext ( ) ) {
      int target = targets . get ( iterator . next ( ) ) ;
      total += target ;
      if ( ( number | target ) >= ( target + number ) ) {
        nextTargets . put ( target + number , count ) ;
      }
    }
    nextTargets . put ( number , 1 ) ;
    targets = nextTargets ;
  }
  iterator = targets . entrySet ( ) . iterator ( ) ;
  while ( iterator . hasNext ( ) ) {
    int target = targets . get ( iterator . next ( ) ) ;
    total += target ;
  }
  System . out . println ( total ) ;
}
