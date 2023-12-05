public static void solve ( int e , int r , int n , int [ ] v ) {
  int [ ] before = new int [ n ] ;
  int [ ] after = new int [ n ] ;
  int [ ] finish = new int [ n ] ;
  int gain = 0 ;
  List < Integer > vv = new ArrayList < Integer > ( Arrays . asList ( v ) ) ;
  Collections . sort ( vv , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      if ( o2 . compareTo ( o1 ) > 0 ) return 1 ;
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < vv . size ( ) ;
  i ++ ) {
    finish [ i ] = 1 ;
    int B = before [ i ] ;
    int A = after [ i ] ;
    gain += vv [ i ] * ( B - A ) ;
    int a = B ;
    for ( int ii : xrange ( i - 1 , - 1 , n ) ) {
      if ( finish [ ii ] ) break ;
      a -= r ;
      if ( a < 0 ) break ;
      after [ ii ] = a ;
    }
    int b = A ;
    for ( int ii : xrange ( i + 1 , n ) ) {
      if ( finish [ ii ] ) break ;
      b += r ;
      if ( b > e ) break ;
      before [ ii ] = b ;
    }
  }
  return ;
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    e = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    r = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] vs = ArrayUtil . toArray ( new int [ n ] ) ;
    System . out . println ( "Case #" + i + ": " + solve ( e , r , n , vs ) ) ;
  }
}
