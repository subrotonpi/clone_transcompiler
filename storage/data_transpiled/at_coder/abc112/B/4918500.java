static void solve ( @ Nonnegative int N , @ Nonnegative int T , @ Nonnegative int [ ] c , @ Nonnegative int [ ] t ) {
  final int ret = Double . MIN_VALUE ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( t [ i ] <= T ) {
      ret = Math . min ( ret , c [ i ] ) ;
    }
  }
  if ( ret == Double . MIN_VALUE ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( ret ) ;
  }
  /* main program */
  final Scanner scanner = new Scanner ( System . in ) ;
  final String line ;
  final List < String > tokens = scanner . nextLine ( ) . split ( " " ) ;
  final int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
  final int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  final int [ ] c = new int [ N ] ;
  final int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
    t [ i ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
  }
  solve ( N , T , c , t ) ;
}
