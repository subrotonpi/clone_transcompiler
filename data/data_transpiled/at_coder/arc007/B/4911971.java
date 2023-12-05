public static int N = Integer . parseInt ( input ) {
  int [ ] ds = new int [ M ] ;
  for ( int i = 0 ;
  i < ds . length ;
  i ++ ) {
    ds [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List ans = new LinkedList ( ) ;
  int now = 0 ;
  for ( int i = 0 ;
  i < ds . length ;
  i ++ ) {
    if ( ds [ i ] != i ) {
      i ++ ;
    }
  }
  return now ;
}
