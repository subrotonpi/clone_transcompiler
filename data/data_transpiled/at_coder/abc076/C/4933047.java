public static void input ( ) {
  String inputA = input ( ) ;
  String inputT = input ( ) ;
  StringBuilder sb = new StringBuilder ( inputA . length ( ) ) ;
  boolean clearFlg ;
  for ( int i = sb . length ( ) - inputT . length ( ) ;
  i >= 0 ;
  i -- ) {
    clearFlg = true ;
    for ( int j = 0 ;
    j < inputT . length ( ) ;
    j ++ ) {
      if ( ! ( inputA . charAt ( i + j ) == '?' || inputA . charAt ( i + j ) == inputT . charAt ( j ) ) ) {
        clearFlg = false ;
        break ;
      }
    }
    if ( clearFlg == true ) {
      sb . delete ( i , i + inputT . length ( ) ) ;
      sb . append ( inputT ) ;
      inputA = sb . toString ( ) . replace ( '?' , 'a' ) ;
      break ;
    }
  }
  else {
    clearFlg = false ;
  }
  if ( clearFlg == true ) {
    System . out . println ( sb . toString ( ) ) ;
  }
  else {
    System . out . println ( "UNRESTORABLE" ) ;
  }
}
