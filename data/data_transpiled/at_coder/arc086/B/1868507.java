public static List < Point > solve ( int [ ] a , int begin , int end , List < Point > queue ) {
  if ( begin >= end ) return null ;
  int maxx = new ArrayList < > ( Collections . nCopies ( Math . abs ( begin ) , end ) ) . get ( 0 ) ;
  int m ;
  if ( a [ begin ] >= maxx ) {
    m = a [ begin ] . indexOf ( maxx ) + begin ;
  }
  else {
    m = a [ begin ] . indexOf ( - 1 * maxx ) + begin ;
    maxx = - 1 * maxx ;
  }
  if ( maxx == 0 ) return Collections . emptyList ( ) ;
  if ( maxx > 0 ) {
    solve ( a , begin , m - 1 , queue ) ;
    for ( int i = Math . max ( 0 , m - 1 ) ;
    i < end ;
    i ++ ) {
      if ( a [ i + 1 ] >= a [ i ] ) continue ;
      else {
        a [ i + 1 ] += a [ i ] ;
        queue . add ( new Point ( i , i + 1 ) ) ;
        if ( a [ i + 1 ] < a [ i ] ) {
          a [ i + 1 ] += a [ i ] ;
          queue . add ( new Point ( i , i + 1 ) ) ;
        }
      }
    }
    return queue ;
  }
  if ( maxx < 0 ) {
    solve ( a , m + 1 , end , queue ) ;
    for ( int i = begin ;
    i < Math . min ( a . length - 1 , m + 1 ) ;
    i ++ ) {
      if ( a [ i ] <= a [ i + 1 ] ) continue ;
      else {
        a [ i ] += a [ i + 1 ] ;
        queue . add ( new Point ( i + 1 , i ) ) ;
        if ( a [ i ] > a [ i + 1 ] ) {
          a [ i ] += a [ i + 1 ] ;
          queue . add ( new Point ( i + 1 , i + 1 ) ) ;
        }
      }
    }
    return queue ;
  }
  if ( Class . forName ( "java.util.Scanner" ) . isClass ( ) ) {
    int n = Integer . parseInt ( input ( ) ) ;
    a = new ArrayList < > ( ) ;
    a [ n ] = Integer . parseInt ( input ( ) ) ;
    queue = solve ( a , 0 , a . length - 1 , new Point [ n ] ) ;
    System . out . println ( queue . size ( ) ) ;
    for ( int i = 0