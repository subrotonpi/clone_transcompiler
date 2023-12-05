public static Node < Float > create ( float p , float f , float l , float r ) {
  Node < Float > a = new Node < Float > ( p , f , l , r ) {
    public float check ( float fs , float p ) {
      p *= fs ;
      if ( fs >= 0 ) return l . check ( fs , p ) ;
      else return r . check ( fs , p ) ;
    }
  }
  ;
  class Leaf {
    public float check ( float fs , float p ) {
      p *= fs ;
      if ( fs >= 0 ) return l . check ( fs , p ) ;
      else return r . check ( fs , p ) ;
    }
  }
  {
    public float check ( float _ , float p ) {
      return p * p ;
    }
  }
  {
    public Node < Float > build ( String [ ] a , int s , int e ) {
      if ( a [ s ] . contains ( " " ) ) {
        Node < Float > left = build ( a , s + 1 , e ) ;
        int ln = build ( a , s + 1 , e ) ;
        Node < Float > right = build ( a , s + 1 + ln , e ) ;
        float rn = build ( a , s + 1 + ln , e ) ;
        String p = a [ s ] . trim ( ) ;
        float f = Float . parseFloat ( p ) ;
        return new Node < Float > ( p , f , left , right ) {
        }
        ;
      }
      else {
        return new Leaf < Float > ( Float . parseFloat ( a [ s ] ) , 1 ) ;
      }
    }
    public Float parse ( String s ) {
      List < String > a = Arrays . asList ( s . replace ( ")" , "" ) . split ( "\\(" ) ) ;
      return build ( a , 0 , a . size ( ) ) . get ( 0 ) ;
    }
  }
  if ( __name__ . equals ( "java.util.Scanner" ) ) {
    int loopN = Integer . parseInt ( scanner . nextLine ( ) ) ;
    for ( int i : xrange ( loopN ) ) {
      System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
      int ln = Integer . parseInt ( scanner . nextLine ( ) ) ;
      StringBuffer sb = new StringBuffer ( ) ;
      for ( int j : xrange ( ln ) ) {
        sb . append ( scanner . nextLine ( ) ) ;
      }
      Node < Float > howcute = parse ( sb . toString ( ) ) ;
      int an =