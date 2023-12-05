public static int [ ] Double ( int [ ] vec ) {
  int m = vec . length ;
  int [ ] res = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i += 2 ) {
    res [ i ] = vec [ i ] ;
    res [ i ] ^= m ;
    res [ i + 1 ] ^= m ;
    res [ i + 1 ] = vec [ i + 1 ] ;
  }
  return res ;
  /*Greedy */
  int n = 1 << n ;
  int [ ] res = new int [ m ] ;
  boolean [ ] vis = new boolean [ m ] ;
  vis [ 0 ] = true ;
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    int x = res [ i - 1 ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ! vis [ x ^ ( 1 << j ) ] ) {
        x ^= 1 << j ;
        break ;
      }
    }
    vis [ x ] = true ;
    res [ i ] = x ;
  }
  /*Perfect */
  if ( n == 1 ) {
    return new int [ ] {
      0 , 1 }
      ;
    }
    int m = 1 << n ;
    int [ ] A = Greedy ( n - 1 ) ;
    int [ ] B = Double . valueOf ( Perfect ( n - 2 ) ) ;
    Arrays . reverse ( B ) ;
    for ( int i = 0 ;
    i < m >> 1 ;
    i ++ ) {
      B [ i ] ^= m - 1 ;
    }
    A . addAll ( B ) ;
    /*Perfect */
    int n = Integer . parseInt ( input ( ) ) ;
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    m = 1 << n ;
    int c = Integer . parseInt ( input ( ) ) ;
    if ( ( c & 1 ) == 0 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
    int [ ] tmp = Perfect ( c ) ;
    for ( int i = c ;
    i < n ;
    i ++ ) {
      tmp = Double . valueOf ( tmp ) ;
    }
    int p = 0 ;
    int q = c ;
    int [ ] ans = new int [ m ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ( a ^ b ) >> i & 1 ) {
        for ( int j = 0 ;
        j < m ;
        j ++ ) {
          ans [ j ] ^= ( (