@ VisibleForTesting static Iterable < String > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String cs = input . nextLine ( ) ;
  List < String > ss = Lists . newArrayList ( ) ;
  for ( String L : ss ) {
    String R = cs . replace ( L , "L" ) . replace ( R , "R" ) ;
    ans = Math . min ( ans , c2s . length ( ) ) ;
  }
  return ss ;
}
