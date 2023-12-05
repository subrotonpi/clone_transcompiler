static final String findsol ( String C1 , String C2 ) throws IOException {
  final Set < String > a = new HashSet < String > ( ) ;
  a . addAll ( Arrays . asList ( C1 ) ) ;
  a . addAll ( Arrays . asList ( C2 ) ) ;
  String b ;
  if ( a . size ( ) == 0 ) {
    b = "Volunteer cheated!" ;
  }
  if ( a . size ( ) == 1 ) {
    b = a . iterator ( ) . next ( ) . toString ( ) ;
  }
  if ( a . size ( ) > 1 ) {
    b = "Bad magician!" ;
  }
  return b ;
}
/* Convert numbers to integers */
final int [ ] a = new int [ a . size ( ) ] ;
int ii = 0 ;
for ( int jj = 0 ;
jj < a . length ;
jj ++ ) {
  if ( a [ jj ] . equals ( " " ) ) {
    if ( ( ii < a . length ) && ( a [ jj ] . equals ( "" ) ) ) {
      a [ jj ] = Integer . parseInt ( a [ jj ] ) ;
      ii = jj + 1 ;
    }
  }
}
