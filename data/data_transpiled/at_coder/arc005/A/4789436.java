public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] lis = input . split ( " " ) ;
  List < String > words = Arrays . asList ( "TAKAHASHIKUN" , "Takahashikun" , "takahashikun" ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String w = lis [ i ] ;
    if ( i == n - 1 ) w = w . substring ( 0 , w . length ( ) - 1 ) ;
    if ( words . contains ( w ) ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
