public static final int [ ] getDoubleArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  String y = input . nextLine ( ) ;
  int [ ] arr = new int [ y . length ( ) ] ;
  for ( int i = 0 ;
  i < y . length ( ) - 1 ;
  i ++ ) {
    if ( y . substring ( i , i + 2 ) . equals ( "AC" ) ) {
      arr [ i + 1 ] = arr [ i ] + 1 ;
    }
    else {
      arr [ i + 1 ] = arr [ i ] ;
    }
  }
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( ( int ) ( arr [ r - 1 ] - arr [ l - 1 ] ) ) ;
  }
  return arr ;
}
