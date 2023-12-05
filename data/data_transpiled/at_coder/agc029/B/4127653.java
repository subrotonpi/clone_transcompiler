static final int [ ] getUpperCaseValues ( ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  Collections . sort ( A , Collections . reverseOrder ( ) ) ;
  final Counter < Integer > cnter = new ClassicCounter < > ( A ) ;
  int ans = 0 ;
  for ( int a : A ) {
    final int inv = 2 * ( ( int ) Math . log2 ( a ) ) + 1 ;
    if ( cnter . getCount ( a ) == 0 ) {
      continue ;
    }
    if ( inv == 2 * a && cnter . getCount ( inv - a ) <= 1 ) {
      continue ;
    }
    if ( cnter . getCount ( inv - a ) > 0 ) {
      cnter . setCount ( inv - a , cnter . getCount ( inv - a ) - 1 ) ;
      cnter . setCount ( a , cnter . getCount ( a ) - 1 ) ;
      ans = ans + 1 ;
    }
  }
  System . out . println ( ans ) ;
  return null ;
}
