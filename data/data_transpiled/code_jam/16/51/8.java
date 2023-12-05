static final int N = 10 ;
class Stack implements Stack {
  private final int N = 10 ;
  public final char [ ] a = new char [ N ] ;
  private final int n = 0 ;
  public final char [ ] push ( char x ) {
    a [ n ] = x ;
    n ++ ;
  }
  public final char [ ] top ( ) {
    return a [ n - 1 ] ;
  }
  public final char [ ] pop ( ) {
    n -- ;
    return a [ n ] ;
  }
  public final int T = Integer . parseInt ( String . valueOf ( System . in ) ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    String s = System . in . nextLine ( ) . trim ( ) ;
    int ret = 0 ;
    Stack st = new Stack ( s . length ( ) ) ;
    for ( int x : s . toCharArray ( ) ) {
      if ( st . n > 0 && st . top ( ) == x ) {
        ret += 10 ;
        st . pop ( ) ;
      }
      else st . push ( x ) ;
    }
    ret += 5 * st . n / 2 ;
    System . out . println ( "Case #" + t + ": " + ret ) ;
  }
}
