public static List < Integer > primeFactors ( int n ) {
  int i = 2 ;
  List < Integer > factors = new ArrayList < Integer > ( ) ;
  while ( i * i <= n ) {
    if ( n % i != 0 ) {
      i ++ ;
    }
    else {
      n /= i ;
      factors . add ( i ) ;
    }
  }
  if ( n > 1 ) {
    factors . add ( n ) ;
  }
  return factors ;
}
int n = Integer . parseInt ( input . nextLine ( ) ) ;
if ( n >= 15002 ) {
  int [ ] a ;
  if ( n % 2 == 0 ) {
    a = new int [ n ] ;
    for ( int i = 1 ;
    i <= 15001 ;
    i ++ ) {
      a [ i ] = i * 2 ;
    }
    for ( int i = 1 ;
    i <= 15000 ;
    i ++ ) {
      a [ i ] = i * 6 + 3 ;
    }
  }
  else {
    a = new int [ n ] ;
    for ( int i = 1 ;
    i <= 15000 ;
    i ++ ) {
      a [ i ] = i * 2 ;
    }
    for ( int i = 1 ;
    i <= 14999 ;
    i ++ ) {
      a [ i ] = i * 6 + 3 ;
    }
  }
  System . out . println ( ( Integer ) a ) ;
}
else if ( n == 3 ) {
  System . out . println ( ( Integer ) 2 + " " + ( Integer ) 5 + " " + ( Integer ) 63 ) ;
}
else {
  List < Integer > b = primeFactors ( ( n - 1 ) * ( n - 2 ) ) ;
  b . forEach ( i -> {
    int c = 0 ;
    for ( int i : b ) {
      if ( i >= 3 ) {
        c = i ;
        break ;
      }
    }
    int [ ] d = new int [ n ] ;
    for ( int i = 1 ;
    i <= n - 1 ;
    i ++ ) {
      d [ i ] = i * 2 ;
    }
    d [ c ] = c * 3 ;
    System . out . println ( ( Integer ) d ) ;
  }
  return b ;
}
