static final String getSortString ( ) {
  final Function < String , Integer > f = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  final int n = Integer . parseInt ( input ) ;
  final List < List < Integer >> g = new ArrayList < > ( n + 1 ) ;
  final List < Integer > z = new ArrayList < > ( n ) ;
  final int [ ] d = new int [ n + 1 ] ;
  final List < Integer > q = new ArrayList < > ( n + 1 ) ;
  String r = "" ;
  final List < Integer > Q = new ArrayList < > ( ) ;
  heapSort ( Q , 0 , - 2 , n ) ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int a = f . apply ( ) ;
    int b = f . apply ( ) ;
    a -- ;
    b -- ;
    g . add ( a ) ;
    g . add ( new ArrayList < > ( ) ) ;
    g . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int e = heapSort ( Q ) ;
    if ( q . get ( e ) != - 1 ) continue ;
    q . set ( e ) ;
    for ( final List < Integer > f : g . get ( e ) ) if ( d . get ( e ) > e ) d . get ( e ) ;
    else r = "No" ;
  }
  System . out . println ( r . equals ( "Yes\n" ) + Arrays . toString ( d . subList ( 0 , n ) ) ) ;
  return r ;
}
