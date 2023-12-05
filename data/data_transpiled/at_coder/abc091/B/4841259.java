public static int [ ] getBlue ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] inputBlue = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputBlue [ i ] = input . nextLine ( ) ;
  }
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] inputRed = new String [ M ] ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) {
    inputRed [ j ] = input . nextLine ( ) ;
  }
  HashMap < String , Integer > mapBlue = new HashMap < String , Integer > ( ) ;
  for ( String strBlue : inputBlue ) {
    mapBlue . put ( strBlue , mapBlue . getOrDefault ( strBlue , 0 ) + 1 ) ;
  }
  HashMap < String , Integer > mapRed = new HashMap < String , Integer > ( ) ;
  for ( String strRed : inputRed ) {
    mapRed . put ( strRed , mapRed . getOrDefault ( strRed , 0 ) + 1 ) ;
  }
  for ( String BlueKey : mapBlue . keySet ( ) ) {
    if ( mapRed . keySet ( ) . contains ( BlueKey ) ) {
      mapBlue . put ( BlueKey , mapBlue . getOrDefault ( BlueKey , 0 ) - mapRed . getOrDefault ( BlueKey , 0 ) ) ;
    }
  }
  if ( Collections . max ( mapBlue . values ( ) ) < 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Collections . max ( mapBlue . values ( ) ) ) ;
  }
  return mapRed . values ( ) ;
}
