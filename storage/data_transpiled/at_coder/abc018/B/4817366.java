public static void print ( String s ) {
  s = list ( input ( ) ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    a = s . substring ( x - 1 , y ) ;
  }
  for ( int i : s ) {
    System . out . print ( i + "," ) ;
  }
  System . out . println ( ) ;
}
