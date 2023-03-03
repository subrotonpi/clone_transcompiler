public static int numInputs = Integer . parseInt ( input ) {
  for ( int i = 0 ;
  i < numInputs ;
  i ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int C = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    HashMap < Integer , HashMap < Integer , Integer >> custSeats = new HashMap < Integer , HashMap < Integer , Integer >> ( ) ;
    Set < Integer > seatsBought = new HashSet < Integer > ( ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int seatNum = Integer . parseInt ( input . nextLine ( ) ) , custNum = Integer . parseInt ( input . nextLine ( ) ) ;
      seatsBought . add ( seatNum ) ;
      if ( custSeats . get ( custNum - 1 ) . keySet ( ) . contains ( seatNum ) ) custSeats . get ( custNum - 1 ) . put ( seatNum , 1 ) ;
      else custSeats . get ( custNum - 1 ) . put ( seatNum , 1 ) ;
    }
    int [ ] numTicketsBought = {
      0 , 0 }
      ;
      for ( int custNum = 0 ;
      custNum < 2 ;
      custNum ++ ) {
        for ( int seatNum = 0 ;
        seatNum < custSeats . get ( custNum ) . keySet ( ) . size ( ) ;
        seatNum ++ ) {
          numTicketsBought [ custNum ] += custSeats . get ( custNum ) . get ( seatNum ) ;
        }
      }
      int larger = Collections . max ( numTicketsBought ) ;
      int smaller = Collections . min ( numTicketsBought ) ;
      int numRides = larger ;
      int numPromotions = 0 ;
      for ( int seatNum : seatsBought ) {
        if ( ! custSeats . get ( 0 ) . keySet ( ) . contains ( seatNum ) || ! custSeats . get ( 1 ) . keySet ( ) . contains ( seatNum ) ) continue ;
        if ( custSeats . get ( 0 ) . get ( seatNum ) + custSeats . get ( 1 ) . get ( seatNum ) <= larger ) continue ;
        if ( seatNum == 1 ) numRides = custSeats . get ( 0 ) . get ( seatNum ) +