public static int N ( Scanner input ) {
  int N = input . nextInt ( ) ;
  List < Tuple > inRed = new ArrayList < > ( N ) ;
  List < Tuple > inBlu = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inRed . add ( new Tuple ( Integer . parseInt ( input . next ( ) ) ) ) ;
  }
  Arrays . sort ( inRed , new Comparator < Tuple > ( ) {
    @ Override public int compare ( Tuple o1 , Tuple o2 ) {
      return o1 . y - o2 . y ;
    }
  }
  ) ;
  Arrays . sort ( inBlu , new Comparator < Tuple > ( ) {
    @ Override public int compare ( Tuple o1 , Tuple o2 ) {
      return o1 . x - o2 . x ;
    }
  }
  ) ;
  int ans = 0 ;
  for ( int ei = 0 ;
  ei < N ;
  ei ++ ) {
    Tuple x = inBlu . get ( ei ) ;
    int x = x . x ;
    int y = y . y ;
    int idx = 0 ;
    boolean found = false ;
    for ( int e = 0 ;
    e < N ;
    e ++ ) {
      Tuple p = inRed . get ( e ) ;
      if ( p . x < x && p . y < y ) {
        idx = e ;
        found = true ;
        break ;
      }
    }
    if ( found ) {
      ans ++ ;
      inRed . remove ( idx ) ;
    }
  }
  return ans ;
}
