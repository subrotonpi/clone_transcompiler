@ Function public static void input ( ) {
  String s = list ( input ) ;
  int t = Integer . parseInt ( list ( input ) ) ;
  Counter c = new Counter ( s ) ;
  if ( t == 1 ) {
    System . out . println ( Math . abs ( c . U - c . D ) + Math . abs ( c . L - c . R ) + c . ? ) ;
  }
  else {
    int temp = Math . abs ( c . U - c . D ) + Math . abs ( c . L - c . R ) ;
    if ( temp >= c . ? ) {
      System . out . println ( temp - c . ? ) ;
    }
    else {
      System . out . println ( Math . abs ( temp - c . ? ) % 2 ) ;
    }
  }
}
