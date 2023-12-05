@ VisibleForTesting static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a , b ;
  a = a - 1 ;
  b = b - 1 ;
  int m = Integer . parseInt ( input ) ;
  tree = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    tree . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int tmp1 = Integer . parseInt ( input ) ;
    int tmp2 = Integer . parseInt ( input ) ;
    tree . get ( tmp1 - 1 ) . add ( tmp2 - 1 ) ;
    tree . get ( tmp2 - 1 ) . add ( tmp1 - 1 ) ;
  }
  visited = new int [ n ] ;
  counted = new int [ n ] ;
  visited [ a ] = 1 ;
  counted [ a ] = 1 ;
  Queue < Integer > q = new LinkedList < > ( ) ;
  q . add ( a ) ;
  q . add ( tree . get ( a ) ) ;
  q . add ( "|" ) ;
  q . add ( "|" ) ;
  q . add ( "|" ) ;
  q . add ( "|" ) ;
  int count = 2 ;
  while ( q . size ( ) > 0 ) {
    int comeFrom = q . poll ( ) ;
    int goto = q . poll ( ) ;
    if ( comeFrom == "|" ) {
      count ++ ;
      q . add ( "|" ) ;
      q . add ( "|" ) ;
      if ( counted [ b ] >= 1 ) {
        System . out . println ( counted [ b ] % 1000000007 ) ;
        exit ( ) ;
      }
      continue ;
    }
    for ( int goto_ = 0 ;
    goto_ < goto ;
    goto_ ++ ) {
      if ( visited [ goto_ ] == 0 || visited [ goto_ ] == count ) {
        if ( visited [ goto_ ] == 0 ) {
          q . add ( goto_ ) ;
          q . add ( tree . get ( goto_ ) ) ;
        }
        counted [ goto_ ] += counted [ comeFrom ] ;
        visited [ goto_ ] = count ;
      }
    }
  }
}
