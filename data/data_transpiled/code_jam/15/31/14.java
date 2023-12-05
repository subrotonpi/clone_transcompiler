public static void main ( String [ ] args ) {
  final int FILE_NAME_BASE = "A-large" ;
  final int NUM_PROCESSES = 0 ;
  final double MEM_LIMIT_GB = 1.5 ;
  final int RECURSION_LIMIT = 1000 ;
  {
    final int rows = ( int ) Integer . parseInt ( args [ 0 ] ) ;
    final int cols = ( int ) Integer . parseInt ( args [ 1 ] ) ;
    final int size = ( int ) Integer . parseInt ( args [ 2 ] ) ;
  }
  final double solve = ( rows , cols , size ) ;
  final double toHit = cols / size ;
  final int hitFlex = cols % size ;
  final double toSink = hitFlex == 0 ? size - 1 : size ;
  System . out . println ( rows * toHit + toSink ) ;
}
