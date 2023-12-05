private static final String FILE_NAME_BASE = "A-large" ;
final int NUM_PROCESSES = 0 ;
final double MEM_LIMIT_GB = 1.5 ;
final int RECURSION_LIMIT = 1000 ;
{
  final int start = ( in . readInt ( ) ) ;
  final int num = ( in . readInt ( ) ) ;
  final int [ ] motes = copyOf ( Integer . parseInt ( in . readLine ( ) ) ) ;
  assert motes . length == num ;
  return new String ( start ) . split ( " " ) [ 0 ] + " " + ( num - start ) ;
}
