static final public Tree < String > parse ( String value , String feature , Tree < String > left , Tree < String > right ) {
  class Tree < String > {
    private final double value ;
    private String feature ;
    private Tree < String > left ;
    private Tree < String > right ;
    {
      this . value = Double . parseDouble ( value ) ;
      this . feature = feature ;
      this . left = left ;
      this . right = right ;
    }
    @ Override public String toString ( ) {
      return "(" ;
    }
    @ Override public String toString ( ) {
      return tree ;
    }
    @ Override public String toString ( ) {
      return tree ;
    }
    @ Override public String toString ( ) {
      return tree ;
    }
    @ Override public String toString ( ) {
      return tree ;
    }
    @ Override public String toString ( ) {
      return tree ;
    }
    @ Override public String toString ( ) {
      return tree ;
    }
    @ Override public String toString ( ) {
      return tree ;
    }
    @ Override public String eval ( Tree < String > animal ) {
      double p = this . value ;
      if ( animal . contains ( feature ) ) {
        p *= this . left . eval ( animal ) ;
      }
      else if ( animal . contains ( feature ) ) {
        p *= this . right . eval ( animal ) ;
      }
      return p ;
    }
  }
  private Tree < String > eval ( Tree < String > tree ) {
    Matcher matcher = Pattern . compile ( "\\(([\d\\.]+)([a-z]*)(.*)" ) ;
    String value = matcher . group ( 1 ) ;
    String feature = matcher . group ( 2 ) ;
    String remaining = matcher . group ( 3 ) ;
    if ( feature == null ) {
      remaining = remaining . substring ( 1 ) ;
      return new Tree < String > ( value ) ;
    }
    Tree < String > t = new Tree < String > ( value , feature ) ;
    t . left = parseTree ( remaining ) ;
    t . right = parseTree ( remaining ) ;
    return t ;
  }
  public static void main ( String [ ] args ) {
    int N = Integer . parseInt ( args [ 0 ] ) ;
    for ( int t = 1 ;
    t <= N ;
    t ++ ) {
      System . out . println ( "Case #" + t + ":" ) ;
      int L = Integer . parseInt ( args [ 1 ] ) ;
      String tree = "" ;
      for ( int i = 0 ;
      i < L ;
      i ++ ) {
        tree += input ;
      }
      tree = tree . replaceAll ( "