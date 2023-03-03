private static HashMap < Integer , Integer > memo = new HashMap < Integer , Integer > ( ) {
  private final HashMap < Integer , Integer > bestChoice = new HashMap < Integer , Integer > ( ) ;
  String A = "" ;
  String B = "" ;
  int N = 0 ;
  {
    int i ;
    int caseAB ;
    int caseBA ;
    int solAB ;
    if ( i == N ) return 0 ;
    if ( memo . containsKey ( new Integer ( i ) ) ) return memo . get ( new Integer ( i ) ) ;
    else if ( caseBA < 0 ) {
      solBA = rebuild ( "<" , - 1 ) ;
      return memo . get ( new Integer ( i ) ) ;
    }
    else {
      solAB = rebuild ( ">" , 1 ) ;
      solBA = rebuild ( ">" , 1 ) ;
      return Math . min ( solAB , solBA ) ;
    }
    T = input ( ) ;
    for ( i = 0 ;
    i < xrange ( T ) ;
    i ++ ) {
      print ( "Case #" + ( i + 1 ) + ": " + solve ( ) ) ;
    }
    int [ ] choicesA = new int [ N ] ;
    choicesA [ 0 ] = cA != '?' ? ':range(0,10);int[]choicesB=newint[N];for(i=0;i<choicesA.length;i++){choicesB[i]=cB!=' ? '?' : range ( 0 , 10 ) ;
    int ans = 10000000000000000000 ;
    Integer bc = null ;
    for ( int chA = 0 ;
    chA < choicesA . length ;
    chA ++ ) {
      for ( int chB = 0 ;
      chB < choicesB . length ;
      chB ++ ) {
        if ( ( chA > chB ) && ( chB > chA ) ) {
          if ( ( stay != '<' ) && ( stay != '>' ) ) {
            int xx = sgn * ( chA - chB ) * ( 10 * ( N - i - 1 ) ) + rec ( i + 1 , '?' , sgn ) ;
            if ( xx < ans ) {
              ans = xx ;
              bc = new Integer ( chA ) ;
            }
          }
          else {
            int xx = rec ( i + 1 , stay , sgn ) ;
            if ( xx < ans ) ans = xx ;
            bc = new Integer ( chA