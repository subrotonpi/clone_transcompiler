public static void solve ( int [ ] [ ] a ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int n = input . nextInt ( ) ;
  final int [ ] [ ] a = new int [ 3 ] [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    a [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( ! ( ( a [ 0 ] [ j ] - 1 == a [ 1 ] [ j ] && a [ 2 ] [ j ] + 1 == a [ 1 ] [ j ] ) || ( a [ 0 ] [ j ] + 1 == a [ 1 ] [ j ] && a [ 2 ] [ j ] - 1 == a [ 1 ] [ j ] ) ) ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( ( j % 2 ) ^ ( ( ( a [ 0 ] [ j ] - 1 ) / 3 ) % 2 ) == 1 ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  {
    int [ ] bit = new int [ 3 * n + 1 ] ;
    int x = a [ 0 ] ;
    while ( x <= 3 * n ) {
      bit [ x ] += w ;
      x += x & - x ;
    }
  }
  {
    int [ ] ret = new int [ n ] ;
    x = a [ 0 ] ;
    while ( x > 0 ) {
      ret += bit [ x ] ;
      x -= x & - x ;
    }
    return ret ;
  }
  int [ ] bitOdd = new int [ 3 * n + 1 ] ;
  int inv_odd = 0 ;
  int flip_even = 0 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( j % 2 == 1 ) {
      if ( a [ 0 ] [ j ] > a [ 1 ] [ j ] ) {
        flip_even ++ ;
      }
    }
    else {
      inv_odd += j / 2 - solve ( a [ 0 ] [ j ] , bitOdd ) ;
      add ( a [ 0 ] [ j ] , 1 , bitOdd ) ;
    }
  }
  if ( flip_even % 2 != inv_odd % 2 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  System . out . println ( " Yes