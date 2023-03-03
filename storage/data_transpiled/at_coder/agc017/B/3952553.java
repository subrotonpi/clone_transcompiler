public static void main ( String input , int n , int a , int b , int c , int d ) {
  int diffAB = Math . abs ( b - a ) ;
  int diffCD = d - c ;
  int mod = c + d ;
  int modAB = diffAB % mod ;
  int MAX = d * ( n - 1 ) ;
  int MAX_mod = MAX % mod ;
  int MIN_mod = ( c * ( n - 1 ) ) % mod ;
  if ( MAX >= diffAB ) {
    if ( diffCD * ( n - 1 ) + 1 >= mod ) {
      System . out . println ( "YES" ) ;
    }
    else {
      if ( MAX_mod >= MIN_mod ) {
        if ( MIN_mod <= modAB && modAB <= MAX_mod ) {
          System . out . println ( "YES" ) ;
        }
        else {
          System . out . println ( "NO" ) ;
        }
      }
      else {
        if ( modAB >= MIN_mod || modAB <= MAX_mod ) {
          System . out . println ( "YES" ) ;
        }
        else {
          System . out . println ( "NO" ) ;
        }
      }
    }
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
