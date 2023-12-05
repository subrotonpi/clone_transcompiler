public static final int inf = 1000000000 ;
class InnerNode implements Node {
  public InnerNode ( Node [ ] nodes , int index , boolean gate , boolean change ) {
    super ( nodes , index , gate , change ) ;
  }
  public Node produces ( ) {
    IntNode left = nodes [ index * 2 ] . produces ( ) ;
    IntNode right = nodes [ index * 2 + 1 ] . produces ( ) ;
    IntNode orProd = new IntNode ( left . x + right . x , Math . min ( left . y , right . y ) ) ;
    IntNode andProd = new IntNode ( Math . min ( left . x , right . x ) , left . y + right . y ) ;
    IntNode norm , alt ;
    if ( gate ) {
      norm = andProd ;
      alt = orProd ;
    }
    else {
      norm = orProd ;
      alt = andProd ;
    }
    if ( change ) {
      return new IntNode ( Math . min ( norm . x , alt . x + 1 ) , Math . min ( norm . y , alt . y + 1 ) ) ;
    }
    else {
      return norm ;
    }
  }
  public LeafNode ( int value ) {
    return value ;
  }
  public int produces ( ) {
    return ( value > 0 ? inf : 0 ) ;
  }
  public int solve ( ) {
    int M = Integer . parseInt ( readLine ( ) ) ;
    int V = Integer . parseInt ( readLine ( ) ) ;
    InnerNode [ ] nodes = new InnerNode [ M + 1 ] ;
    for ( int i = 0 ;
    i <= ( M - 1 ) / 2 ;
    i ++ ) {
      IntNode G = Integer . parseInt ( readLine ( ) ) ;
      int C = Integer . parseInt ( readLine ( ) ) ;
      nodes [ i + 1 ] = new InnerNode ( nodes , i + 1 , G , Boolean . valueOf ( C ) ) ;
    }
    for ( int i = 0 ;
    i <= ( M + 1 ) / 2 ;
    i ++ ) {
      nodes [ ( M - 1 ) / 2 + i + 1 ] = new LeafNode ( Integer . parseInt ( readLine ( ) ) ) ;
    }
    int minChange = nodes [ 1 ] . produces ( ) [ V ] ;
    return minChange >= inf ? InnerNode . IMPOSSIBLE : minChange ;
  }
}
