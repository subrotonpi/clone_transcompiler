static final int [ ] [ ] getDoubleArray ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n + 2 ] [ n + 2 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int e = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ s ] [ e ] ++ ;
  }
  int [ ] [ ] b = a . clone ( ) ;
  b = Arrays . copyOf ( b , b . length ) ;
  b = Arrays . copyOf ( b , b . length ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int e = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( ( int ) b [ s ] [ e ] ) ;
  }
  return b ;
}
