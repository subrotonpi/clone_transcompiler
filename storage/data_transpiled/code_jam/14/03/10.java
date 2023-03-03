@ Util public static void main ( String [ ] args ) {
  Reader r = reader ( "input" ) ;
  int num = Integer . parseInt ( r . readLine ( ) ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < xrange ( num ) ;
  i ++ ) {
    int R = r . nextInt ( ) ;
    int C = r . nextInt ( ) ;
    int M = r . nextInt ( ) ;
    int empty = R * C - M ;
    int width = C ;
    int height = R ;
    if ( empty == 0 ) {
      ans . append ( "\nImpossible" ) ;
      continue ;
    }
    if ( empty == 1 ) {
      String s = "\n" ;
      for ( int j = 0 ;
      j < xrange ( R ) ;
      j ++ ) {
        if ( j == 0 ) s += "c" + "*" + "\n" ;
        else s += ".." + "*" + "\n" ;
      }
      ans . append ( s . substring ( 0 , s . length ( ) - 1 ) ) ;
      continue ;
    }
    if ( R == 1 ) {
      ans . append ( "\n" + "c" + "." + "*" + "\n" ) ;
      continue ;
    }
    boolean flag1 = false ;
    boolean flag2 = false ;
    do {
      int rows = empty / width ;
      int extra = empty % width ;
      if ( rows + ( extra > 0 ? 1 : 0 ) > R ) {
        flag1 = true ;
        break ;
      }
      if ( extra != 1 && rows > 1 ) {
        String s = "" ;
        for ( int j = 0 ;
        j < xrange ( R ) ;
        j ++ ) {
          if ( j < rows ) s += "." + "*" + "\n" ;
          else s += "." + "*" + "\n" ;
        }
        ans . append ( "\nc" + s . substring ( 1 , s . length ( ) - 1 ) ) ;
        break ;
      }
      width -- ;
      if ( width < 2 ) {
        flag1 = true ;
        break ;
      }
    }
    while ( flag1 ) ;
  }
  int cols = empty / height ;
  int extra = empty % height ;
  if ( cols + ( extra > 0 ? 1 : 0 ) > C ) {
    flag2 = true ;
    break ;
  }
  if ( extra != 1 && cols > 1 ) {
    String s = "" ;
    for ( int j = 0 ;
    j < xrange ( R ) ;
    j ++ ) {
      if