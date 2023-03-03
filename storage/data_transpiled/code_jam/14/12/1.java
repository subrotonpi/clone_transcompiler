@ Sys public static void setRecursionLimit ( int i ) {
  setRecursionLimit ( 11111 ) ;
  class Tree {
    int cas = i ;
    List < Node > sons = new ArrayList < Node > ( ) ;
    Integer _size = null ;
    Integer _ans = null ;
    public Node ( int cas ) {
      if ( _size == null ) {
        _size = Integer . valueOf ( cas ) + 1 ;
      }
      return new Node ( cas ) ;
    }
    public int size ( ) {
      if ( _size == null ) {
        _size = Integer . valueOf ( cas ) + 1 ;
      }
      return _size ;
    }
    public int ans ( ) {
      if ( _ans == null ) {
        switch ( sons . size ( ) ) {
          case 0 : case 2 : _ans = Integer . valueOf ( cas ) ;
          break ;
          case 1 : _ans = sons . get ( 0 ) . size ( ) ;
          break ;
          default : {
            int size = Integer . valueOf ( cas ) ;
            TreeSet < Integer > anses = new TreeSet < Integer > ( ) ;
            for ( Node s : sons ) {
              anses . add ( s . size ( ) - s . ans ( ) ) ;
            }
            _ans = size - Integer . valueOf ( anses . size ( ) - 2 ) ;
          }
        }
        return _ans ;
      }
      return _ans ;
    }
    public String toString ( ) {
      return "{" + cas + ": " + sons + "}" ;
    }
    public Node toString ( ) {
      return new Node ( cas ) ;
    }
  }
  Node rootat ( int i ) {
    vis [ i ] = 1 ;
    Tree t = new Tree ( i ) ;
    for ( int j : adj [ i ] ) {
      if ( ! vis [ j ] ) {
        t . sons . add ( rootat ( j ) ) ;
      }
    }
    return t ;
  }
  int z = input . nextInt ( ) ;
  for ( int cas = xrange ( 1 , z + 1 ) ;
  cas ++ ) {
    System . out . println ( >> stderr + cas + " " + z ) ;
    int n = input . nextInt ( ) ;
    int [ ] adj = new int [ n ] ;
    for ( int j : xrange ( n ) ) {
      adj [ j ] = Integer . valueOf ( input . nextInt ( ) ) ;
      vis = new int [ n ] ;
      for ( int i : xrange ( n - 1 ) ) {
        int x = Integer . valueOf ( input . nextInt ( ) ) ;
        int y = Integer . valueOf ( input . nextInt