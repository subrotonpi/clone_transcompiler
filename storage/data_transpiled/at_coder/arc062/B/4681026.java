public static void input ( ) {
  String s = input . nextLine ( ) . trim ( ) ;
  int gc = 0 , pc = 0 ;
  int wc = 0 , lc = 0 ;
  for ( char _s : s . toCharArray ( ) ) {
    if ( _s == 'g' ) {
      if ( pc + 1 <= gc ) {
        pc ++ ;
        wc ++ ;
      }
      else {
        gc ++ ;
      }
    }
    else {
      if ( pc + 1 <= gc ) {
        pc ++ ;
        lc ++ ;
      }
    }
  }
  System . out . println ( wc - lc ) ;
}
