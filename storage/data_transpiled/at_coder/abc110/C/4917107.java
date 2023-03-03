public static void input ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  String a = "abcdefghijklmnopqrstuvwxyz" ;
  int flag = 0 ;
  int i = 0 ;
  while ( i < s . length ( ) ) {
    if ( s . charAt ( i ) != t . charAt ( i ) ) {
      if ( a . contains ( t . charAt ( i ) ) ) {
        char c = s . charAt ( i ) ;
        s = s . replace ( c , "1" ) ;
        s = s . replace ( t . charAt ( i ) , c ) ;
        s = s . replace ( "1" , t . charAt ( i ) ) ;
        a = a . replace ( t . charAt ( i ) , "1" ) ;
      }
      else {
        break ;
      }
    }
    i ++ ;
  }
  if ( s . equals ( t ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
