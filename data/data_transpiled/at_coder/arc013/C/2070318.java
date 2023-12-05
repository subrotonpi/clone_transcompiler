public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  ArrayList < Integer > res = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int X = Integer . parseInt ( input ) ;
    int Y = Integer . parseInt ( input ) ;
    int Z = Integer . parseInt ( input ) ;
    int LX = X - 1 ;
    int RX = 0 ;
    int LY = Y - 1 ;
    int RY = 0 ;
    int LZ = Z - 1 ;
    int RZ = 0 ;
    int M = Integer . parseInt ( input ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int x = Integer . parseInt ( input ) ;
      int y = Integer . parseInt ( input ) ;
      int z = Integer . parseInt ( input ) ;
      LX = Math . min ( LX , x ) ;
      RX = Math . max ( RX , x ) ;
      LY = Math . min ( LY , y ) ;
      RY = Math . max ( RY , y ) ;
      LZ = Math . min ( LZ , z ) ;
      RZ = Math . max ( RZ , z ) ;
    }
    res . add ( LX ) ;
    res . add ( LY ) ;
    res . add ( LZ ) ;
    res . add ( X ) ;
    res . add ( Y ) ;
    res . add ( X - 1 ) ;
    res . add ( Y - 1 ) ;
    res . add ( Y - 1 ) ;
    res . add ( Z - 1 ) ;
  }
  System . out . println ( ans > 0 ? "WIN" : "LOSE" ) ;
}
