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
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    mi [ i ] = Math . min ( mi [ i - 1 ] , an [ i ] ) ;
  }
  int ma = 0 ;
  int numMA = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int be = an [ i ] - mi [ i - 1 ] ;
    if ( be > ma ) {
      ma = be ;
      numMA = 1 ;
    }
    else if ( be == ma ) {
      numMA ++ ;
    }
  }
  System . out . println ( numMA ) ;
}
