@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  List < Integer > B = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
    B . add ( i ) ;
  }
  final int IMP = 100 ;
  final int [ ] [ ] dp = new int [ 51 ] [ 51 ] ;
  for ( int i = 0 ;
  i < 51 ;
  i ++ ) {
    dp [ i ] [ i ] = 0 ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      for ( int m = 1 ;
      m < 51 ;
      m ++ ) {
        if ( dp [ i % m ] [ j ] != IMP ) {
          dp [ i ] [ j ] = m ;
          break ;
        }
      }
    }
  }
  if ( Math . max ( dp [ x ] [ y ] , A [ y ] ) == IMP ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int cost = 0 ;
    int m = Math . max ( dp [ x ] [ y ] , A [ x ] ) ;
    final Set < Set < Integer >> AL = new HashSet < > ( ) ;
    for ( int a : A ) {
      AL . add ( new HashSet < > ( ) ) ;
    }
    /* Candmin of the list of numbers */
    m = Math . min ( dp [ x ] [ y ] , A [ y ] ) ;
    al . remove ( a ) ;
    while ( m != 0 ) {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        final Set < Integer > al = AL . get ( i ) ;
        AL . add ( a % m ) ;
      }
      cost += 2 * m ;
      m = Math . max ( candmin ( al , B ) , A [ i ] ) ;
    }
    System . out . println ( cost ) ;
  }
  return new Iterable < Integer > ( ) {
    public Iterator < Integer > iterator ( ) {
      return AL . iterator ( ) ;
    }
  }
  ;
}
