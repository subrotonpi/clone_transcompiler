public static int getNum ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = list ( input . nextLine ( ) ) ;
  String t = list ( input . nextLine ( ) ) ;
  List < String > alp = list ( "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ) ;
  boolean [ ] flag = new boolean [ 30 ] ;
  for ( int i = 0 ;
  i < 30 ;
  i ++ ) flag [ i ] = true ;
  int [ ] key = new int [ 30 ] ;
  int [ ] [ ] group = new int [ 30 ] [ 30 ] ;
  Map < Integer , Integer > dic = new HashMap < Integer , Integer > ( ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( alp . contains ( s . charAt ( i ) ) && alp . contains ( t . charAt ( i ) ) ) {
      int a = alp . indexOf ( s . charAt ( i ) ) ;
      int b = alp . indexOf ( t . charAt ( i ) ) ;
      if ( key [ a ] != key [ b ] ) {
        int v = key [ b ] ;
        group [ key [ a ] ] = group [ key [ a ] ] + group [ key [ b ] ] ;
        for ( int j = 0 ;
        j < group [ v ] . length ;
        j ++ ) key [ j ] = key [ a ] ;
        group [ v ] = new int [ 30 ] ;
      }
    }
  }
  for ( int i = 0 ;
  i < 30 ;
  i ++ ) dic . put ( i , 1 ) ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    if ( ! alp . contains ( s . charAt ( i ) ) && ! alp . contains ( t . charAt ( i ) ) ) {
      dic . put ( key [ alp . indexOf ( t . charAt ( i ) ) ] , 1 ) ;
      flag [ key [ alp . indexOf ( t . charAt ( i ) ) ] ] = false ;
    }
    if ( s . charAt ( i ) == '-' && t . charAt ( i ) == '-' ) {
      dic . put ( key [ alp . indexOf ( s . charAt ( i ) ) ] , 1 ) ;
      flag [ key [ alp . indexOf ( t . charAt ( i ) ) ] = false ;
    }
    if ( s . charAt ( i ) == '-' ) {
      if ( flag [ key [