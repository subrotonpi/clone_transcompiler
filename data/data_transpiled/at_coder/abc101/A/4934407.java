public static void input ( ) {
  String s = input ;
  List < Character > s_list = new LinkedList < Character > ( s ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < s_list . size ( ) ;
  i ++ ) {
    switch ( s_list . get ( i ) ) {
      case '+' : count ++ ;
      break ;
      case '-' : count -- ;
      break ;
    }
  }
  System . out . println ( count ) ;
}
