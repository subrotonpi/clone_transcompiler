public static void main ( ) {
  Node parent = null ;
  Set < Node > children = new HashSet < Node > ( ) ;
  Node count = null ;
  {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    LinkedList < Node > hn = new LinkedList < Node > ( ) ;
    List < Edge > ab = new ArrayList < Edge > ( ) ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      ab . add ( new Edge ( a - 1 , b - 1 ) ) ;
    }
    List < Node > nodes = new ArrayList < Node > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) nodes . add ( new Node ( ) ) ;
    DFSTNode . makeTree ( x - 1 , null , n , ab , nodes ) ;
    DFSTNode . dfsCount ( x - 1 , nodes , hn ) ;
    System . out . println ( Math . max ( 0 , ( countAlwaysBranches ( nodes ) - 1 ) ) * 2 ) ;
  }
  private void DFSTNode ( int myId , int parentId , int n , List < Edge > ab , List < Node > nodes ) {
    assert myId != parentId ;
    Node node = nodes . get ( myId ) ;
    node . parent = parentId ;
    Set < Integer > adjs = new HashSet < Integer > ( ) ;
    for ( Edge edge : ab ) {
      if ( myId == edge . first ) adjs . add ( edge . second ) ;
      else if ( myId == edge . second ) adjs . add ( edge . first ) ;
    }
    adjs . removeAll ( new HashSet < Integer > ( parentId ) ) ;
    node . children = adjs ;
    for ( Node c : node . children ) {
      DFSTNode . dfsCount ( c , myId , n , ab , nodes ) ;
    }
  }
  private int dfsCount ( int myId , Set < Node > nodes , LinkedList < Node > hn ) {
    Node node = nodes . get ( myId ) ;
    node . count = hn . get ( myId ) ;
    for ( Node c : node . children ) node . count += dfsCount ( c , nodes , hn ) ;
    return node . count ;
  }
  private int countAlwaysBranches ( Set < Node > nodes ) {
    int cnt