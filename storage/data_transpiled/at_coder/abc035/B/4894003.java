static final int getInt ( ) {
  return Integer . parseInt ( input ( ) ) ;
}
public List < Integer > getIntList ( ) {
  return Arrays . asList ( input . split ( " " ) ) ;
}
public int [ ] zeros ( int n ) {
  return new int [ n ] ;
}
public int [ ] zeros2 ( int n , int m ) {
  return new int [ n ] ;
}
public int [ ] zeros2 ( int n , int m ) {
  return new int [ m ] ;
}
public static void off ( ) {
}
public static void dmp ( int x , String cmt ) {
  if ( debug ) {
    String w ;
    if ( cmt != null ) {
      w = cmt + ": " + x ;
    }
    else {
      w = Integer . toString ( x ) ;
    }
    System . out . println ( w ) ;
  }
}
public static int prob ( ) {
  Debug d = new Debug ( ) ;
  d . off ( ) ;
  String S = input ( ) ;
  d . dmp ( ( S ) , 'S' ) ;
  int T = getInt ( ) ;
  d . dmp ( ( T ) , 'T' ) ;
  int x = 0 , y = 0 , q = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case 'R' : x ++ ;
      break ;
      case 'L' : x -- ;
      break ;
      case 'U' : y ++ ;
      break ;
      case 'D' : y -- ;
      break ;
      default : q ++ ;
    }
  }
  int val = Math . abs ( x ) + Math . abs ( y ) ;
  if ( T == 1 ) val += q ;
  else {
    if ( val >= q ) val -= q ;
    else val = ( q - val ) % 2 ;
  }
  return val ;
}
