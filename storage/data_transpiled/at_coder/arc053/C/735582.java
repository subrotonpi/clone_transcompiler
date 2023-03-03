public static int solve ( int [ ] a , int [ ] b , int N ) {
  List < Pair > up = new ArrayList < > ( ) ;
  List < Pair > down = new ArrayList < > ( ) ;
  List < Pair > keep = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( a [ i ] < b [ i ] ) {
      down . add ( new Pair ( a [ i ] , b [ i ] ) ) ;
    }
    else if ( a [ i ] > b [ i ] ) {
      up . add ( new Pair ( a [ i ] , b [ i ] ) ) ;
    }
    else {
      keep . add ( new Pair ( a [ i ] , b [ i ] ) ) ;
    }
  }
  Collections . sort ( up , new Comparator < Pair > ( ) {
    public int compare ( Pair o1 , Pair o2 ) {
      int maxT = 0 ;
      int curT = 0 ;
      for ( Pair d : down ) {
        curT += d . first ;
        if ( curT > maxT ) {
          maxT = curT ;
        }
        curT -= d . second ;
      }
      return maxT ;
    }
  }
  ) ;
  Collections . sort ( down , new Comparator < Pair > ( ) {
    public int compare ( Pair o1 , Pair o2 ) {
      int maxT = 0 ;
      int curT = 0 ;
      for ( Pair d : keep ) {
        curT += k . first ;
        if ( curT > maxT ) {
          maxT = curT ;
        }
        curT -= k . second ;
      }
      return maxT ;
    }
  }
  ) ;
  N = Integer . parseInt ( input ( ) ) ;
  a = new int [ N ] ;
  b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ai = Integer . parseInt ( input ( ) ) ;
    int bi = Integer . parseInt ( input ( ) ) ;
    a [ i ] = ai ;
    b [ i ] = bi ;
  }
  System . out . println ( solve ( a , b , N ) ) ;
  return N ;
}
