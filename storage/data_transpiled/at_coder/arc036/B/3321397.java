static void main ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  int n = input . nextInt ( ) ;
  int [ ] hn = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) hn [ i ] = input . nextInt ( ) ;
  int [ ] endLoc = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 0 || i == n - 1 ) endLoc [ i ] = i ;
    else if ( hn [ i - 1 ] > hn [ i ] && hn [ i ] < hn [ i + 1 ] ) endLoc [ i ] = i ;
  }
  int ma = 1 ;
  for ( int i = 0 ;
  i < endLoc . length ;
  i ++ ) {
    if ( i == 0 ) continue ;
    ma = Math . max ( ma , endLoc [ i ] - endLoc [ i - 1 ] + 1 ) ;
  }
  System . out . println ( ma ) ;
}
