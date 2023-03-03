static private double problem ( double success , double units , double [ ] cores ) {
  Arrays . sort ( cores ) ;
  cores [ 0 ] = 1.0 ;
  double spent = 0.0 ;
  double minProb = 0.0 ;
  for ( int i = 0 ;
  i < cores . length ;
  i ++ ) {
    if ( cores [ i ] == 1.0 ) {
      minProb = 1.0 ;
      break ;
    }
    double plan = ( cores [ i + 1 ] - cores [ i ] ) * ( i + 1 ) ;
    if ( plan > units - spent ) {
      minProb = cores [ i ] + ( units - spent ) / ( i + 1 ) ;
      break ;
    }
    spent += plan ;
  }
  double prob = 1.0 ;
  for ( double n : cores ) {
    prob *= Math . max ( minProb , n ) ;
  }
  return prob ;
}
static String nextLine ( BufferedReader inputFile ) {
  String str = "" ;
  while ( str . length ( ) == 0 ) {
    str = inputFile . readLine ( ) ;
  }
  return str . substring ( 0 , str . length ( ) - 1 ) ;
}
static int [ ] intSplit ( String s ) {
  return Arrays . stream ( s . split ( "\\s+" ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
}
static float [ ] floatSplit ( String s ) {
  return Arrays . stream ( s . split ( "\\s+" ) ) . mapToFloat ( Float :: parseFloat ) . toArray ( ) ;
}
