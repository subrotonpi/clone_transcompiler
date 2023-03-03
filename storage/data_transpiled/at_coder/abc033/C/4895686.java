static int getInt ( ) {
  return Integer . parseInt ( input ( ) ) ;
}
public List < Integer > getIntList ( ) {
  return Arrays . asList ( input . split ( " " ) ) ;
}
public int [ ] zeros ( int n ) {
  return new int [ n ] ;
}
final int INF = 10 * 18 ;
class Debug {
  public Debug ( ) {
  }
  public void off ( ) {
  }
  public String dmp ( int x , String cmt ) {
    if ( debug ) {
      String w ;
      w = cmt + ": " + x ;
    }
    else {
      w = Integer . toString ( x ) ;
    }
    System . out . println ( w ) ;
  }
}
public int prob ( ) {
  Debug d = new Debug ( ) ;
  d . off ( ) ;
  String [ ] S = input ( ) . split ( "\\+" ) ;
  d . dmp ( ( S ) , "S" ) ;
  int count = 0 ;
  for ( String term : S ) {
    if ( ! "0" . equals ( term ) ) count ++ ;
  }
  return count ;
}
