public static final Iterable < ImmutablePair < Integer , Integer >> reader ( final InputFile inFile ) {
  return ImmutableList . copyOf ( inFile . getInts ( ) ) ;
}
