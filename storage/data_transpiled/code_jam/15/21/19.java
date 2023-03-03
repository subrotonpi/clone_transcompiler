public static int swap ( int k ) {
  return Integer . parseInt ( Integer . toString ( k ) . substring ( 0 , k ) ) ;
  /* cut the number of digits */
  String a = Integer . toString ( k ) ;
  int b = a . length ( ) ;
  String c = a . substring ( b / 2 ) ;
  /* solution the number of digits */
  int compteur = 1 ;
  while ( n > 10 ) {
    if ( cut ( n ) == 0 ) {
      n = n - 1 ;
      compteur = compteur + 1 ;
    }
    int a = cut ( n ) ;
    if ( cut ( n ) > 1 ) {
      n = n - cut ( n ) + 1 ;
      compteur = compteur + a - 1 ;
    }
    a = swap ( n ) ;
    if ( a != n ) {
      n = a ;
      compteur = compteur + 1 ;
    }
    else {
      n = n - 2 ;
      compteur = compteur + 2 ;
    }
  }
  /* main the file */
  File ifn = new File ( "A-large.in" ) ;
  File ofn = new File ( "output.txt" ) ;
  try {
    BufferedReader inf = new BufferedReader ( new FileReader ( ifn ) ) ;
    BufferedWriter ouf = new BufferedWriter ( new FileWriter ( ofn ) ) ;
    int noc = Integer . parseInt ( inf . readLine ( ) . trim ( ) ) ;
    for ( int tnoc = 0 ;
    tnoc < noc ;
    tnoc ++ ) {
      ouf . write ( "Case #" + ( tnoc + 1 ) + ": " ) ;
      int i = Integer . parseInt ( inf . readLine ( ) . trim ( ) ) ;
      int n ;
      if ( i < 19 ) n = i ;
      else n = solution ( i ) ;
      ouf . write ( n + "\n" ) ;
    }
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
  return compteur ;
}
