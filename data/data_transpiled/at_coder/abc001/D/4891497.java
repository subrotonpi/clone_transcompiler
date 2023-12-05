static final class Time {
  int h = Integer . parseInt ( hhmm . substring ( 0 , 2 ) ) ;
  int m = Integer . parseInt ( hhmm . substring ( hhmm . length ( ) - 2 ) ) ;
  public String hhmm ( ) {
    return hhmm + "-" + h ;
  }
  public void roundDown ( ) {
    m = m / 5 * 5 ;
  }
  public void roundUp ( ) {
    m = Math . ceil ( m / 5 ) * 5 ;
    if ( m == 60 ) {
      m = 0 ;
      h ++ ;
    }
  }
  List < Time > memos = new ArrayList < > ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Time start = new Time ( input . nextLine ( ) ) , end = new Time ( input . nextLine ( ) ) ;
    start . roundDown ( ) ;
    end . roundUp ( ) ;
    memos . add ( new Time ( start . hhmm ( ) , end . hhmm ( ) ) ) ;
  }
  Collections . sort ( memos ) ;
  List < Time > result = new ArrayList < > ( ) ;
  result . add ( memos . remove ( 0 ) ) ;
  for ( int i = 0 ;
  i < memos . size ( ) ;
  i ++ ) {
    if ( memos . get ( i ) . x <= result . get ( memos . size ( ) - 1 ) . y ) {
      result . set ( memos . size ( ) - 1 , new Time ( Math . min ( result . get ( memos . size ( ) - 1 ) . x , memos . get ( i ) . x ) , Math . max ( result . get ( memos . size ( ) - 1 ) . y , memos . get ( i ) . y ) ) ) ;
    }
    else {
      result . add ( memos . get ( i ) ) ;
    }
  }
  for ( int i = 0 ;
  i < result . size ( ) ;
  i ++ ) {
    System . out . println ( result . get ( i ) ) ;
  }
  return null ;
}
