@ VisibleForTesting static List < Entry < String , Double >> binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Entry < String , Double >> items = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    items . add ( new Entry < > ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  items = new ArrayList < > ( items ) ;
  Collections . sort ( items ) ;
  List < Double > ans = new ArrayList < > ( ) ;
  for ( Entry < String , Double > w : items ) {
    int i = w . compareTo ( h ) ;
    if ( i >= 0 ) ans . add ( w ) ;
    else ans . set ( i ) ;
  }
  return ans ;
}
