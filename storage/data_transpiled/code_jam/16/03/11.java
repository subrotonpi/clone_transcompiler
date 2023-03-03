public static String strPlusOne ( String in ) throws IOException {
  String out = in ;
  for ( ;
  ;
  ) {
    int ite = Integer . parseInt ( out . substring ( 0 , ite ) ) ;
    if ( out . charAt ( ite ) == '0' ) {
      out = out . substring ( 0 , ite ) + '1' + out . substring ( ite + 1 ) ;
      break ;
    }
    else {
      out = out . substring ( 0 , ite ) + '0' + out . substring ( ite + 1 ) ;
    }
  }
  /* Convert to a string to a string */
  int ev = 0 ;
  for ( ;
  ;
  ) {
    int ite = Integer . parseInt ( in . substring ( 0 , ite ) ) ;
    ev *= base ;
    if ( in . charAt ( ite ) == '1' ) {
      ev ++ ;
    }
  }
  String filename = "C-large" ;
  BufferedReader fin = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
  BufferedWriter fout = new BufferedWriter ( new FileWriter ( filename + ".out" ) ) ;
  int casenum = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int ite = 0 ;
  ite < casenum ;
  ite ++ ) {
    String [ ] inArray = fin . readLine ( ) . split ( " " ) ;
    int N = Integer . parseInt ( inArray [ 0 ] ) ;
    int halfN = N / 2 ;
    String sep_str ;
    if ( halfN * 2 < N ) {
      sep_str = "101" ;
    }
    else {
      sep_str = "11" ;
    }
    int J = Integer . parseInt ( inArray [ 1 ] ) ;
    String returnStr = "\n" ;
    String middle_str = ( halfN - 2 ) * '0' ;
    for ( int jte = 0 ;
    jte < J ;
    jte ++ ) {
      returnStr += "1" + middle_str + sep_str + middle_str + "1" ;
      for ( int kte = 2 ;
      kte < 11 ;
      kte ++ ) {
        returnStr += ' ' + strEvalBase ( "1" + middle_str + "1" , kte ) ;
      }
      returnStr += "\n" ;
      middle_str = strPlusOne ( middle_str ) ;
    }
    fout . write ( "Case #" + ( ite + 1 ) + ": " + returnStr + "\n" ) ;
  }
  return out ;
}
