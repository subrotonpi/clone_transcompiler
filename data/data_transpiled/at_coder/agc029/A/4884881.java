public static void input ( ) {
  String txt = input ( ) ;
  String txtList = list ( txt ) ;
  int num = 0 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < txt . length ( ) ;
  i ++ ) {
    if ( txtList . charAt ( i ) == 'W' ) {
      count += i - num ;
      num ++ ;
    }
  }
  System . out . println ( count ) ;
}
