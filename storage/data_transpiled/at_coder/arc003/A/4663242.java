public static void print ( int n ) {
  int r = input . nextInt ( ) ;
  int score = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    switch ( r . charAt ( i ) ) {
      case 'A' : score += 4 ;
      break ;
      case 'B' : score += 3 ;
      break ;
      case 'C' : score += 2 ;
      break ;
      case 'D' : score += 1 ;
      break ;
    }
  }
  System . out . println ( score / n ) ;
}
