@ VisibleForTesting static Iterable < Integer > iterable ( Scanner input ) {
  int n = input . nextInt ( ) ;
  int c = input . nextInt ( ) ;
  List < Integer > l1 = new ArrayList < > ( ) ;
  List < Integer > l2 = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int v = input . nextInt ( ) ;
    l1 . add ( x ) ;
    l2 . add ( v ) ;
  }
  List < Integer > ll = new ArrayList < > ( l1 ) ;
  List < Integer > lll = new ArrayList < > ( ) ;
  List < Integer > lr = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ll . add ( i ) ;
  }
  return ll ;
}
