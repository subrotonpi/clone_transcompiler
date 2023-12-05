@ VisibleForTesting static void main ( String input ) {
  final int h = 0 ;
  int w = 0 ;
  int index = 0 ;
  int n = Integer . parseInt ( input ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) ) ;
  }
  Map < Integer , Integer > l = new HashMap < > ( a ) ;
  List < Map . Entry < Integer , Integer >> l2 = new ArrayList < > ( l . entrySet ( ) ) ;
  l2 . sort ( ) ;
  for ( int i = 0 ;
  i < l2 . size ( ) ;
  i ++ ) {
    if ( l2 . get ( i ) . getValue ( ) >= 2 ) {
      if ( l2 . get ( i ) . getValue ( ) >= 4 ) {
        System . out . println ( l2 . get ( i ) . getValue ( ) ) ;
      }
    }
  }
  System . out . println ( h * w ) ;
}
