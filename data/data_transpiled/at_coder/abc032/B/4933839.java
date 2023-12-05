public static void input ( ) {
  String s = input . nextLine ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > s_list = new LinkedList < > ( s ) ;
  List < String > aaa = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) - n + 1 ;
  i ++ ) {
    String temp = new String ( s_list . subList ( i , i + n ) ) ;
    aaa . add ( temp ) ;
  }
  System . out . println ( new HashSet < > ( aaa ) . size ( ) ) ;
}
