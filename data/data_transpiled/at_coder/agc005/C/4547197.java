public static void print ( String input ) {
  final Scanner input = new Scanner ( System . in ) ;
  @ SuppressWarnings ( "resource" ) final int [ ] A = input . nextLine ( ) . split ( " " ) ;
  final int maxA = max ( A ) ;
  final int minA = min ( A ) ;
  if ( minA != Math . ceil ( maxA / 2 ) ) {
    System . out . println ( "Impossible" ) ;
  }
  else {
    if ( maxA % 2 != 0 ) {
      for ( int i = minA ;
      i <= maxA ;
      i ++ ) {
        if ( i == minA ) {
          if ( A . length != 2 ) {
            System . out . println ( "Impossible" ) ;
            break ;
          }
        }
        else {
          if ( A . length < 2 ) {
            System . out . println ( "Impossible" ) ;
            break ;
          }
        }
      }
      else {
        System . out . println ( "Possible" ) ;
      }
    }
    else {
      for ( int i = minA ;
      i <= maxA ;
      i ++ ) {
        if ( i == minA ) {
          if ( A . length != 1 ) {
            System . out . println ( "Impossible" ) ;
            break ;
          }
        }
        else {
          if ( A . length < 2 ) {
            System . out . println ( "Impossible" ) ;
            break ;
          }
        }
      }
      else {
        System . out . println ( "Possible" ) ;
      }
    }
  }
}
