private static Tree < Double > solve ( String line , String feature , double prob , Tree < Double > t1 , Tree < Double > t2 ) throws IOException {
  String fileprefix = "A-large" ;
  String filepath = "" ;
  String filepathname = filepath + fileprefix ;
  String infilename = filepathname + ".in" ;
  String outfilename = filepathname + ".out" ;
  String [ ] lines = new String ( line , "rU" ) . split ( " " ) ;
  int n = Integer . parseInt ( lines [ 1 ] ) ;
  PrintWriter out = new PrintWriter ( outfilename ) ;
  int linenum = 1 ;
  int cases = Integer . parseInt ( lines [ 0 ] ) ;
  class Tree {
    double p , String feature , t1 , t2 ;
    public Tree < Double > getP ( String animal , double prob ) {
      return tree . getP ( animal , prob ) ;
    }
  }
  for ( int i = 1 ;
  i < cases ;
  i ++ ) {
    int L = Integer . parseInt ( lines [ i ] ) ;
    linenum += 1 ;
    Tree < Double > tree = parseTree ( " " . substring ( linenum , linenum + L ) ) ;
    linenum += L ;
    String out = "" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      String line = lines [ i ] ;
      linenum += A ;
      String casestr = "Case #" + ( j == 0 ? "" : "" ) + out ;
      System . out . println ( casestr ) ;
      out . println ( casestr ) ;
      out . println ( "\n" ) ;
    }
    String [ ] features = new String [ 2 ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      String line = lines [ i ] ;
      linenum += A ;
      animals [ j ] = parseAnimal ( line ) ;
    }
    String line = lines [ linenum ] ;
    linenum += 1 ;
    String animstr = line . substring ( linenum , linenum + 1 ) ;
    linenum += 1 ;
    Tree < Double > tree = parseTree ( " " . substring ( linenum ) , prob ) ;
    linenum += 1 ;
    String casestr = "Case #" + ( j == 0 ? "" : "" ) + out ;
    out . println ( casestr ) ;
    out . println ( "\n" ) ;
  }
  return tree ;
}
