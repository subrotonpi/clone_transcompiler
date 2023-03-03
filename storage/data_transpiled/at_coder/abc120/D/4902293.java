static final class uf {
  int n , m , n ;
  int [ ] table = new int [ n + 1 ] ;
  int [ ] size = new int [ n + 1 ] ;
  n = n ;
  def __init__ ( n ) {
    table [ r1 ] = - 1 ;
    size [ r2 ] += size [ r1 ] ;
    size [ r1 ] = 0 ;
  }
  def find_root ( k ) {
    int [ ] path = new int [ n + 1 ] ;
    int curr = k ;
    while ( table [ curr ] != - 1 ) {
      path [ curr ] = curr ;
      curr = table [ curr ] ;
    }
    defrag ( curr , path ) ;
    return curr < 0 ? - 1 : path [ curr ] ;
  }
  def defrag ( r , p ) {
    for ( int i = 0 ;
    i < p ;
    i ++ ) {
      table [ p [ i ] ] = r ;
    }
  }
  def solve ( String string ) {
    n = Integer . parseInt ( string ) ;
    m = Integer . parseInt ( string ) ;
    int [ ] ab = new int [ n ] ;
    Arrays . sort ( ab ) ;
    int ans [ ] = new int [ n * ( n - 1 ) / 2 ] ;
    uf table = new uf ( n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int _b = ab [ i ] ;
      int _a = ab [ i + 1 ] ;
      int r_a = table . find_root ( _a ) ;
      int r_b = table . find_root ( _b ) ;
      if ( r_a == r_b ) {
        ans [ i ] = ans [ i ] ;
        continue ;
      }
      ans [ i ] = ans [ i ] - table . size [ r_a ] * table . size [ r_b ] ;
      table . merge ( r_a , r_b ) ;
    }
    return Arrays . copyOf ( ans , ans . length ) ;
  }
  if ( __name__ . equals ( "__main__" ) ) {
    n = Integer . parseInt ( input ( ) ) ;
    m = Integer . parseInt ( input ( ) ) ;
    System . out . println ( solve ( n + " " + m + "\n" ) + "\n" ) ;
  }
  else {
    return solve ( n ) ;
  }
}
