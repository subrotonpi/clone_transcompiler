static final String solve ( List < List < Integer >> rows ) {
  final Counter < Integer > cnt = new ClassicCounter < Integer > ( ) ;
  for ( List < Integer > i : rows ) {
    cnt . incrementCount ( i ) ;
  }
  List < String > rst = new ArrayList < String > ( ) ;
  for ( Map . Entry < Integer , Integer > e : cnt . entrySet ( ) ) {
    if ( e . getValue ( ) % 2 != 0 ) {
      rst . add ( e . getKey ( ) ) ;
    }
  }
  return String . join ( " " , rst ) ;
}
