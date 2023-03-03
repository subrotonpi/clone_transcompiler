public static int [ ] getCounty ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ab . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int [ ] city = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    city [ i ] = 0 ;
  }
  for ( int a = 0 ;
  a < ab . size ( ) ;
  a ++ ) {
    city [ ab . get ( a ) - 1 ] ++ ;
    city [ ab . get ( b ) - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i < city . length ;
  i ++ ) {
    System . out . println ( city [ i ] ) ;
  }
  return city ;
}
