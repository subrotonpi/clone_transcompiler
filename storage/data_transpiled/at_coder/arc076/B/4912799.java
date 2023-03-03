static final String print ( int N ) {
  System . setIn ( 10 * 9 ) ;
  Scanner input = new Scanner ( System . in ) ;
  class UnionFind {
    int [ ] parent = new int [ N ] ;
    int [ ] rank = new int [ N ] ;
    public UnionFind ( int size ) {
      int [ ] parent = new int [ size ] ;
      for ( int i = 0 ;
      i < size ;
      i ++ ) parent [ i ] = i ;
      int [ ] g = input . nextInt ( ) ;
      int [ ] w = input . nextInt ( ) ;
      if ( Un . same ( s , g ) ) continue ;
      else Un . union ( s , g ) ;
      ans += w ;
      return null ;
    }
    public int find ( int x ) {
      if ( parent [ x ] == x ) return x ;
      else return Un . union ( s , g ) ;
    }
    public void union ( int x , int y ) {
      int x = input . nextInt ( ) ;
      int y = input . nextInt ( ) ;
      if ( x == y ) return ;
      if ( rank [ x ] < rank [ y ] ) parent [ x ] = y ;
      else {
        parent [ y ] = x ;
        if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
      }
    }
    public boolean same ( int x , int y ) {
      return Un . same ( x , y ) ;
    }
    public Set < Integer > component ( ) {
      Set < Integer > comp = new HashSet < Integer > ( ) ;
      for ( int i = 0 ;
      i < parent . length ;
      i ++ ) {
        int p = Un . component ( parent [ i ] ) ;
        comp . add ( p ) ;
      }
      return comp ;
    }
    public int getComponentNum ( ) {
      return component . size ( ) ;
    }
    public String toString ( ) {
      StringBuilder ret = new StringBuilder ( "parents\n" ) ;
      ret . append ( Arrays . toString ( parent ) ) ;
      ret . append ( '\n' ) ;
      ret . append ( Arrays . toString ( rank ) ) ;
      return ret . toString ( ) ;
    }
  }
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  X = new int [ N ] ;
  Y = new int [ N ] ;
  UnionFind cand = new UnionFind ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer .