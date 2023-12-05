{
  SP = new int [ 3 ] ;
  int rev = 0 ;
  while ( n > 0 ) {
    m = 10 * m + n % 10 ;
    n /= 10 ;
  }
  {
    int n = 0 ;
    for ( int i = 0 ;
    i < seq . length ;
    i ++ ) {
      n = n * 10 + seq [ i ] ;
    }
    return n ;
  }
  ArrayList < Integer > pal = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > q = new ArrayList < Integer > ( ) ;
  q . add ( new Integer ( 1 ) ) ;
  q . add ( new Integer ( 4 ) ) ;
  q . add ( new Integer ( 2 ) ) ;
  q . add ( new Integer ( 9 ) ) ;
  q . add ( new Integer ( 3 ) ) ;
  for ( int i = 1 ;
  i <= 53 ;
  i ++ ) {
    ArrayList < Integer > nq = new ArrayList < Integer > ( ) ;
    Iterator < Integer > itr = q . iterator ( ) ;
    while ( itr . hasNext ( ) ) {
      int l = itr . next ( ) ;
      for ( int k = 0 ;
      k <= 1 && k <= 2 ;
      k ++ ) {
        if ( l + k * k <= 4 ) {
          int num = n * 10 + k ;
          nq . add ( new Integer ( l + k * k ) ) ;
          nq . add ( new Integer ( num ) ) ;
          pal . add ( num * 10 * ( i + 1 ) + rev ( num ) ) ;
          pal . add ( num * 10 * ( i + 2 ) + rev ( num ) ) ;
          pal . add ( num * 10 * ( i + 2 ) + rev ( num ) + 10 * ( i + 1 ) ) ;
          if ( l + k * k <= 2 ) pal . add ( num * 10 * ( i + 2 ) + rev ( num ) + 2 * 10 * ( i + 1 ) ) ;
        }
      }
    }
    q = nq ;
  }
  pal . add ( 1 ) ;
  pal . add ( 2 ) ;
  pal . add ( 3 ) ;
  pal . add ( 11 ) ;
  pal . add ( 22 ) ;
  pal . add ( 101 ) ;
  pal . add ( 111 ) ;
  pal . add ( 121 ) ;
  pal . add ( 202 ) ;
  pal . add ( 212 ) ;
  Arrays . sort ( pal ) ;
  pal = new ArrayList < Integer > ( pal ) ;
  int n = Integer . parseInt ( new Scanner ( System . in ) ) ;
  @ SuppressWarnings ( "