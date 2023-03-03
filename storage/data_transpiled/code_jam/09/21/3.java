static final String s = "([^ ]*\\.)*" ;
final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
final char [ ] text = new char [ 20 ] ;
int pos = 0 ;
class Tree {
  int w ;
  public Tree ( int w ) {
    this . l = null ;
    this . r = null ;
    this . w = w ;
    this . s = null ;
  }
  public double eval ( String features ) {
    if ( this . s == null ) {
      return this . w ;
    }
    else {
      if ( features . contains ( "." ) ) {
        return this . w * this . l . eval ( features ) ;
      }
      else {
        return this . w * this . r . eval ( features ) ;
      }
    }
  }
  public Tree parse ( ) {
    assert text [ pos ] == '(' ;
    pos ++ ;
    String s = "" ;
    while ( text [ pos ] == '.' || ( ( char ) '0' <= text [ pos ] && text [ pos ] <= '9' ) ) {
      s += text [ pos ] ;
      pos ++ ;
    }
    Tree tree = new Tree ( Double . parseDouble ( s ) ) ;
    s = "" ;
    while ( text [ pos ] != ')' && text [ pos ] != '(' ) {
      s += text [ pos ] ;
      pos ++ ;
    }
    if ( s . isEmpty ( ) ) {
      assert text [ pos ] == ')' ;
      pos ++ ;
      return tree ;
    }
    else {
      tree . s = s ;
      tree . l = parse ( ) ;
      tree . r = parse ( ) ;
      assert text [ pos ] == ')' ;
      pos ++ ;
      return tree ;
    }
  }
  public void main ( String [ ] args ) {
    int T = Integer . parseInt ( stdin . readLine ( ) ) ;
    for ( int cs = 1 ;
    cs <= T ;
    cs ++ ) {
      System . out . println ( "Case #" + cs + ":" ) ;
      int L = Integer . parseInt ( stdin . readLine ( ) ) ;
      StringBuilder sb = new StringBuilder ( ) ;
      pos = 0 ;
      for ( int each = 0 ;
      each < L ;
      each ++ ) {
        sb . append ( ' ' ) ;
      }
      sb . setLength ( 0 ) ;
      sb . append ( text ) ;
      sb . append ( '$' ) ;
      Tree tree = parse ( ) ;
      int M = Integer . parseInt ( stdin . readLine ( ) ) ;
      for ( int each = 0 ;
      each < M ;
      