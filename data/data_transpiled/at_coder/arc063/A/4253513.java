public static void input ( ) {
  String ls = input . readLine ( ) . trim ( ) ;
  int a = ls . charAt ( 0 ) ;
  int b = 0 ;
  for ( int i = 1 ;
  i < ls . length ( ) ;
  i ++ ) {
    if ( ls . charAt ( i ) != a ) {
      b ++ ;
      a = ls . charAt ( i ) ;
    }
  }
  System . out . println ( b ) ;
}
