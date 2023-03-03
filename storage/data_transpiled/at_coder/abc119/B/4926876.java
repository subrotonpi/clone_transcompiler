public static double [ ] getBTC ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] X = new double [ N ] ;
  String [ ] U = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Double . parseDouble ( input . nextLine ( ) ) ;
  }
  return X ;
}
