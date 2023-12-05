static final String parse ( String expr ) {
  class Tree {
    private final double m ;
    public String cond ;
    public Tree ( double m ) {
      this . m = m ;
      this . cond = "" ;
      this . left = null ;
      this . right = null ;
    }
    public String toString ( ) {
      if ( this . cond != null ) return "<" + m + ", [" + cond + "], " + String . valueOf ( m ) + ", " + String . valueOf ( m ) + ">" ;
      else return "<" + m + ">" ;
    }
  }
  public Tree ( String expr ) {
    String s = expr . trim ( ) . substring ( 1 , expr . length ( ) - 1 ) ;
    if ( s . indexOf ( '(' ) == - 1 ) return new Tree ( Double . parseDouble ( s ) ) ;
    int i = 0 ;
    while ( s . charAt ( i ) != '(' ) ++ i ;
    final double prob = s . substring ( 0 , i ) . doubleValue ( ) ;
    final String feature = s . substring ( i + 1 ) ;
    Tree t = new Tree ( Double . parseDouble ( prob ) ) ;
    t . cond = feature ;
    int c = 1 ;
    int j = i + 1 ;
    while ( c > 0 ) {
      if ( s . charAt ( j ) == '(' ) ++ c ;
      else if ( s . charAt ( j ) == ')' ) -- c ;
      ++ j ;
    }
    t . left = parse ( s . substring ( i , j ) ) ;
    i = j ;
    while ( s . charAt ( i ) != '(' ) ++ i ) ;
    c = 1 ;
    j = i + 1 ;
    while ( c > 0 ) {
      if ( s . charAt ( j ) == '(' ) ++ c ;
      else if ( s . charAt ( j ) == ')' ) -- c ;
      ++ j ;
    }
    t . right = parse ( s . substring ( i , j ) ) ;
    return t ;
  }
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int n = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int test : xrange ( n ) ) {
    int l = Integer . parseInt ( br . readLine ( ) ) ;
    String expr = "" ;
    for ( int i : xrange ( l ) ) expr += " " + br . readLine ( ) . trim ( ) + " " ;
    expr