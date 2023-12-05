private static void B ( String inpfile ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( inpfile ) ) ;
  BufferedWriter fout = new BufferedWriter ( new FileWriter ( inpfile + ".out" ) ) ;
  int CNT = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int iCNT = xrange ( CNT ) ;
  iCNT < CNT ;
  iCNT ++ ) {
    double [ ] Case = map . get ( "Case" ) ;
    double D = Case [ 0 ] ;
    int N = Integer . parseInt ( Case [ 1 ] ) ;
    double NA = Case [ 2 ] ;
    double [ ] [ ] S = new double [ N ] [ ] ;
    for ( int iS = 0 ;
    iS < N ;
    iS ++ ) {
      S [ iS ] = map . get ( "A" ) ;
    }
    double [ ] [ ] A = map . get ( "A" ) ;
    double tcar = 0 ;
    if ( N > 1 ) {
      tcar = ( S [ 1 ] [ 0 ] - S [ 0 ] [ 0 ] ) * ( D - S [ 0 ] [ 1 ] ) / ( S [ 1 ] [ 1 ] - S [ 0 ] [ 1 ] ) ;
    }
    tcar = Math . max ( tcar , 0 ) ;
    String text = "Case #" + ( iCNT + 1 ) + ": " ;
    System . out . println ( text ) ;
    fout . write ( text + "\n" ) ;
    for ( double a : A ) {
      double tmine = ( 2 * D / a ) * 0.5 ;
      text = Double . toString ( Math . max ( tmine , tcar ) ) ;
      System . out . println ( text ) ;
      fout . write ( text + "\n" ) ;
    }
  }
  if ( className . equals ( "org.apache.commons.io.IOUtils" ) ) B ( "..\\test\\B-small-attempt0.in" ) ;
}
