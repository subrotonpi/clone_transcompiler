@ java . io . IOException ( "d:\\incoming\\a-large.in" ) public static void go ( java . io . BufferedReader in , java . io . PrintStream outp ) throws IOException {
  java . io . PrintStream sb = new java . io . PrintStream ( new java . io . PrintStream ( new java . io . FileOutputStream ( "d:\\incoming\\a.out" ) ) ) ;
  {
    double ret = Double . parseDouble ( in . readLine ( ) ) ;
    if ( in . readLine ( ) . equals ( ")" ) return ret ;
    int nexttree = nexttree + 3 ;
    if ( ! in . readLine ( ) . equals ( "" ) ) {
      int opened = 0 ;
      do {
        if ( in . read ( ) == '(' ) opened ++ ;
        else if ( in . read ( ) == ')' ) opened -- ;
        nexttree ++ ;
        if ( opened == 0 ) break ;
      }
      while ( in . read ( ) != ')' ) ;
    }
    else {
    }
    sb . println ( "Number of tokens #" + ( ++ cc ) + ":" ) ;
    outp . println ( "Number of tokens #" + ( ++ cc ) + ":" ) ;
    int lines = Integer . parseInt ( in . readLine ( ) ) ;
    String desc = "" ;
    for ( int i = 0 ;
    i < xrange ( lines ) ;
    i ++ ) {
      desc += in . readLine ( ) + " " ;
    }
    String [ ] tokens = desc . replace ( "(" , "( " ) . replace ( ")" , " )" ) . split ( " " ) ;
    Set < String > features = new HashSet < String > ( ) ;
    int animals = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int i = 0 ;
    i < xrange ( animals ) ;
    i ++ ) {
      Set < String > has = new HashSet < String > ( ) ;
      String [ ] tok = in . readLine ( ) . split ( " " ) . subList ( 2 ) ;
      for ( String s : tok ) has . add ( s ) ;
      outp . println ( sb . format ( "%.10lf" , go ( tokens , 0 , has ) ) ) ;
    }
  }
  outp . close ( ) ;
}
