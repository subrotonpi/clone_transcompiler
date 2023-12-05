static public void tokens ( String treelines [ ] ) throws Exception {
  StringBuilder sb = new StringBuilder ( ) ;
  for ( String line : treelines ) {
    for ( StringTokenizer t = new StringTokenizer ( line ) ;
    t . hasMoreTokens ( ) ;
    ) {
      if ( t . nextToken ( ) . equals ( "(" ) ) {
        sb . append ( '(' ) ;
        t . nextToken ( ) ;
      }
      if ( t . hasMoreTokens ( ) ) continue ;
      if ( t . hasMoreTokens ( ) ) {
        String tt = t . nextToken ( ) ;
        if ( tt . length ( ) > 0 ) {
          sb . append ( tt ) ;
        }
        sb . append ( ')' ) ;
      }
      else {
        sb . append ( t ) ;
      }
    }
  }
  return ;
  class Node {
    public Node ( float p , String feature , Node left , Node right ) {
      this . p = p ;
      this . feature = feature ;
      this . left = left ;
      this . right = right ;
      return ;
    }
    @ SuppressWarnings ( "unused" ) Node def ( Token < ? > p , String feature , Node left , Node right ) {
      int b = t . nextToken ( ) ;
      assert b == '(' ;
      float p = Float . parseFloat ( t . nextToken ( ) ) ;
      int n = t . nextToken ( ) ;
      String n ;
      if ( n == ')' ) {
        String feature = null ;
        Node left = null ;
        Node right = null ;
        if ( feature . length ( ) > 0 ) {
          feature = n ;
          left = from ( t ) ;
          right = from ( t ) ;
          b = t . nextToken ( ) ;
          assert b == ')' ;
        }
        Node node = new Node ( p , feature , left , right ) ;
        return node ;
      }
    }
    public Node find ( Set < String > features ) {
      if ( features == null ) {
        return p ;
      }
      int pp ;
      if ( features . contains ( feature ) ) {
        pp = left . indexOf ( features ) ;
      }
      else {
        pp = right . indexOf ( features ) ;
      }
      return p * pp ;
    }
  }
  public static void doCase ( BufferedReader br ) throws Exception {
    int n = Integer . parseInt ( br . readLine ( ) ) ;
    String [ ] lines = new String [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      lines [ i ] = br . readLine ( ) . split ( " " ) ;
      Set < String > features = new HashSet < String > ( ) ;
      features . add (