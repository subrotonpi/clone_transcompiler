public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] Sushi = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Sushi [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] Clocksum = new int [ N + 1 ] ;
  int [ ] AntiClocksum = new int [ N + 1 ] ;
  int [ ] maxClocksum = new int [ N + 1 ] , maxAntisum = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Clocksum [ i + 1 ] = Clocksum [ i ] + Sushi [ i ] [ 1 ] - Sushi [ i ] [ 0 ] ;
    AntiClocksum [ i + 1 ] = AntiClocksum [ i ] + Sushi [ N - i - 1 ] [ 1 ] - ( C - Sushi [ N - i - 1 ] [ 0 ] ) ;
    if ( i > 0 ) {
      Clocksum [ i + 1 ] += Sushi [ i - 1 ] [ 0 ] ;
      AntiClocksum [ i + 1 ] += C - Sushi [ N - i ] [ 0 ] ;
    }
    maxClocksum [ i + 1 ] = Math . max ( maxClocksum [ i ] , Clocksum [ i + 1 ] ) ;
    maxAntisum [ i + 1 ] = Math . max ( maxAntisum [ i ] , AntiClocksum [ i + 1 ] ) ;
  }
  int maxCalorie = Math . max ( Math . max ( Clocksum , AntiClocksum ) , maxCalorie ) ;
  int ClockToAnticlock = 0 ;
  int AntiClockToClock = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    ClockToAnticlock = Math . max ( Clocksum [ i + 1 ] + maxAntisum [ N - 1 - i ] - Sushi [ i ] [ 0 ] , ClockToAnticlock ) ;
    AntiClockToClock = Math . max ( AntiClocksum [ i + 1 ] + maxClocksum [ N - 1 - i ] - ( C - Sushi [ N - i - 1 ] [ 0 ] ) , AntiClockToClock ) ;
  }
  return new