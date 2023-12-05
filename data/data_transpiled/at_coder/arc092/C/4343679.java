public static void solve ( int n , List < Integer > aa ) {
  List < Integer > opa = new ArrayList < Integer > ( ) ;
  int aMax = max ( aa ) ;
  if ( aMax <= 0 ) {
    System . out . println ( aMax ) ;
    int x = aa . indexOf ( aMax ) + 1 ;
    for ( int i = n ;
    i >= x ;
    i -- ) {
      opa . add ( i ) ;
    }
    for ( int i = 1 ;
    i < x ;
    i ++ ) {
      opa . add ( 1 ) ;
    }
  }
  else {
    int sum0 = 0 ;
    int sum1 = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = aa . get ( i ) ;
      if ( 0 < a ) {
        if ( i % 2 == 0 ) sum0 += a ;
        else sum1 += a ;
      }
    }
    System . out . println ( max ( sum0 , sum1 ) ) ;
    boolean [ ] used = new boolean [ n ] ;
    int i0 = sum0 < sum1 ? 1 : 0 ;
    for ( int i = i0 ;
    i < n ;
    i += 2 ) {
      if ( 0 < aa . get ( i ) ) {
        used [ i ] = true ;
      }
    }
    int k = n ;
    for ( int i = n - 1 ;
    i >= 0 ;
    i -- ) {
      if ( ! used [ i ] ) {
        opa . add ( i + 1 ) ;
        k -- ;
      }
      else {
        break ;
      }
    }
    int j = 0 ;
    for ( int i = k ;
    i >= 0 ;
    i -- ) {
      if ( ! used [ i ] ) {
        opa . add ( 1 ) ;
        j ++ ;
      }
      else {
        break ;
      }
    }
    int c = 0 ;
    for ( int i = k - 1 ;
    i >= j ;
    i -- ) {
      if ( used [ i ] ) {
        c = 0 ;
      }
      else {
        c ++ ;
        if ( c == 3 ) {
          opa . add ( i - j + 2 ) ;
          k -= 2 ;
          c = 1 ;
        }
      }
    }
    for ( int i = 0 ;
    i < ( k - j ) / 2 ;
    i ++ ) {
      opa . add ( 2 ) ;
    }
    System . out . println ( opa . size ( ) ) ;
    for ( int v : opa ) {
      System . out . println ( v ) ;
    }
  }
  {
    String n = input ( ) ;
    n = Integer . parseInt ( n