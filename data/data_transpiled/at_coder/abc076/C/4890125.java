public static String input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < S . length ( ) - T . length ( ) + 1 ;
  i ++ ) {
    int dif = 0 ;
    int same = 0 ;
    String s = S . substring ( i , i + T . length ( ) ) ;
    for ( int j = 0 ;
    j < T . length ( ) ;
    j ++ ) {
      if ( s . charAt ( j ) != '?' ) {
        if ( s . charAt ( j ) != T . charAt ( j ) ) {
          dif ++ ;
        }
        else {
          same ++ ;
        }
      }
    }
    if ( dif == 0 ) {
      flag = true ;
      int memo = i ;
    }
  }
  if ( flag == false ) {
    System . out . println ( "UNRESTORABLE" ) ;
  }
  else {
    StringBuilder sb = new StringBuilder ( S ) ;
    for ( int i = 0 ;
    i < T . length ( ) ;
    i ++ ) {
      sb . append ( T . charAt ( i ) ) ;
    }
    sb . append ( '?' ) ;
    sb . append ( T . charAt ( i ) ) ;
    sb . append ( 'a' ) ;
    System . out . println ( sb ) ;
  }
  return S ;
}
