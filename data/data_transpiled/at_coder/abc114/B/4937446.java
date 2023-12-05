public static int input ( ) {
  int sub = 1000000 ;
  for ( int i = 0 ;
  i < s . length ( ) - 2 ;
  i ++ ) {
    i = Math . abs ( ( int ) s . charAt ( i ) - 753 ) ;
    if ( i < sub ) {
      sub = i ;
    }
  }
  return ( sub ) ;
}
