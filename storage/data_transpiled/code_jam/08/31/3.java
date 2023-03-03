static String getCount ( int P , int K , List < Integer > L_lst ) throws IOException {
  Collections . sort ( L_lst , Collections . reverseOrder ( 1 ) ) ;
  List < Integer > keysList = new ArrayList < > ( ) ;
  for ( int x = 1 ;
  x <= P ;
  x ++ ) {
    keysList . add ( x ) ;
  }
  if ( L_lst . size ( ) > keysList . size ( ) ) {
    return "Impossible" ;
  }
  keysList . clear ( ) ;
  keysList . addAll ( Arrays . asList ( L ) ) ;
  return getCount ( keysList , K , L_lst ) ;
}
List < String > lines = Files . readAllLines ( Paths . get ( System . getProperty ( "line.separator" ) ) ) ;
int probCount = Integer . parseInt ( lines . get ( 0 ) ) ;
lines = lines . subList ( 1 , lines . size ( ) ) ;
assert ( lines . size ( ) == 2 * probCount ) ;
List < List < Integer >> params = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < lines . size ( ) ;
i += 2 ) {
  int P = Integer . parseInt ( lines . get ( i ) ) ;
  int K = Integer . parseInt ( lines . get ( i + 1 ) ) ;
  int L = Integer . parseInt ( lines . get ( i + 2 ) ) ;
  List < Integer > L_lst = Arrays . asList ( L ) ;
  assert ( L_lst . size ( ) == L ) ;
  params . add ( Arrays . asList ( P , K , L_lst ) ) ;
}
for ( int i = 0 ;
i < params . size ( ) ;
i ++ ) {
  final int P = params . get ( i ) . get ( 0 ) ;
  final int K = params . get ( i + 1 ) . get ( 1 ) ;
  final int L = params . get ( i + 2 ) . get ( 2 ) ;
  assert ( L == L ) ;
  params . add ( Arrays . asList ( L ) ) ;
}
for ( int i = 0 ;
i < params . size ( ) ;
i ++ ) {
  System . out . println ( "Case #" + ( i + 1 ) + ": " + getCount ( P , K , L_lst ) ) ;
}
return "" ;
}
