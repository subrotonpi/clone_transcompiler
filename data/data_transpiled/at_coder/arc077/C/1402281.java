@ Function public static final LinkedHashMap < Integer , Integer > getBit ( ) {
  class Bit {
    private int size ;
    private int [ ] tree = new int [ n + 1 ] ;
    @ Override public int sum ( int i ) {
      int s = 0 ;
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
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] aa = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    aa [ i ] = i ;
  }
  TreeMap < Integer , Integer > counter = new TreeMap < > ( ) ;
  Bit bit = new Bit ( m + 1 ) ;
  int ans_1 = 0 ;
  for ( int a = 1 ;
  i < aa . length ;
  i ++ ) {
    int b = aa [ i ] ;
    counter . put ( b , a ) ;
    bit . add ( a + 1 , 1 ) ;
    bit . add ( b , - 1 ) ;
    if ( a > b ) {
      bit . add ( 1 , 1 ) ;
      ans_1 += b ;
    }
    else ans_1 += b - a ;
  }
  int ans_prev = ans_1 ;
  int ans_min = ans_1 ;
  for ( int x = 2 ;
  x <= m ;
  x ++ ) {
    int ans_x = ans_prev ;
    int px = x - 1 ;
    if ( counter . containsKey ( px ) ) ans_x += Integer . parseInt ( ( px - a ) % m - 1 ) ;
    ans_x -= bit . sum ( px ) ;
    ans_min = Math . min ( ans_min , ans_x ) ;
    ans_prev = ans_x ;
  }
  System . out . println ( ans_min ) ;
}
