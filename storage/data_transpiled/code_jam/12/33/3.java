@ Operator ( "add" ) @ VisibleForTesting static int MaxScore ( int i , int j , int ini , int inj , Case Case ) throws IOException {
  if ( ( i == Case . max . length ) && ( j == Case . max . length ) ) {
    return Case . max . get ( new Integer ( i ) ) ;
  }
  if ( i == Case . A . length || j == Case . B . length ) {
    return 0 ;
  }
  if ( ini == Case . a [ i ] ) {
    return MaxScore ( i + 1 , j , 0 , inj , Case ) ;
  }
  if ( inj == Case . b [ j ] ) {
    return MaxScore ( i , j + 1 , ini , 0 , Case ) ;
  }
  if ( Case . A [ i ] == Case . B [ j ] ) {
    int avail = Math . min ( Case . a [ i ] - ini , Case . b [ j ] - inj ) ;
    int currMax = avail + MaxScore ( i , j , ini + avail , inj + avail , Case ) ;
    if ( Case . max . get ( new Integer ( i ) ) == Case . a [ i ] ) {
      return currMax ;
    }
    else {
      int avail = Math . max ( MaxScore ( i + 1 , j , 0 , inj , Case ) , MaxScore ( i , j + 1 , ini , 0 , Case ) ) ;
    }
    Case . max . put ( new Integer ( i ) , currMax ) ;
    return currMax ;
  }
  private static void C ( String inpfile ) {
    BufferedReader fin = new BufferedReader ( new FileReader ( inpfile ) ) ;
    PrintStream fout = new PrintStream ( new FileOutputStream ( inpfile + ".out" ) ) ;
    int CNT = Integer . parseInt ( fin . readLine ( ) ) ;
    for ( int iCNT : xrange ( CNT ) ) {
      Case Case = new Case ( ) ;
      int [ ] Case0 = ArrayUtil . toIntArray ( fin . readLine ( ) . split ( " " ) ) ;
      int N = Case0 [ 0 ] ;
      int M = Case0 [ 1 ] ;
      int [ ] Case1 = ArrayUtil . toIntArray ( fin . readLine ( ) . split ( " " ) ) ;
      Case . a = Case1 [ 0 ] ;
      Case . A = Case1 [ 1 ] ;
      int [ ] Case2 = ArrayUtil . toIntArray ( fin . readLine ( ) . split ( " " ) )