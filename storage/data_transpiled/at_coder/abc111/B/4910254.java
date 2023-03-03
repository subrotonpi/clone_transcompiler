public static void input ( Scanner in ) {
  String n = in . next ( ) ;
  String m = n . substring ( 0 , n . length ( ) - 1 ) ;
  for ( int i = 0 ;
  i < n . length ( ) - 1 ;
  i ++ ) {
    m += n . charAt ( i ) ;
  }
  if ( Integer . parseInt ( n ) > Integer . parseInt ( m ) ) {
    if ( n . charAt ( 0 ) != String . valueOf ( 9 ) ) {
      String a = String . valueOf ( Integer . parseInt ( n . substring ( 0 , n . length ( ) - 1 ) + 1 ) ) ;
      for ( int j = 0 ;
      j < n . length ( ) - 1 ;
      j ++ ) {
        a += String . valueOf ( Integer . parseInt ( n . substring ( 0 , j + 1 ) ) ) ;
      }
      System . out . println ( a ) ;
    }
    else {
      String b = String . valueOf ( 1 ) ;
      for ( int k = 0 ;
      k < n . length ( ) ;
      k ++ ) {
        b += String . valueOf ( 1 ) ;
      }
      System . out . println ( b ) ;
    }
  }
  else {
    System . out . println ( m ) ;
  }
}
