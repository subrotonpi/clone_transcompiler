public static int n = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  int [ ] lv = new int [ n ] ;
  int lvi = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '(' ) {
      lvi ++ ;
    }
    else {
      lvi -- ;
    }
    lv [ i ] = lvi ;
  }
  return lvi ;
}
