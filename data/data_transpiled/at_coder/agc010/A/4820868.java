static final String input ( ) {
  final int count = 0 ;
  final List < Integer > aList = Lists . newArrayList ( ) ;
  for ( int a : aList ) {
    count += a % 2 ;
  }
  return count % 2 == 0 ? "YES" : "NO" ;
}
