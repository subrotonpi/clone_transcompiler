@ VisibleForTesting static String getZip ( String zipcode , List < String > list ) {
  final StringBuffer res = new StringBuffer ( ) ;
  for ( String elm : list ) {
    res . append ( zipcode . charAt ( elm ) ) ;
  }
  return res . toString ( ) ;
}
