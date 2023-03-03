public static List < Integer > solve ( int a , int b ) {
  if ( a == b ) {
    List < Integer > list = new ArrayList < Integer > ( ) ;
    if ( a > b ) {
      for ( int i = 1 ;
      i <= a ;
      i ++ ) {
        for ( int x : solve ( a % i , b ) ) {
          list . add ( i ) ;
          list . add ( x ) ;
        }
      }
    }
    return list ;
  }
  /* subseq */
  if ( b . length ( ) == 0 ) return true ;
  int x = 0 ;
  for ( int t : a ) {
    if ( t == b [ x ] ) {
      x ++ ;
      if ( x == b . length ) return true ;
    }
  }
  /* int n */
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  List < Integer > B = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A . add ( i ) ;
    B . add ( i ) ;
  }
  List < List < Integer >> R = new ArrayList < List < Integer >> ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    R . add ( Lists . newArrayList ( solve ( A . get ( i ) , B . get ( i ) ) ) ) ;
    if ( R . get ( R . size ( ) - 1 ) . size ( ) == 0 ) {
      System . out . println ( - 1 ) ;
      exit ( 0 ) ;
    }
  }
  List < Integer > L = new ArrayList < Integer > ( ) ;
  int answer = 0 ;
  for ( int i = 50 ;
  i > 0 ;
  i -- ) {
    List < Integer > T = L . add ( i ) ;
    boolean ok = true ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      boolean cur = false ;
      for ( List < Integer > seq : R . get ( j ) ) {
        if ( subseq ( T , seq ) ) {
          cur = true ;
          break ;
        }
      }
      if ( ! cur ) {
        ok = false ;
        break ;
      }
    }
    if ( ! ok ) {
      L . add ( i ) ;
      answer += 2 * i ;
    }
  }
  System . out . println ( answer ) ;
  return L ;
}
