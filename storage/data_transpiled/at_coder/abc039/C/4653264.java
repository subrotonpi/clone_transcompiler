public static String [ ] getStrings ( ) {
  String s = input . next ( ) ;
  int a = 0 ;
  int b = 0 ;
  int n = s . length ( ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( i - 1 ) ) {
      a = i ;
      break ;
    }
  }
  for ( int i = a + 1 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( i - 1 ) ) {
      b = i ;
      break ;
    }
  }
  String [ ] anA = {
    "" , "Mi" , "" , "Re" , "" , "Do" }
    ;
    String [ ] anB = {
      "" , "Si" , "" , "La" , "" , "So" , "" , "Fa" }
      ;
      if ( b - a == 7 ) {
        System . out . println ( anA [ a ] ) ;
      }
      else {
        System . out . println ( anB [ a ] ) ;
      }
      return anA ;
    }
    