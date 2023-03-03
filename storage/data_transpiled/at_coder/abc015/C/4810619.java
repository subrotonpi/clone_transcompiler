static final int [ ] [ ] getSortedList ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] sInpl = new int [ N ] [ ] ;
  final int [ ] [ ] inpl = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inpl [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final double INF = Double . POSITIVE_INFINITY ;
  final int N = sInpl [ N ] [ ] ;
  final int K = sInpl [ K ] [ ] ;
  final int [ ] [ ] T = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int [ ] row = inpl [ i ] ;
    T [ i ] = row ;
  }
  boolean flag = true ;
  for ( int [ ] row : Arrays . copyOf ( T , T . length ) ) {
    int [ ] tmp = null ;
    for ( int i = 0 ;
    i < row . length ;
    i ++ ) {
      if ( tmp == null ) {
        tmp = row [ i ] ;
      }
      else {
        tmp = tmp ^ row [ i ] ;
      }
    }
    if ( tmp == 0 ) {
      flag = false ;
      break ;
    }
  }
  if ( flag ) {
    System . out . println ( "Nothing" ) ;
  }
  else {
    System . out . println ( "Found" ) ;
  }
  return null ;
}
