public static List < String > input ( ) {
  List < String > list = new LinkedList < String > ( ) ;
  for ( String s : input . nextLine ( ) . toUpperCase ( ) . split ( " " ) ) {
    list . add ( s . substring ( 0 , 1 ) ) ;
  }
  for ( String s : list ) {
    System . out . print ( s . substring ( 0 , 1 ) ) ;
  }
  return list ;
}
