public static final List < String > getUnique ( ) {
  List < String > uniqueList = new ArrayList < String > ( ) ;
  String [ ] inputArray = System . in . read ( ) . split ( " " ) ;
  for ( int i = 0 ;
  i < inputArray . length ;
  i ++ ) {
    if ( ! uniqueList . contains ( inputArray [ i ] ) ) {
      uniqueList . add ( inputArray [ i ] ) ;
    }
  }
  System . out . println ( uniqueList . size ( ) ) ;
  return uniqueList ;
}
