static final List < Integer > list ( ) {
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( Integer p : input ( ) ) {
    l . add ( Integer . valueOf ( p ) ) ;
  }
  Collections . sort ( l , Collections . reverseOrder ( ) ) ;
  System . out . println ( sm . get ( 2 ) ) ;
}
