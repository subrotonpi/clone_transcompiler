public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int dK = 2 * K ;
  int [ ] [ ] MeetDemand = new int [ dK + 1 ] [ K + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x , y , c ;
    x = Integer . parseInt ( input . nextLine ( ) ) % dK ;
    y = ( c == 'W' ? Integer . parseInt ( input . nextLine ( ) ) + K : Integer . parseInt ( input . nextLine ( ) ) ) % dK ;
    if ( K <= x ) {
      if ( 0 <= y && y < K ) {
        x -= K ;
        y += K ;
      }
      else {
        x %= K ;
        y %= K ;
      }
    }
    if ( 0 <= y && y < K ) {
      MeetDemand [ 0 ] [ 0 ] ++ ;
      MeetDemand [ x + 1 ] [ y + 1 ] += 2 ;
      MeetDemand [ 0 ] [ y + 1 ] -- ;
      MeetDemand [ x + 1 ] [ 0 ] -- ;
      MeetDemand [ x + 1 ] [ y + K + 1 ] ++ ;
      MeetDemand [ x + 1 ] [ y + K + 1 ] -= 2 ;
    }
    else {
      MeetDemand [ 0 ] [ y - K + 1 ] ++ ;
      MeetDemand [ x + 1 ] [ y - K + 1 ] -= 2 ;
      MeetDemand [ x + 1 ] [ 0 ] ++ ;
      MeetDemand [ x ] [ y + 1 ] -- ;
      MeetDemand [ x + 1 ] [ y + 1 ] += 2 ;
    }
  }
  for ( int x = 0 ;
  x < K ;
  x ++ ) {
    for ( int y = 1 ;
    y < dK ;
    y ++ ) {
      MeetDemand [ x ] [ y ] += MeetDemand [ x ] [ y - 1 ] ;
    }
  }
  for ( int y = 0 ;
  y < dK ;
  y ++ ) {
    for ( int x = 1 ;
    x < K ;
    x ++ ) {
      MeetDemand [ x ] [ y ] += MeetDemand [ x - 1 ] [ y ] ;
    }
  }
  int Ans = Math . max ( MeetDemand [ 0 ] , 0 ) ;
  for ( int i = 1 ;
  i < K ;
  i ++ ) {
    Ans = Math . max ( Ans , Math . max ( MeetDemand