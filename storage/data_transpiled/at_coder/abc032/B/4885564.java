static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
}
public List < Integer > getIntList ( ) {
  return getIntList ( ) ;
}
public int [ ] zeros ( int n ) {
  return new int [ n ] ;
}
final int INF = 10 * 18 ;
class Debug {
  public boolean debug ( ) {
    return true ;
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
  String S = input . nextLine ( ) ;
  int K = getInt ( ) ;
  d . dmp ( ( S ) , K , "S,K" ) ;
  Set < String > dic = new HashSet < String > ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    dic . add ( S . substring ( i , i + K ) ) ;
  }
  return dic . size ( ) ;
}
