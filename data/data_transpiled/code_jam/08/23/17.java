public static void print ( int case ) {
  System . out . println ( "Case #" + ( case + 1 ) + ":" ) ;
  int K = input . nextInt ( ) ;
  List < Integer > ind = CollectionUtils . newArrayList ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    ind . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int nind = ind . remove ( 0 ) ;
  int [ ] pd = new int [ K ] ;
  int curloc = 0 ;
  List < Integer > empty = new ArrayList < Integer > ( K ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    curloc = ( curloc + i ) % empty . size ( ) ;
    pd [ empty . get ( curloc ) ] = i + 1 ;
    empty . remove ( curloc ) ;
  }
  for ( int i = 0 ;
  i < ind . size ( ) ;
  i ++ ) {
    System . out . println ( pd [ ind . get ( i - 1 ) ] + " " + ind . get ( i ) ) ;
  }
  System . out . println ( ) ;
}
