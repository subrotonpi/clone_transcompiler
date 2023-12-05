public static int [ ] [ ] getSortedList ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  List < Integer > B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - Q + 1 ;
  i ++ ) {
    B . add ( A . get ( i ) ) ;
  }
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - Q + 1 ;
  i ++ ) {
    L . add ( new Integer [ ] {
      i , B . get ( i + Q - 1 ) - B . get ( i ) }
      ) ;
    }
    List < Integer > sL = new ArrayList < > ( L ) ;
    Collections . sort ( sL , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        return o2 . compareTo ( o1 ) ;
      }
    }
    ) ;
    if ( Q == 1 ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
    if ( Q == N - K + 1 ) {
      System . out . println ( L . get ( 0 ) . intValue ( ) ) ;
      exit ( ) ;
    }
    if ( K == 1 ) {
      System . out . println ( sL . get ( 0 ) . intValue ( ) ) ;
      exit ( ) ;
    }
    if ( sL . get ( 0 ) . intValue ( ) == 0 ) {
      System . out . println ( sL . get ( 0 ) . intValue ( ) ) ;
      exit ( ) ;
    }
    if ( sL . get ( 0 ) . intValue ( ) == sL . get ( sL . size ( ) - 1 ) . intValue ( ) ) {
      System . out . println ( sL . get ( 0 ) . intValue ( ) ) ;
      exit ( ) ;
    }
    int nowMaxValue = - 1 ;
    int nowMinValue = - 1 ;
    int nowMinXY = ( int ) 1e10 ;
    for ( Integer key : sL ) {
      Integer maxValue = B . get ( key + Q - 1 ) ;
      Integer minValue = B . get ( key ) ;
      List < Integer > C = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i