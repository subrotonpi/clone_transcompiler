public static void print ( String input ) {
  T = Integer . parseInt ( input ) ;
  N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  M = Integer . parseInt ( input ) ;
  List < Integer > B = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    B . add ( Integer . parseInt ( input ) ) ;
  }
  int time = 0 ;
  List < Boolean > takoyakiFlg = new ArrayList < Boolean > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    takoyakiFlg . add ( false ) ;
  }
  List < Integer > expireList = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    expireList . add ( A . get ( i ) + T ) ;
  }
  boolean missionFailed = false ;
  while ( time < 100 ) {
    time ++ ;
    while ( A . contains ( time ) ) {
      int index = A . indexOf ( time ) ;
      takoyakiFlg . set ( index , true ) ;
      A . set ( index , 0 ) ;
    }
    while ( B . contains ( time ) ) {
      int index = B . indexOf ( time ) ;
      if ( takoyakiFlg . contains ( true ) ) {
        int takoIndex = takoyakiFlg . indexOf ( true ) ;
        takoyakiFlg . set ( takoIndex , false ) ;
        B . set ( index , 0 ) ;
      }
      else {
        missionFailed = true ;
        break ;
      }
    }
    if ( missionFailed ) {
      break ;
    }
    while ( expireList . contains ( time ) ) {
      int index = expireList . indexOf ( time ) ;
      takoyakiFlg . set ( index , false ) ;
      expireList . set ( index , 0 ) ;
    }
  }
  if ( missionFailed ) {
    System . out . println ( "no" ) ;
  }
  else {
    System . out . println ( "yes" ) ;
  }
}
