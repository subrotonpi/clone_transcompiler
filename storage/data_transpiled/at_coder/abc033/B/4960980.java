public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] s = new String [ n ] ;
  int [ ] p = new int [ n ] ;
  int sum = 0 ;
  String newName = "atcoder" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String name = input . substring ( 0 , i ) ;
    String population = input . substring ( i + 1 ) ;
    s [ i ] = name ;
    p [ i ] = Integer . parseInt ( population ) ;
    sum += Integer . parseInt ( population ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( p [ i ] > sum / 2 ) {
      newName = s [ i ] ;
    }
  }
  System . out . println ( newName ) ;
}
