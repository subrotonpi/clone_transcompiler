public static int n = Integer . parseInt ( input ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > [ ] li = new List [ n ] ;
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) {
    li [ i ] = new LinkedList < Integer > ( ) ;
  }
  Arrays . sort ( li ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) {
    cnt += li [ i ] . intValue ( ) ;
    if ( cnt >= k ) {
      System . out . println ( li [ i ] . intValue ( ) ) ;
      break ;
    }
  }
  return cnt ;
}
