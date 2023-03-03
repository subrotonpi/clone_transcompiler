public static final Scanner getScanner ( final Scanner in ) {
  final String input = in . nextLine ( ) ;
  final IntFunction mii = new IntFunction ( ) {
    @ Override public int apply ( final String input ) {
      return in . nextInt ( ) ;
    }
  }
  ;
  int lim = 10000 ;
  int [ ] sieve = new int [ lim ] ;
  int [ ] prime = new int [ lim ] ;
  for ( int i = 2 ;
  i < lim ;
  i ++ ) {
    if ( ! sieve [ i ] ) continue ;
    prime [ i ] = i ;
    for ( int j = i * i ;
    j < lim ;
    j += i ) sieve [ j ] = 0 ;
  }
  Arrays . sort ( prime ) ;
  Arrays . sort ( prime ) ;
  prime = Arrays . copyOf ( prime , prime . length ) ;
  Arrays . sort ( prime ) ;
  int [ ] [ ] li = new int [ n ] [ ] ;
  while ( prime . length > 0 ) {
    li [ 0 ] = prime [ prime . length - 1 ] ;
    li [ 1 ] = prime [ prime . length - 1 ] ;
  }
  final int [ ] powers = li ;
  final int n = in . nextInt ( ) ;
  final int [ ] [ ] out = new int [ n ] [ n ] ;
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( ( i + j ) % 2 == 0 ) {
          out [ i ] [ j ] = powers [ ( i + j ) / 2 ] * ( i + 1 ) ;
          if ( s . contains ( out [ i ] [ j ] ) ) System . out . println ( "why" + i + " " + j ) ;
          s . add ( out [ i ] [ j ] ) ;
        }
      }
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( i + j ) % 2 == 1 ) {
        int big = i + 1 ;
        if ( i > 0 ) big *= i ;
        if ( i < n - 1 ) big *= i + 2 ;
        big *= powers [ ( i + j ) / 2 ] ;
        big *= powers [ ( i + j + 1 )