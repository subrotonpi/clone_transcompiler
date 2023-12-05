private static String solve ( int n , int c , int m , List < TicketItem > tickets ) {
  int [ ] ticketsPerCustomer = new int [ c ] ;
  int [ ] ticketsPerSeat = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ticketsPerCustomer [ i ] = tickets . stream ( ) . mapToInt ( Item :: getValue ) . sum ( ) ;
    ticketsPerSeat [ i ] = tickets . stream ( ) . mapToInt ( Item :: getValue ) . sum ( ) ;
  }
  int minRides = Math . max ( ticketsPerCustomer , 0 ) ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s += ticketsPerSeat [ i ] ;
    if ( s > minRides * ( i + 1 ) ) {
      minRides = ( s - 1 ) / ( i + 1 ) + 1 ;
    }
  }
  int promotions = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    promotions += Math . max ( 0 , ticketsPerSeat [ i ] - minRides ) ;
  }
  return String . valueOf ( minRides ) + " " + promotions ;
}
for ( int t = 0 ;
t < Integer . parseInt ( input ( ) ) ;
t ++ ) {
  n = Integer . parseInt ( input ( ) . replaceAll ( " " , "" ) ) ;
  c = Integer . parseInt ( input ( ) . replaceAll ( " " , "" ) ) ;
  m = Integer . parseInt ( input ( ) . replaceAll ( " " , "" ) ) ;
  tickets = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    tickets [ i ] = Integer . parseInt ( input ( ) . replaceAll ( " " , "" ) ) ;
  }
  int result = solve ( n , c , m , tickets ) ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + result ) ;
}
