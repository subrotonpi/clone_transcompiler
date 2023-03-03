@ GwtIncompatible ( "java.util.BitSet" ) public static int [ ] solve ( final int n ) {
  class Bit {
    int [ ] tree = new int [ n + 1 ] ;
    int i ;
    int s ;
    int i ;
    int s ;
    int i ;
    int x ;
    int y ;
    int i ;
    int n ;
    int center ;
    int bubbles [ ] = new int [ n + 1 ] ;
    {
      this . size = n ;
      this . tree = new int [ n + 1 ] ;
    }
    @ Override public int sum ( int i ) {
      s = 0 ;
      while ( i > 0 ) {
        s += tree [ i ] ;
        i -= i & - i ;
      }
      return s ;
    }
    @ Override public void add ( int i , int x ) {
      while ( i <= size ) {
        tree [ i ] += x ;
        i += i & - i ;
      }
    }
  }
  return solve ( input ( ) ) ;
}
