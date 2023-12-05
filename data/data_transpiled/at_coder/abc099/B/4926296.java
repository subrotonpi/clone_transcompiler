@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  List < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 1000 ;
  i ++ ) {
    a . add ( i ) ;
  }
  a = Collections . unmodifiableList ( a ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  return a . subList ( B - A , B ) ;
}
