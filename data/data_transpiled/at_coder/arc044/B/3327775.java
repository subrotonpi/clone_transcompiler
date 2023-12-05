public static int MOD = 1000000007 ;
{
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ai = Lists . newArrayList ( ) . stream ( ) . filter ( i -> i > 0 ) . toArray ( ) ;
  if ( ! sanityCheck ( ai ) ) {
    return 0 ;
  }
  int [ ] di = count ( ai ) ;
  return countAll ( di ) ;
}
