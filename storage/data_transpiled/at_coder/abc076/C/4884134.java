public static void print ( String Sp ) {
  String T = input . next ( ) ;
  int len_Sp = Sp . length ( ) ;
  int len_T = T . length ( ) ;
  boolean restorable = false ;
  int max_i = 0 ;
  if ( len_Sp >= len_T ) {
    for ( int i = len_Sp - len_T ;
    i >= 0 ;
    i -- ) {
      for ( int j = 0 ;
      j < len_T ;
      j ++ ) {
        if ( Sp . charAt ( i + j ) != '?' && Sp . charAt ( i + j ) != T . charAt ( j ) ) {
          break ;
        }
      }
      else {
        max_i = Math . max ( max_i , i ) ;
        restorable = true ;
      }
    }
  }
  if ( restorable ) {
    Sp . substring ( max_i , max_i + len_T ) ;
    System . out . println ( new String ( Sp ) . replace ( '?' , 'a' ) ) ;
  }
  else {
    System . out . println ( "UNRESTORABLE" ) ;
  }
}
