public static void input ( ) {
  String s = input . readLine ( ) . trim ( ) ;
  boolean isFirst = true ;
  for ( int i = 2 ;
  i < s . length ( ) ;
  i ++ ) {
    String s1 = s . substring ( i , i + 1 ) ;
    String s2 = s . substring ( i + 1 , i + 1 ) ;
    if ( s1 . compareTo ( s2 ) != 0 ) {
      isFirst = false ;
    }
  }
  if ( isFirst ) {
    System . out . println ( "Second" ) ;
  }
  else {
    if ( s . length ( ) % 2 == 0 ) {
      if ( s . charAt ( 0 ) == s . charAt ( s . length ( ) - 1 ) ) {
        System . out . println ( "First" ) ;
      }
      else {
        System . out . println ( "Second" ) ;
      }
    }
    else {
      if ( s . charAt ( 0 ) == s . charAt ( s . length ( ) - 1 ) ) {
        System . out . println ( "Second" ) ;
      }
      else {
        System . out . println ( "First" ) ;
      }
    }
  }
}
