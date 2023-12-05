@ VisibleForTesting static LinkedHashMap < Pair < Integer , Integer > , Boolean > readCase ( final BufferedReader read ) throws IOException {
  Arrays . fill ( R , readIntLine ( read ) ) ;
  final PriorityQueue < Pair < Integer , Integer >> sq = new PriorityQueue < > ( ) ;
  for ( int x : xrange ( R ) ) {
    sq . add ( readIntLine ( read ) ) ;
  }
  return R ;
}
