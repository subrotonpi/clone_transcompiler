public static void print ( String Sp ) {
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < Sp . length ( ) ;
  i ++ ) {
    sb . append ( input . charAt ( i ) ) ;
  }
  String T = new StringBuilder ( ) ;
  int len_Sp = sb . toString ( ) . length ( ) ;
  int len_T = T . length ( ) ;
  boolean restorable = false ;
  int max_i = 0 ;
  if ( len_Sp >= len_T ) {
    for ( int i = 0 ;
    i < len_Sp - len_T + 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < len_T ;
      j ++ ) {
        if ( sb . charAt ( i + j ) != '?' && sb . charAt ( i + j ) != T . charAt ( j ) ) {
          break ;
        }
      }
      else {
        restorable = true ;
        max_i = i ;
      }
    }
  }
  if ( restorable ) {
    sb . delete ( max_i , max_i + len_T ) ;
    System . out . println ( sb . toString ( ) . replace ( '?' , 'a' ) ) ;
  }
  else {
    System . out . println ( "UNRESTORABLE" ) ;
  }
}
