static private int FactorialMod ( int n ) {
  int res = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    res = ( res * i ) % 1000000007 ;
  }
  int res = 1 ;
  while ( findCollisionLetter ( cars ) != null ) {
    char letter = findCollisionLetter ( cars ) ;
    char newcars [ ] = CombineOnLetter ( cars , letter ) ;
    res = ( res * mult ) % 1000000007 ;
    if ( res == 0 ) {
      break ;
    }
    if ( ! verifyCars ( cars ) ) {
      System . out . printf ( "Case #%s: %s" , letter + 1 , res ) ;
      return false ;
    }
    if ( cars [ 0 ] != streak ) {
      streak = cars [ 0 ] ;
      visible . add ( cars [ 1 ] ) ;
    }
  }
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    int [ ] sets = new int [ n ] ;
    for ( char car : cars ) {
      sets [ i ] = new int [ n ] ;
    }
    for ( int k = 0 ;
    k < sets . length ;
    k ++ ) {
      for ( int l = 0 ;
      l < k ;
      l ++ ) {
        int [ ] s1 = sets [ k ] ;
        int [ ] s2 = sets [ l ] ;
        int [ ] inter = s1 & s2 ;
        if ( inter . length != 0 ) {
          return Collections . binarySearch ( inter , s1 ) ;
        }
      }
    }
  }
  return 0 ;
}
