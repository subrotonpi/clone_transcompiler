public static String solve ( String string ) {
  int n = Integer . parseInt ( string ) ;
  int m = Integer . parseInt ( string ) ;
  int ... a = Integer . parseInt ( string ) ;
  Map < Integer , Integer > needs = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    n = Integer . parseInt ( "2 5 5 4 5 6 3 7 6" ) ;
  }
  if ( a . contains ( 2 ) && a . contains ( 5 ) || a . contains ( 2 ) && a . contains ( 3 ) ) {
    a [ a . length - 1 ] = 2 ;
  }
  if ( a . contains ( 3 ) && a . contains ( 5 ) ) {
    a [ a . length - 1 ] = 3 ;
  }
  if ( a . contains ( 6 ) && a . contains ( 9 ) ) {
    a [ a . length - 1 ] = 6 ;
  }
  List < Integer > b = new ArrayList < > ( a ) ;
  Collections . sort ( b , needs ) ;
  int index = 0 ;
  String base = Integer . toString ( b . get ( 0 ) ) * ( n / needs . get ( b . get ( 0 ) ) ) ;
  n %= needs . get ( b . get ( 0 ) ) ;
  while ( n > 0 ) {
    List < Integer > use = new ArrayList < > ( ) ;
    for ( Integer _b : b ) {
      if ( needs . get ( _b ) <= needs . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) {
        use . add ( _b ) ) ;
      }
      if ( use . size ( ) == 1 ) {
        base = base . substring ( 0 , base . length ( ) - 1 ) ;
        n += needs . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get ( b . get (