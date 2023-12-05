static final Class < ? > serialVersionUID = - 1 ;
class DiamondFound {
}
private void findAncestors ( int classNum , Map < Integer , Set < Integer >> inheritance , Map < Integer , Set < Integer >> ancestors ) {
  if ( ancestors . get ( classNum ) != null ) {
    return ;
  }
  Set < Integer > directFathers = inheritance . get ( classNum ) ;
  ancestors . get ( classNum ) . addAll ( directFathers ) ;
  for ( Integer directFather : directFathers ) {
    findAncestors ( directFather , inheritance , ancestors ) ;
    Set < Integer > ancestorsOfDirectFather = ancestors . get ( directFather ) ;
    int before = ancestors . get ( classNum ) . size ( ) ;
    ancestors . get ( classNum ) . addAll ( ancestorsOfDirectFather ) ;
    int after = ancestors . get ( classNum ) . size ( ) ;
    if ( after - before != ancestorsOfDirectFather . size ( ) ) {
      throw new DiamondFound ( ) ;
    }
  }
}
private static void solve ( int numOfClasses , Map < Integer , Set < Integer >> inheritance ) {
  inheritance . clear ( ) ;
  for ( int i = 1 ;
  i <= numOfClasses ;
  i ++ ) {
    try {
      findAncestors ( classNum , inheritance , ancestors ) ;
    }
    catch ( DiamondFound e ) {
      return ;
    }
  }
  return ;
}
private static void processFiles ( BufferedReader in , PrintWriter out ) {
  int numOfTestCases = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int testNumber = 0 ;
  testNumber < numOfTestCases ;
  testNumber ++ ) {
    int numOfClasses = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    Map < Integer , List < Integer >> inheritance = new HashMap < Integer , List < Integer >> ( ) ;
    for ( int classNum = 1 ;
    classNum <= numOfClasses ;
    classNum ++ ) {
      String [ ] params = in . readLine ( ) . trim ( ) . split ( " " ) ;
      assert params . length - 1 == Integer . parseInt ( params [ 0 ] ) ;
      inheritance . put ( classNum , new ArrayList < Integer > ( params ) ) ;
    }
    int result = solve ( numOfClasses , inheritance ) ;
    out . println ( "Case #" + ( testNumber + 1 ) + ": " + result ) ;
    