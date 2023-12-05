@ VisibleForTesting static void fractions ( Fraction fraction ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final String S = input . nextLine ( ) ;
  int r = 0 ;
  int g = 0 ;
  int b = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case 'R' : r ^= 1 ;
      break ;
      case 'G' : g ^= 1 ;
      break ;
      default : b ^= 1 ;
      break ;
    }
  }
  System . out . println ( r + g + b ) ;
}
