@ VisibleForTesting static void heapSort ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . map ( Integer :: parseInt ) . toArray ( ) ;
  List < Integer > q1 = new ArrayList < > ( ) ;
  List < Integer > q2 = new ArrayList < > ( ) ;
  int [ ] s1 = new int [ n ] ;
  int [ ] s2 = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heapSort ( q1 , a [ i ] ) ;
  }
  s1 [ 0 ] = Integer . MAX_VALUE ;
  for ( int ai : a ) {
    heapSort ( q1 , ai ) ;
    int m = heapSort ( q1 ) ;
    s1 [ i ] = s1 [ i - 1 ] + ai - m ;
  }
  a = a . clone ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heapSort ( q2 , - a ) ;
    int m = heapSort ( q2 ) ;
    s2 [ i ] = s2 [ i - 1 ] + ai - m ;
  }
  int ans = s1 [ 0 ] + s2 [ n ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    ans = Math . max ( s1 [ i ] + s2 [ n - i - 1 ] , ans ) ;
  }
  System . out . println ( ans ) ;
}
