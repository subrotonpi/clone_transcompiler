static final Scanner input = new Scanner ( System . in ) {
  @ Override public void scan ( char [ ] chars ) {
    int i , a , b , c , d ;
    String input = new String ( chars ) ;
    int s = Integer . parseInt ( input . nextLine ( ) ) , t = Integer . parseInt ( input . nextLine ( ) ) , q = Integer . parseInt ( input . nextLine ( ) ) ;
    int ssum = 0 , tsum = 0 ;
    for ( i = 0 ;
    i < s ;
    i ++ ) if ( s [ i ] == 'A' ) ssum = ssum + 1 ;
    else ssum = ssum + 2 ;
    for ( i = 0 ;
    i < t . length ;
    i ++ ) if ( t [ i ] == 'A' ) tsum = tsum + 1 ;
    else tsum = tsum + 2 ;
    for ( i = 0 ;
    i < q ;
    i ++ ) {
      a = Integer . parseInt ( input . nextLine ( ) ) ;
      b = Integer . parseInt ( input . nextLine ( ) ) ;
      c = Integer . parseInt ( input . nextLine ( ) ) ;
      d = Integer . parseInt ( input . nextLine ( ) ) ;
      int sa = ( ssum [ b ] - ssum [ a - 1 ] ) - ( tsum [ d ] - tsum [ c - 1 ] ) ;
      if ( Math . abs ( sa ) % 3 == 0 ) System . out . println ( "YES" ) ;
      else System . out . println ( "NO" ) ;
    }
  }
}
