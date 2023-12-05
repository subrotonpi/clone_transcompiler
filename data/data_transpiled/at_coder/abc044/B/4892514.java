@ VisibleForTesting static LinkedHashMap < String , Integer > input ( ) {
  String w = input . nextLine ( ) ;
  Map < String , Integer > num = new HashMap < > ( w ) ;
  List < Integer > ans = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < num . size ( ) ;
  i ++ ) {
    ans . add ( num . values ( ) [ i ] ) ;
  }
  if ( ! CollectionUtils . isEmpty ( ans ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return ans ;
}
