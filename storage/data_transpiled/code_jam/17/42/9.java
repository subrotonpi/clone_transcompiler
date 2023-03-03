public static int t = Integer . parseInt ( input ) {
  for ( int tc = 0 ;
  tc < t ;
  tc ++ ) {
    System . out . print ( "Case #" + ( tc + 1 ) + ":" ) ;
    int n = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    int m = Integer . parseInt ( input . readLine ( ) ) ;
    int [ ] cust = new int [ c ] ;
    int [ ] seats = new int [ n ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int pos = Integer . parseInt ( input . readLine ( ) ) ;
      int buy = Integer . parseInt ( input . readLine ( ) ) ;
      seats [ pos - 1 ] ++ ;
      cust [ buy - 1 ] ++ ;
    }
    int [ ] cseats = Arrays . copyOf ( seats , seats . length ) ;
    for ( int j = 1 ;
    j < cseats . length ;
    j ++ ) {
      cseats [ j ] += cseats [ j - 1 ] ;
    }
    int z = Math . max ( Math . max ( cust , Math . max ( ( cseats [ 0 ] + j ) / ( j + 1 ) , cseats [ 0 ] ) ) , Math . max ( seats [ 0 ] - z , 0 ) ) ;
    System . out . println ( z + " " + Math . max ( seats [ 0 ] - z , 0 ) ) ;
  }
  return t ;
}
