public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int current = N ;
  String ans = "" ;
  while ( current != 0 ) {
    if ( current % 2 == 0 ) {
      ans = "0" + ans ;
    }
    else {
      ans = "1" + ans ;
      current -- ;
    }
    current /= - 2 ;
  }
  if ( ans . equals ( "" ) ) {
    ans = "0" ;
  }
  System . out . println ( ans ) ;
}
