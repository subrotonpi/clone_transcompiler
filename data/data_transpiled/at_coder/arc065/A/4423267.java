public static String S ( ) {
  int a = S . length ( ) ;
  while ( a != 0 ) {
    if ( a - 5 < 0 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
    else if ( S . charAt ( a - 1 ) == 'm' && S . charAt ( a - 5 ) == 'dream' ) {
      a -= 5 ;
    }
    else if ( S . charAt ( a - 1 ) == 'e' && S . charAt ( a - 5 ) == 'erase' ) {
      a -= 5 ;
    }
    else if ( S . charAt ( a - 3 ) == 'mer' && a - 7 >= 0 && S . charAt ( a - 7 ) == 'dreamer' ) {
      a -= 7 ;
    }
    else if ( S . charAt ( a - 3 ) == 'ser' && a - 6 >= 0 && S . charAt ( a - 6 ) == 'eraser' ) {
      a -= 6 ;
    }
    else {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
  return S ;
}
