static public String prework ( String argv [ ] ) {
  final String msg ;
  prework ( argv ) ;
  {
    return "nothing" ;
  }
  {
    int n = Integer . parseInt ( input ( ) ) ;
    Set < String > s = new HashSet < > ( ) ;
    for ( int i = 1 ;
    i <= 210 ;
    i ++ ) {
      s . addAll ( Integer . parseInt ( input ( ) ) ) ;
      for ( String s : String . valueOf ( i * n ) . split ( " " ) ) {
        if ( Arrays . binarySearch ( s , s ) >= 0 ) {
          return i * n ;
        }
      }
    }
    return "INSOMNIA" ;
  }
  {
    PrinterJob pj = PrinterJob . getPrinterJob ( ) ;
    pj . print ( ( String ) v ) ;
  }
  {
    int TT = Integer . parseInt ( input ( ) ) ;
    for ( int tt = 1 ;
    tt <= TT ;
    tt ++ ) {
      pj . print ( "coping Case " + tt + ".." ) ;
      String ans = pj . once ( ) ;
      pj . print ( "Case #" + tt + ": " + ( ans ) ) ;
    }
  }
  if ( Class . forName ( "org.apache.commons.logging.Log" ) . equals ( "org.apache.commons.logging.Log" ) ) {
    msg = prework ( argv ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg ) ;
    pj . print ( "prework down with" + msg