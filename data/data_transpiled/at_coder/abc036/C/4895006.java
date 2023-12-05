public static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
}
public List < Integer > getIntList ( ) {
  return getIntList ( ) ;
}
public int [ ] zeros ( int n ) {
  return new int [ n ] ;
}
public int [ ] zeros ( int n ) {
  return new int [ n ] ;
}
public boolean isDebug ( ) {
  return true ;
}
public boolean off ( ) {
  return false ;
}
public String dmp ( int x , String cmt ) {
  if ( isDebug ) {
    String w ;
    w = cmt + ": " + x ;
  }
  else {
    w = Integer . toString ( x ) ;
  }
  System . out . println ( w ) ;
}
public void prob ( ) {
  Debug d = Debug . off ( ) ;
  d . off ( ) ;
  int N = getInt ( ) ;
  d . dmp ( ) ;
}
}
