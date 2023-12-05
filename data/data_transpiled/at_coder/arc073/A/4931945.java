static final Scanner getScanner ( ) {
  final String fastInput = System . getProperty ( "fastInput" ) ;
  final int N = Integer . parseInt ( fastInput . nextLine ( ) ) ;
  final int T = Integer . parseInt ( fastInput . nextLine ( ) ) ;
  final int [ ] p = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( fastInput . nextLine ( ) ) ;
  }
  int oyumin = 0 ;
  int oyumax = 0 ;
  int Showertime = 0 ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    if ( p [ i ] > oyumax ) {
      Showertime += oyumax - oyumin ;
      oyumin = p [ i ] ;
      oyumax = p [ i ] + T ;
    }
    else {
      oyumax = p [ i ] + T ;
    }
  }
  Showertime += oyumax - oyumin ;
  System . out . println ( Showertime ) ;
  return new Scanner ( ) ;
}
