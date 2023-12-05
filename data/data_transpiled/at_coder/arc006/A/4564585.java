public static void input ( ) {
  String n = input . nextLine ( ) ;
  String b = input . nextLine ( ) ;
  String c = input . nextLine ( ) ;
  int p = 0 ;
  for ( int i = 0 ;
  i < 12 ;
  i += 2 ) {
    if ( n . contains ( c . charAt ( i ) ) ) p ++ ;
  }
}
