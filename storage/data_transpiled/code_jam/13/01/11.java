public static String getstr ( ) {
  String res = "" ;
  while ( ( res = readLine ( ) ) . length ( ) == 0 ) {
    res = readLine ( ) . trim ( ) ;
  }
  /* Check seq */
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    int j = i ;
    if ( board [ i ] [ j ] != player && board [ i ] [ j ] != 'T' ) {
      return false ;
    }
  }
  /* Check player */
  List < List < Integer >> S = new ArrayList < > ( ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  S . add ( new ArrayList < > ( ) ) ;
  for ( List <