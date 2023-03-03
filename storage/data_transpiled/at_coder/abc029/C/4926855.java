@ VisibleForTesting static Iterable < String > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] chars = {
    'a' , 'b' , 'c' }
    ;
    for ( char [ ] line : chars ) {
      System . out . println ( Arrays . toString ( line ) ) ;
    }
    return ImmutableList . of ( ) ;
  }
  