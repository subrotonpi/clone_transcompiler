public static int N = Integer . parseInt ( input ) {
  String [ ] S = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = list . next ( ) . charAt ( 0 ) ;
  }
  int [ ] count = new int [ 5 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    switch ( S [ i ] ) {
      case "M" : count [ 0 ] ++ ;
      break ;
      case "A" : count [ 1 ] ++ ;
      break ;
      case "R" : count [ 2 ] ++ ;
      break ;
      case "C" : count [ 3 ] ++ ;
      break ;
      case "H" : count [ 4 ] ++ ;
      break ;
    }
  }
  int sum = 0 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    sum += count [ i ] * count [ i + 1 ] * count [ i + 2 ] ;
    sum += count [ i ] * count [ i + 2 ] * count [ i + 3 ] ;
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    sum += count [ 0 ] * count [ i + 1 ] * count [ 4 ] ;
  }
  System . out . println ( sum ) ;
  return sum ;
}
