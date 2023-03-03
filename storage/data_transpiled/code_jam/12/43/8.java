static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  int testcases = Integer . parseInt ( scanner . nextLine ( ) ) ;
  int n = 0 ;
  int [ ] h = null ;
  int [ ] output = null ;
  /* recurse */
  if ( a == b ) {
    return true ;
  }
  int cont = 1 ;
  int j = a ;
  for ( int k = a ;
  k < b ;
  k ++ ) {
    if ( h [ k ] <= k || h [ k ] > b ) {
      return false ;
    }
    if ( h [ k ] == b ) {
      output [ k ] = ( int ) ( output [ b ] - Math . ceil ( incl * ( b - k ) ) - cont ++ ) ;
      if ( ! recurse ( j , k , i + 1 , ( double ) ( output [ b ] - output [ k ] ) / ( b - k ) ) ) {
        return false ;
      }
      j = k + 1 ;
    }
  }
  for ( int tc = 1 ;
  tc <= testcases ;
  tc ++ ) {
    n = Integer . parseInt ( scanner . nextLine ( ) ) ;
    h = map ( scanner . nextLine ( ) , ( a , b ) -> ( int ) a - 1 , ( int ) b ) ;
    output = new int [ n ] ;
    output [ n - 1 ] = 1000000000 ;
    if ( recurse ( 0 , n - 1 , 1 , 0 ) ) {
      int mini = Math . min ( output ) ;
      output = map ( output , a -> a - mini , ( int ) b ) ;
      System . out . println ( "Case #" + tc + ": " + StringUtils . join ( output , " " ) ) ;
    }
    else {
      System . out . println ( "Case #" + tc + ": Impossible" ) ;
    }
  }
  return scanner ;
}
