public static void print ( String S ) {
  int ans = 0 ;
  Scanner input = new Scanner ( System . in ) ;
  int l = S . length ( ) ;
  for ( int i = 1 ;
  i < l / 2 ;
  i ++ ) {
    if ( Arrays . equals ( S . charAt ( j ) , S . charAt ( j + i ) ) ) {
      ans = 2 * i ;
    }
  }
  System . out . println ( ans ) ;
}
