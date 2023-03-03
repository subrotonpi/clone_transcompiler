static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
}
public List < Integer > getIntList ( ) {
  return Arrays . asList ( input . nextLine ( ) . split ( " " ) ) ;
}
public int [ ] zeros ( int n ) {
  return new int [ n ] ;
}
public int gcd ( int x , int y ) {
  int m = Math . max ( x , y ) ;
  int n = Math . min ( x , y ) ;
  while ( m % n != 0 ) {
    int w = m % n ;
    m = n ;
    n = w ;
  }
  return n ;
}
public int lcm ( int x , int y ) {
  return x * y / gcd ( x , y ) ;
}
public static void db ( int x ) {
  if ( debug ) System . out . println ( x ) ;
  debug = false ;
  int N = getInt ( ) ;
  int [ ] [ ] TA = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    TA [ i ] = getIntList ( ) ;
  }
  db ( TA ) ;
  int [ ] real = TA [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int lc ;
    if ( real [ 0 ] / TA [ i ] [ 0 ] > real [ 1 ] / TA [ i ] [ 1 ] ) {
      lc = ( real [ 0 ] + TA [ i ] [ 0 ] - 1 ) / TA [ i ] [ 0 ] * TA [ i ] [ 0 ] ;
      real [ 0 ] = lc ;
      real [ 1 ] = lc * TA [ i ] [ 1 ] / TA [ i ] [ 0 ] ;
    }
    else {
      lc = ( real [ 1 ] + TA [ i ] [ 1 ] - 1 ) / TA [ i ] [ 1 ] * TA [ i ] [ 1 ] ;
      real [ 1 ] = lc ;
      real [ 0 ] = lc * TA [ i ] [ 0 ] / TA [ i ] [ 1 ] ;
    }
    db ( new int [ ] {
      lc , real }
      ) ;
    }
    System . out . println ( Arrays . toString ( real ) ) ;
  }
  