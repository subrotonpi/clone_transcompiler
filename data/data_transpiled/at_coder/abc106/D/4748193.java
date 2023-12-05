static final int [ ] [ ] s ( int n , int m , int q ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] s = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    s [ n - l ] [ r - 1 ] ++ ;
  }
  Arrays . sort ( s ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( ( int ) s [ n - d ] [ t - 1 ] ) ;
  }
  return s ;
}
