static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
{
  int n ;
  int b ;
  {
    if ( n == 0 ) {
      return 0 ;
    }
    int m = n % b ;
    return m * m + sumsq ( n / b , b ) ;
  }
  {
    Set < Integer > chain = new HashSet < Integer > ( ) ;
    while ( n != 1 && ! chain . contains ( n ) ) {
      chain . add ( n ) ;
      n = sumsq ( n , b ) ;
    }
    if ( n == 1 ) {
      happy . addAll ( chain ) ;
      return true ;
    }
    else {
      notHappy . addAll ( chain ) ;
      return false ;
    }
  }
  for ( int t : xrange ( T ) ) {
    int [ ] bases = Arrays . stream ( System . console ( ) . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    Map < Integer , Set < Integer >> happy = Maps . newHashMap ( ) ;
    Map < Integer , Set < Integer >> notHappy = Maps . newHashMap ( ) ;
    for ( int b : bases ) {
      happy . put ( b , Sets . newHashSet ( ) ) ;
    }
    for ( int b : bases ) {
      notHappy . put ( b , Sets . newHashSet ( ) ) ;
    }
    n = 2 ;
    while ( true ) {
      for ( int b : bases ) {
        if ( ! isHappy ( n , b , happy . get ( b ) , notHappy . get ( b ) ) ) {
          break ;
        }
      }
      else {
        System . out . println ( "Case #" + ( t + 1 ) + ": " + n ) ;
        break ;
      }
      n ++ ;
    }
  }
  return t ;
}
