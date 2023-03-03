public static int N = Integer . parseInt ( input ) {
  final List < Pair < String , Integer >> allList = new ArrayList < > ( ) ;
  int counter = 1 ;
  for ( String line : input . split ( " " ) ) {
    int a = Integer . parseInt ( line . trim ( ) ) ;
    int b = Integer . parseInt ( line . trim ( ) ) ;
    allList . add ( new Pair < > ( "a" , counter , a ) ) ;
    allList . add ( new Pair < > ( "b" , counter , b ) ) ;
    counter ++ ;
  }
  Arrays . sort ( allList , new Comparator < Pair < String , Integer >> ( ) {
    @ Override public int compare ( Pair < String , Integer > o1 , Pair < String , Integer > o2 ) {
      return o1 . second . compareTo ( o2 . second ) ;
    }
  }
  ) ;
  final int sp_c = allList . get ( N ) . second ;
  final int sp_i_p = allList . get ( N ) . third ;
  final int sp_i_pp = allList . get ( N + 1 ) . third ;
  boolean flag = true ;
  int ss = Integer . parseInt ( allList . get ( N ) . second ) ;
  Set < Integer > map = new HashSet < > ( ) ;
  Integer temp = null ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Integer ab = allList . get ( i ) . second ;
    int c = allList . get ( i ) . third ;
    int i = allList . get ( i + 1 ) . third ;
    if ( temp != null && temp != ab ) {
      flag = false ;
    }
    if ( map . contains ( c ) ) {
      flag = true ;
      break ;
    }
    map . add ( c ) ;
    temp = ab ;
  }
  if ( flag ) {
    System . out . println ( ss ) ;
  }
  else {
    final List < Integer > candidates = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Integer ab = allList . get ( i ) . second ;
      int c = allList . get ( i + 1 ) . third ;
      int i = allList . get ( i + 1 ) . third ;
      if ( sp_c != c ) {
        candidates . add ( ss - i + sp_i_p ) ;
      }
      else {
        candidates . add ( ss - i + sp_i_pp ) ;
      }
    }
    System . out . println (