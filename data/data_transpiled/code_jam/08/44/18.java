public static String inputFileName = "D-small-attempt0.in" ;
String outputFileName = "D-small-attempt0.out" ;
boolean Debug = false ;
class Permutation {
  private final ArrayList < String > justalist ;
  private final ArrayList < String > sofar ;
  public Permutation ( ArrayList < String > justalist ) {
    this . data = justalist . toArray ( new String [ justalist . size ( ) ] ) ;
    this . sofar = new ArrayList < String > ( ) ;
  }
  public Iterator < String > iterator ( ) {
    return justalist . iterator ( ) ;
  }
  public String next ( ) {
    return justalist . next ( ) ;
  }
  public void remove ( ) {
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String toString ( ) {
    return toString ( ) ;
  }
  public String permute ( String s , String p ) {
    String s2 = "" ;
    int i = 0 ;
    while ( i < s . length ( ) ) {
      for ( int j = 0 ;
      j < p . length ( ) ;
      j ++ ) {
        s2 += s . charAt ( i + j ) ;
      }
      i += p . length ( ) ;
      return s2 ;
    }
    public int runLength ( String s , String p ) {
      String s2 = permute ( s , p ) ;
      int length = 0 ;
      char last = 'A' ;
      for ( char c : s2 . toCharArray ( ) ) {
        if ( c != last ) length ++ ;
        last = c ;
      }
      return length ;
    }
    public int solve ( String s , int k ) {
      List < Integer > l = new ArrayList < Integer > ( ) ;
      for ( int j = 0 ;
      j < k ;
      j ++ ) {
        l . add ( runLength ( s , p ) ) ;
      }
      return Math