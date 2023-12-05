private static void B ( String inpfile ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( inpfile ) ) ;
  BufferedWriter fout = new BufferedWriter ( new FileWriter ( inpfile + ".out" ) ) ;
  int CNT = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int iCNT = 0 ;
  iCNT < CNT ;
  iCNT ++ ) {
    int [ ] numbers = ArrayUtil . parseInt ( fin . readLine ( ) . replaceAll ( "\n" , "" ) . split ( "\\s+" ) ) ;
    int N = numbers [ 0 ] ;
    int K = numbers [ 1 ] ;
    int B = numbers [ 2 ] ;
    int T = numbers [ 3 ] ;
    int [ ] X = ArrayUtil . parseInt ( fin . readLine ( ) . replaceAll ( "\n" , "" ) . split ( "\\s+" ) ) ;
    int [ ] V = ArrayUtil . parseInt ( fin . readLine ( ) . replaceAll ( "\n" , "" ) . split ( "\\s+" ) ) ;
    Arrays . sort ( X ) ;
    Arrays . sort ( V ) ;
    int OnTime = 0 ;
    int Switches = 0 ;
    int Obstacles = 0 ;
    for ( int iN : xrange ( N ) ) {
      if ( B - X [ iN ] <= V [ iN ] * T ) {
        OnTime ++ ;
        Switches += Obstacles ;
      }
      else Obstacles ++ ;
      if ( OnTime == K ) break ;
    }
    String result ;
    if ( ( OnTime < K ) && ( ( OnTime < K ) || ( OnTime > K ) ) ) result = "IMPOSSIBLE" ;
    else result = Integer . toString ( Switches ) ;
    String text = "Case #" + ( iCNT + 1 ) + ": " + result ;
    System . out . println ( text ) ;
    fout . write ( text + "\n" ) ;
  }
  if ( className . equals ( "org.apache.commons.io.IOUtils" ) ) B ( "..\\test\\B-large.in" ) ;
}
