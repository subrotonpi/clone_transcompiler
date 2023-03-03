public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] an = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    an [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] mi = new int [ n ] ;
  Set < Integer > seMI = new HashSet < Integer > ( ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( mi [ i - 1 ] > an [ i ] ) {
      seMI = new HashSet < Integer > ( i ) ;
    }
    else if ( mi [ i - 1 ] == an [ i ] ) {
      seMI . add ( i ) ;
    }
    mi [ i ] = Math . min ( mi [ i - 1 ] , an [ i ] ) ;
  }
  int ma = 0 ;
  Set < Integer > seMA = new HashSet < Integer > ( ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int be = an [ i ] - mi [ i - 1 ] ;
    if ( be > ma ) {
      ma = be ;
      seMA = new HashSet < Integer > ( i ) ;
    }
    else if ( be == ma ) {
      seMA . add ( i ) ;
    }
  }
  System . out . println ( seMA . size ( ) ) ;
}
