public static final String getSmallB ( ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( "smallB.in" ) ) ;
  PrintWriter fout = new PrintWriter ( "smallB.out" ) ;
  for ( int tc : xrange ( Integer . parseInt ( fin . readLine ( ) ) ) ) {
    int K = Integer . parseInt ( fin . readLine ( ) ) ;
    int L = Integer . parseInt ( fin . readLine ( ) ) ;
    int S = Integer . parseInt ( fin . readLine ( ) ) ;
    List < String > KEYS = Arrays . asList ( fin . readLine ( ) . split ( " " ) ) ;
    String TW = fin . readLine ( ) . trim ( ) ;
    List < String > pos = new ArrayList < String > ( ) ;
    pos . add ( "" ) ;
    for ( int i : xrange ( S ) ) {
      List < String > posNext = new ArrayList < String > ( ) ;
      for ( String p : pos ) {
        for ( String key : KEYS ) {
          posNext . add ( p + key ) ;
        }
      }
      pos = posNext ;
    }
    List < String > toPay = pos . stream ( ) . map ( word -> word . split ( "(?=" + TW + ")" ) ) . collect ( Collectors . toList ( ) ) ;
    double toBrand = Collections . max ( toPay ) ;
    double medPay = Double . parseDouble ( toPay ) * 1. / toPay . length ( ) ;
    double ans = toBrand - medPay ;
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + ans ) ;
    fout . println ( "Case #" + ( tc + 1 ) + ": " + ans ) ;
  }
  return "" ;
}
