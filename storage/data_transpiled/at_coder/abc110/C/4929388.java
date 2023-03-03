public static void input ( Scanner in ) {
  String s = in . nextLine ( ) ;
  String t = in . nextLine ( ) ;
  HashMap < String , String > dic1 = new HashMap < String , String > ( ) ;
  HashMap < String , String > dic2 = new HashMap < String , String > ( ) ;
  boolean f = true ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    String j = in . nextLine ( ) ;
    if ( dic1 . containsKey ( j ) ) {
      if ( dic1 . get ( j ) != i ) {
        f = false ;
        break ;
      }
    }
    dic1 . put ( j , s ) ;
    if ( dic2 . containsKey ( j ) ) {
      if ( dic2 . get ( j ) != i ) {
        f = false ;
        break ;
      }
    }
    dic2 . put ( j , t ) ;
  }
  if ( f ) {
    in . close ( ) ;
    System . out . println ( "Yes" ) ;
  }
  else {
    in . close ( ) ;
  }
}
