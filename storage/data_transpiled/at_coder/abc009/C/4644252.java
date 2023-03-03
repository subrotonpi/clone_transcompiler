@ GwtIncompatible ( "java.util.BitSet" ) public static void main ( String [ ] args ) {
  final int n = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  final int k = Integer . parseInt ( input ( args [ 1 ] ) ) ;
  final BitSet s = new BitSet ( n ) ;
  System . out . println ( Arrays . toString ( smallest ( k , s , s ) ) ) ;
}
