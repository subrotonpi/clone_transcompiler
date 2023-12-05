static final Scanner getScanner ( ) throws FileNotFoundException {
  Scanner in ;
  if ( args . length == 2 && args [ 0 ] != null ) in = new Scanner ( new File ( args [ 1 ] ) ) ;
  else {
    System . out . println ( "Usage: SpaceEmergency.java <input file>" ) ;
    System . exit ( 0 ) ;
  }
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int curCase = 0 ;
  curCase < T ;
  curCase ++ ) {
    int [ ] distances = map . get ( in . nextLine ( ) ) ;
    int L = distances [ 0 ] , t = distances [ 1 ] , N = distances [ 2 ] , C = distances [ 3 ] ;
    distances = Arrays . copyOf ( distances , 4 ) ;
    long time = 0 ;
    double [ ] savings = new double [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) savings [ i ] = distances [ i ] ;
  }
  in . close ( ) ;
  return in ;
}
