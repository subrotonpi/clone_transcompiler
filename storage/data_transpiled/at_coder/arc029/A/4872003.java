@ GwtIncompatible ( "java.util.BitSet" ) public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  int [ ] ts = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ts [ i ] = Integer . parseInt ( input ( args [ 1 ] ) ) ;
  int res = 1 << 30 ;
  for ( int [ ] us : permutations ( ts ) ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) res = Math . min ( res , Math . max ( Arrays . copyOfRange ( us , 0 , i ) , Arrays . copyOfRange ( us , i , i ) ) ) ;
  }
  System . out . println ( res ) ;
}
