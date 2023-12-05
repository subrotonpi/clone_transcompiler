public static void jungle ( ) {
  for ( String s : input . split ( " " ) ) {
  }
  int [ ] mine = new int [ 7 ] ;
  for ( String s : input . split ( " " ) ) {
  }
  int total = 0 ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    total += Math . max ( jungle [ i ] , mine [ i ] ) ;
  }
  System . out . println ( total ) ;
}
