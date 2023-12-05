static private double solve ( int n , int k , double [ ] p ) {
  int i ;
  Arrays . sort ( p ) ;
  double [ ] opts = new double [ k + 1 ] ;
  int l = k / 2 ;
  for ( i = xrange ( 0 , k + 1 ) ;
  i < l ;
  i ++ ) {
    memo = new HashMap < > ( ) ;
    double [ ] q = new double [ p . length - i ] ;
    System . arraycopy ( p , 0 , q , 0 , p . length - ( k - i ) ) ;
    opts [ i ] = prob ( l , l , q ) ;
  }
  memo . clear ( ) ;
  /* prob(a,b,q) = */
  {
    double ans ;
    int a , b , q ;
    if ( memo . containsKey ( new Pair ( a , b , q . length ) ) ) {
      return memo . get ( new Pair ( a , b , q . length ) ) ;
    }
    else {
      ans = 0 ;
      if ( ( a == 0 ) && ( b == 0 ) ) {
        ans = 1. ;
        for ( i = q . length - b ;
        i > 0 ;
        i -- ) ans *= ( 1. - i ) ;
      }
      else if ( ( b == 0 ) && ( a == 0 ) ) {
        ans = 1. ;
        for ( i = q . length - a ;
        i > 0 ;
        i -- ) ans *= i ;
      }
      else {
        ans = q [ a + b - 1 ] * prob ( a - 1 , b , q ) + ( 1. - q [ a + b - 1 ] ) * prob ( a , b - 1 , q ) ;
      }
      memo . put ( new Pair ( a , b , q . length ) , ans ) ;
    }
  }
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int cas : xrange ( 1 , t + 1 ) ) {
    n = Integer . parseInt ( readLine ( ) ) ;
    k = Integer . parseInt ( readLine ( ) ) ;
    p = Double . parseDouble ( readLine ( ) ) ;
    System . out . println ( "Case #" + cas + ": " + solve ( n , k , p ) ) ;
  }
  return t ;
}
