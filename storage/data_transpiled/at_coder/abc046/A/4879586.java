public static void print ( String input ) {
  String l = input . split ( " " ) ;
  List l_u = list ( set ( l ) ) ;
  System . out . println ( len ( l_u ) ) ;
}
