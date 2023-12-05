public static final List < List < Integer >> loadCase ( String path ) {
  final List < List < Integer >> caseList = new ArrayList < List < Integer >> ( ) ;
  try {
    BufferedReader bufferedReader = new BufferedReader ( new FileReader ( path ) ) ;
    int caseNum = Integer . parseInt ( bufferedReader . readLine ( ) . trim ( ) ) ;
    for ( int k = 0 ;
    k <= caseNum ;
    k ++ ) {
      final List < Integer > case = new ArrayList < Integer > ( ) ;
      String sMax = Splitter . on ( ' ' ) . trimResults ( ) . next ( ) ;
      String digits = Splitter . on ( ' ' ) . trimResults ( ) . next ( ) ;
      sMax = Integer . parseInt ( sMax ) ;
      for ( int j = 0 ;
      j <= sMax ;
      j ++ ) {
        case . add ( ( int ) digits . charAt ( j ) - '0' ) ;
      }
      caseList . add ( case ) ;
    }
    return caseList ;
  }
  catch ( FileNotFoundException e ) {
    e . printStackTrace ( ) ;
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  return null ;
}
