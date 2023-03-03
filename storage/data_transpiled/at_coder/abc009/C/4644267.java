@ GwtIncompatible ( "java.util.BitSet" ) public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  int k = Integer . parseInt ( input ( args [ 1 ] ) ) ;
  BitSet s = new BitSet ( n ) ;
  System . out . println ( Arrays . toString ( smallest ( k , s , s ) ) ) ;
}
