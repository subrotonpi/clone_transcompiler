public static Node read ( ) {
  double p = 0.0 ;
  String feature = "" ;
  Node yes = null ;
  Node no = null ;
  int i ;
  Node root = new Node ( ) {
    public Node read ( String el , int idx ) {
      p = Double . parseDouble ( el . substring ( idx , idx + 1 ) ) ;
      idx = idx + 1 ;
      if ( el . length ( ) == idx ) return idx ;
      if ( ( el . substring ( idx , idx + 1 ) . charAt ( 0 ) <= '9' ) && ( el . substring ( idx , idx + 1 ) . charAt ( 0 ) >= '0' ) ) return idx ;
      feature = el . substring ( idx , idx + 1 ) ;
      yes = new Node ( ) ;
      no = new Node ( ) ;
      idx = yes . read ( el , idx + 1 ) ;
      return no . read ( el , idx ) ;
    }
    public String toString ( ) {
      String s = "p:" + p + " " ;
      if ( yes != null ) {
        s = s + "feature: " + feature + "\n" ;
        s = s + yes . toString ( ) + "\n" + no . toString ( ) ;
      }
      return s ;
    }
    public double cute ( Animal a ) {
      if ( feature . equals ( "" ) ) return p ;
      if ( a . features . contains ( feature ) ) return p * yes . cute ( a ) ;
      else return p * no . cute ( a ) ;
    }
  }
  ;
  class Animal {
    String name = null ;
    List < String > features = new ArrayList < String > ( ) ;
    public Animal read ( ) {
      String [ ] li = new String [ 3 ] ;
      for ( int j = 0 ;
      j < a . length ;
      j ++ ) {
        String s = new String ( ) ;
        s . replace ( "(" , " " ) . replace ( ")" , " " ) . split ( " " ) ;
        el . addAll ( s . split ( " " ) ) ;
      }
      Node root = new Node ( ) ;
      root . read ( el , 0 ) ;
      int a = Integer . parseInt ( new String ( ) ) ;
      Animal aa = new Animal ( ) ;
      aa . read ( ) ;
      animals . add ( aa ) ;
      return root ;
    }
  }
  ;
  int t = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  for ( i = 0 ;
  i