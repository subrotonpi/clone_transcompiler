static final int solve ( ) {
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int [ ] s = new int [ T ] ;
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final Comparator < Integer > cost = new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      Arrays . sort ( s ) ;
      int m = s [ s . length / 2 ] ;
      return Math . abs ( o1 - m ) ;
    }
  }
  ;
  final List < Pair < Integer , Integer >> partition = new ArrayList < Pair < Integer , Integer >> ( ) ;
  int i = 0 ;
  while ( i < s . length ) {
    int j = i + 1 ;
    while ( j < s . length && s [ i ] == s [ j ] ) {
      j ++ ;
    }
    partition . add ( new Pair < Integer , Integer > ( s [ i ] , j - i ) ) ;
    i = j ;
  }
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final List < String > ss = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      ss . add ( s [ i ] ) ;
    }
    int res = 0 ;
    for ( List < Pair < Integer , Integer >> items : partition ) {
      if ( Iterables . isEmpty ( items ) ) {
        System . out . println ( "Case #" + ( t + 1 ) + ": Fegla Won" ) ;
        break ;
      }
      if ( Iterables . size ( items ) != 1 ) {
        System . out . println ( "Case #" + ( t + 1 ) + ": Fegla Won" ) ;
        break ;
      }
      res += cost . compare ( Lists . newArrayList ( b ) ) ;
    }
    return res ;
  }
}
