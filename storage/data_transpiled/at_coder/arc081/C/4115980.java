public static void main ( String [ ] args ) {
  String A = input ( ) ;
  int n = A . length ( ) ;
  List < Integer > nextI = new ArrayList < > ( ) ;
  int [ ] ct = new int [ 26 ] ;
  Arrays . fill ( ct , n ) ;
  int orda = Character . toLowerCase ( 'a' ) ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    ct [ Character . toLowerCase ( A . charAt ( i ) ) - orda ] = i ;
    nextI . add ( ct . copy ( ) ) ;
  }
  Collections . reverse ( nextI ) ;
  int [ ] dp = new int [ n + 1 ] ;
  dp [ n ] = 1 ;
  int j = - 1 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    ct = nextI . get ( i ) ;
    if ( max ( ct ) < n ) {
      j = i ;
      break ;
    }
    else dp [ i ] = 1 ;
  }
  if ( j == - 1 ) {
    ct = nextI . get ( 0 ) ;
    for ( int c = 0 ;
    c < 26 ;
    c ++ ) {
      if ( ct [ c ] == n ) {
        System . out . println ( ( char ) ( orda + c ) ) ;
        return ;
      }
    }
  }
  int [ ] rt = new int [ n ] ;
  for ( int i = j ;
  i >= 0 ;
  i -- ) {
    ct = nextI . get ( i ) ;
    int minC = 0 ;
    int minV = dp [ ct [ 0 ] + 1 ] ;
    for ( int c = 1 ;
    c < 26 ;
    c ++ ) {
      int v = dp [ ct [ c ] + 1 ] ;
      if ( v < minV ) {
        minC = c ;
        minV = v ;
      }
    }
    rt [ i ] = minC ;
    dp [ i ] = minV + 1 ;
  }
  StringBuffer r = new StringBuffer ( ) ;
  int i = 0 ;
  while ( i < n ) {
    if ( dp [ i ] == 1 ) {
      for ( int c = 0 ;
      c < 26 ;
      c ++ ) {
        if ( ! Character . isLetterOrDigit ( A . charAt ( i ) ) ) {
          r . append ( ( char ) ( orda + c ) ) ;
          break ;
        }
      }
      break ;
    }
    r . append ( ( char ) ( orda + rt [ i ] ) ) ;
    i = nextI . get (