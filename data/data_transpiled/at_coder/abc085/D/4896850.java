public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ( ) ) , H = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    A [ n ] = a ;
    B [ n ] = b ;
  }
  Arrays . sort ( B , reverse ) ;
  int maxA = max ( A ) ;
  int count = 0 ;
  for ( int b : B ) {
    if ( maxA < b ) {
      H -= b ;
      count ++ ;
      if ( H <= 0 ) {
        return count ;
      }
    }
    else {
      break ;
    }
  }
  System . out . println ( main ( ) ) ;
}
