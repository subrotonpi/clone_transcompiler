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
  Debug d = Debug . off ( ) ;
  String S = input ( ) ;
  d . dmp ( ( S ) , "S" ) ;
  int count = 0 ;
  boolean zeroFound = false ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case '0' : zeroFound = true ;
      break ;
    }
  }
  return count ;
}
