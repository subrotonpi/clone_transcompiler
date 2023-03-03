static final String getTestName ( ) throws IOException {
  /* if (str.length() <= 1) {
  return str;
  } else {
  for (String perm : allPerms(str.substring(1))) {
  for (int i = 0; i < perm.length(); i++) {
  System.out.println("Case #"+(caseNum+1)+": "+getExpectedOfArray(toSort,false));
  }
  }
  }*/
  HashMap < Long , Double > expectedCache = new HashMap < Long , Double > ( ) ;
  /* if (expectedCache.containsKey(l)) {
  return expectedCache.get(l);
  }*/
  long c = 0 ;
  List < Integer > aList = new ArrayList < Integer > ( ) ;
  for ( int i = 1 ;
  i <= l ;
  i ++ ) {
    aList . add ( i ) ;
  }
  long xCoeff = 0 ;
  for ( String perm : allPerms ( aList ) ) {
    double g = getExpectedOfArray ( perm , true ) ;
    if ( g == - 1 ) {
      xCoeff ++ ;
    }
    else {
      c += g ;
    }
  }
  double f = 1.0 * Stream . of ( a ) . sum ( ) ;
  c += f ;
  double toReturn = ( 1.0 * c ) / ( 1.0 * f - xCoeff ) ;
  expectedCache . put ( l , toReturn ) ;
  return toReturn ;
}
