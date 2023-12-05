static final class uf {
  int n ;
  int [ ] table = new int [ n + 1 ] ;
  int [ ] size = new int [ n + 1 ] ;
  int m ;
  public void init ( ) {
    n = Integer . parseInt ( input ( ) ) ;
    m = Integer . parseInt ( input ( ) ) ;
    System . out . println ( solve ( n + " " + m + "\n" ) ) ;
  }
  public void merge ( int r1 , int r2 ) {
    table [ r1 ] = r2 ;
    size [ r2 ] += size [ r1 ] ;
    size [ r1 ] = 0 ;
  }
  public int findRoot ( int k ) {
    int [ ] path = new int [ m ] ;
    int curr = k ;
    while ( table [ curr ] != - 1 ) {
      path [ curr ] = r ;
      curr = table [ curr ] ;
    }
    return curr ;
  }
  public void defrag ( int r , int [ ] p ) {
    for ( int i = 0 ;
    i < p . length ;
    i ++ ) {
      table [ p [ i ] ] = r ;
    }
  }
  public void defragAll ( ) {
    for ( int i = 0 ;
    i < table . length ;
    i ++ ) {
      if ( table [ i ] == - 1 ) continue ;
      defrag ( ( int ) table [ i ] ) ;
    }
  }
  public boolean inSameGroup ( int k1 , int k2 ) {
    int r1 = Integer . parseInt ( input ( ) ) ;
    int p1 = Integer . parseInt ( input ( ) ) ;
    int r2 = Integer . parseInt ( input ( ) ) ;
    int p2 = Integer . parseInt ( input ( ) ) ;
    if ( r1 == r2 ) {
      defrag ( r1 , p1 + p2 ) ;
    }
    else {
      defrag ( r1 , p1 ) ;
      defrag ( r2 , p2 ) ;
    }
    return r1 == r2 ;
  }
  public int culcomb ( int n ) {
    return n * ( n - 1 ) / 2 ;
  }
  public String solve ( String string ) {
    int n = Integer . parseInt ( string ) ;
    int m = Integer . parseInt ( input ( ) ) ;
    int [ ] ab = new int [ m ] ;
    Arrays . fill ( ab , 0 ) ;
    int ans = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ans [ i ] = culcomb ( n ) ;
    }
    uf ( n ) ;
  }
}
