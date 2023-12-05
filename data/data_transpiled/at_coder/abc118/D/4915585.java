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
  if ( a . contains ( 2 ) && a . contains ( 5 ) ) {
    a [ a . length - 1 ] = 2 ;
  }
  if ( a . contains ( 3 ) && a . contains ( 5 ) ) {
    a [ a . length - 1 ] = 3 ;
  }
  if ( a . contains ( 2 ) && a . contains ( 3 ) ) {
    a [ a . length - 1 ] = 2 ;
  }
  if ( a . contains ( 6 ) && a . contains ( 9 ) ) {
    a [ a . length - 1 ] = 6 ;
  }
  List < Integer > b = new ArrayList < > ( a ) ;
  Collections . sort ( b , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return needs . get ( o1 ) - needs . get ( o2 ) ;
    }
  }
  ) ;
  int index = 0 ;
  String base = Integer . toString ( b . get ( 0 ) ) * ( n / needs . get ( b . get ( 0 ) ) ) ;
  n %= needs . get ( b . get ( 0 ) ) ;
  while ( n > 0 ) {
    List < Integer > use = new ArrayList < > ( ) ;
    for ( Integer _b : b ) {
      if ( needs . get ( _b ) <= needs . get ( b . get ( 0 ) ) + n ) {
        use . add ( _b ) ;
      }
    }
    if ( use . size ( ) == 1 ) {
      base = base . substring ( 0 , base . length ( ) - 1 ) ;
      n += needs . get ( b . get ( 0 ) ) ;
    }
    else if ( Collections . max ( use ) == b . get ( 0 ) ) {
      int tmpN = use . get ( use . size ( ) - 1 ) ;
      int tmpC = n / ( needs . get ( tmpN ) - needs . get ( b . get ( 0 ) ) ) ;
      base = base . substring ( 0 , base . length ( ) - tmpC ) + tmp @ @