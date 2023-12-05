public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] hn = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) hn [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] endLoc = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 0 || i == n - 1 ) endLoc [ i ] = i ;
    else if ( hn [ i - 1 ] > hn [ i ] && hn [ i ] < hn [ i + 1 ] ) endLoc [ i ] = i ;
  }
  int ma = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ma = Math . max ( ma , endLoc [ i ] - endLoc [ i - 1 ] + 1 ) ;
  System . out . println ( ma ) ;
}
