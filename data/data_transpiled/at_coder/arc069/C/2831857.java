@ MoreRequires public static int [ ] sortByKeyAndSize ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ( ) . substring ( i , i + 1 ) ) ) ;
  }
  return a . toArray ( new int [ a . size ( ) ] ) ;
}
