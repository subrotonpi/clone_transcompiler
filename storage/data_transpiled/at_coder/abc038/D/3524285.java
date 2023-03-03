static int N = Integer . parseInt ( input ) {
  List < Tuple < Integer >> box = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) box . add ( new Tuple < > ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  box = new ArrayList < > ( box ) ;
  Collections . sort ( box , new Comparator < Tuple < Integer >> ( ) {
    @ Override public int compare ( Tuple < Integer > o1 , Tuple < Integer > o2 ) {
      return ( o1 . x - o2 . x ) . compareTo ( o2 . x ) ;
    }
  }
  ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( Integer a : box ) L . add ( a ) ;
  @ SuppressWarnings ( "unchecked" ) int i ;
  return i ;
}
