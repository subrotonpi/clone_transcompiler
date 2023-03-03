static final String print ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int n = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int q = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] [ ] lr = new int [ q ] [ n ] ;
  for ( int i = 0 ;
  i < lr . length ;
  i ++ ) {
    lr [ i ] [ 0 ] = input . nextInt ( ) - 1 ;
  }
  int [ ] cnt = new int [ n ] ;
  for ( int l = 0 , r = 0 ;
  l < lr [ 0 ] . length ;
  l ++ ) {
    cnt [ l ] ++ ;
    if ( r < n - 1 ) cnt [ r + 1 ] -- ;
  }
  String res = "" ;
  int c = 0 ;
  for ( int x : cnt ) {
    c += x ;
    res += String . valueOf ( c % 2 ) ;
  }
  System . out . println ( res ) ;
  return res ;
}
