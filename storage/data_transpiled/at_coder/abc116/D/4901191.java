public static void main ( String [ ] input , int numLines , int maxNum ) {
  int [ ] [ ] inpSorted = new int [ numLines ] [ ] ;
  for ( int st = 0 ;
  st < numLines ;
  st ++ ) {
    inpSorted [ st ] = Integer . parseInt ( input [ st ] ) ;
  }
  Arrays . sort ( inpSorted , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  Map < Integer , Integer > inpMap = new HashMap < Integer , Integer > ( ) ;
  for ( int t = 0 ;
  t < inpSorted . length ;
  t ++ ) {
    int d = inpSorted [ t ] [ 0 ] ;
    if ( ! t . equals ( inpMap . get ( t ) ) ) {
      inpMap . put ( t , d ) ;
    }
  }
  Set < Integer > variety = new HashSet < Integer > ( ) ;
  int score = 0 ;
  List < Integer > dup = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < maxNum ;
  i ++ ) {
    int t = inpSorted [ i ] [ 0 ] ;
    int d = inpSorted [ i ] [ 1 ] ;
    if ( variety . contains ( t ) ) {
      dup . add ( new Integer ( t ) ) ;
    }
    variety . add ( t ) ;
    if ( inpMap . containsKey ( t ) ) {
      dup . remove ( t ) ;
    }
    score += d ;
  }
  for ( Map . Entry < Integer , Integer > entry : inpMap . entrySet ( ) ) {
    if ( ( entry . getValue ( ) != null ) && ( entry . getValue ( ) . intValue ( ) > 0 ) ) {
      int t2 = entry . getValue ( ) ;
      int d2 = entry . getValue ( ) ;
      varValue ++ ;
      score = score - d2 + entry . getValue ( ) ;
      maxScore = Math . max ( maxScore , score + varValue * varValue ) ;
    }
  }
  System . out . println ( maxScore ) ;
}
