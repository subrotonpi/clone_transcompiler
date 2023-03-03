@ VisibleForTesting static Iterable < String > inpl ( ) {
  final List < String > input = Lists . newArrayList ( ) ;
  final int N = Integer . parseInt ( input . get ( ) ) ;
  final String C = input . get ( ) ;
  int ans = 2000 ;
  for ( String X : input ) {
    final String L = "" . join ( X . substring ( 0 , 2 ) ) ;
    final String R = "" . join ( X . substring ( 2 ) ) ;
    ans = Math . min ( ans , C . replace ( L , "L" ) . replace ( R , "R" ) . length ( ) ) ;
  }
  System . out . println ( ans ) ;
  return input ;
}
