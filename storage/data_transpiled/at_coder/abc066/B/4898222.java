public static void input ( ) {
  String s = input ( ) ;
  int found = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( i % 2 == 0 && i >= 2 ) {
      String t = s . substring ( 0 , i / 2 ) ;
      String t2 = s . substring ( i / 2 , i ) ;
      if ( t . equals ( t2 ) ) {
        found = i ;
      }
    }
  }
  System . out . println ( found ) ;
}
