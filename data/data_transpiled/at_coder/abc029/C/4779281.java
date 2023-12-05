@ VisibleForTesting static Iterable < String > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( String p : combinations ( new String [ ] {
    "a" , "b" , "c" }
    , N ) ) {
      System . out . println ( Joiner . on ( "" ) . join ( p ) ) ;
    }
    return ImmutableList . of ( ) ;
  }
  