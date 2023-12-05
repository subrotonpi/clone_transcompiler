public static boolean isGoodbye ( ) {
  boolean f1 ;
  boolean f2 ;
  int C_cnt = 0 ;
  for ( int i = 2 ;
  i < S . length ( ) - 1 ;
  i ++ ) {
    if ( S . charAt ( i ) == 'A' ) {
      f1 = true ;
    }
    else {
      f1 = false ;
    }
  }
  if ( C_cnt == 1 ) {
    f2 = true ;
  }
  else {
    f2 = false ;
  }
  boolean f3 = true ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'A' || S . charAt ( i ) == 'C' ) {
      continue ;
    }
    if ( S . charAt ( i ) != 'A' ) {
      f3 = false ;
      break ;
    }
  }
  if ( f1 && f2 && f3 ) {
    System . out . println ( "AC" ) ;
  }
  else {
    System . out . println ( "WA" ) ;
  }
  return f1 ;
}
