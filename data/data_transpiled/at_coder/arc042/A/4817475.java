public static Node < Integer > create ( ) {
  Node < Integer > node ;
  {
    this . value = value ;
    prev = prev ;
    next = next ;
  }
  class Threads {
    int count ;
    Node < Integer > [ ] nodes ;
    {
      int n ;
      int m ;
      Node < Integer > [ ] nodes ;
      {
        this . nodes = new Node [ count + 2 ] ;
        for ( int i = 0 ;
        i < count + 2 ;
        i ++ ) {
          nodes [ i ] = new Node < > ( i , null , null ) ;
        }
        for ( int i = 0 ;
        i < count + 1 ;
        i ++ ) {
          nodes [ i ] . next = nodes [ i + 1 ] ;
          nodes [ i + 1 ] . prev = nodes [ i ] ;
        }
      }
    }
    void moveFirst ( int i ) {
      nodes [ i ] . prev . next = nodes [ i ] . next ;
      nodes [ i ] . next . prev = nodes [ i ] . prev ;
    }
  }
  {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    Threads threads = new Threads ( n ) ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      threads . moveFirst ( a ) ;
    }
    node = threads . nodes [ 0 ] . next ;
    while ( node != threads . nodes [ threads . nodes . length - 1 ] ) {
      System . out . println ( node . value ) ;
      node = node . next ;
    }
  }
}
