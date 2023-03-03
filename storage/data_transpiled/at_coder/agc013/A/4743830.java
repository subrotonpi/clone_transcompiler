public static void N ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  boolean flag = false ;
  boolean isIncrease = true ;
  int count = 1 ;
  for ( int i = 0 ;
  i < A . length - 1 ;
  i ++ ) {
    if ( ! flag ) {
      if ( A [ i ] < A [ i + 1 ] ) {
        isIncrease = true ;
        flag = true ;
      }
      else if ( A [ i ] > A [ i + 1 ] ) {
        isIncrease = false ;
        flag = true ;
      }
    }
    else {
      if ( A [ i ] > A [ i + 1 ] ) {
        if ( isIncrease ) {
          count ++ ;
          flag = false ;
        }
      }
      else if ( A [ i ] < A [ i + 1 ] ) {
        if ( ! isIncrease ) {
          count ++ ;
          flag = false ;
        }
      }
    }
  }
  System . out . println ( count ) ;
}
