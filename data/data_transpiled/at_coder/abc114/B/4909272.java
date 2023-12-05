public static int getInt ( ) {
  s = input . nextLine ( ) ;
  int ans = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    int gap = Math . abs ( Integer . parseInt ( s . substring ( i , i + 3 ) ) - 753 ) ;
    if ( ans >= gap ) {
      ans = gap ;
    }
  }
  return ans ;
}
