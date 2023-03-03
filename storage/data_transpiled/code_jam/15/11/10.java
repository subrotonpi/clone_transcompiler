static final String getStdoutOfOneLine ( ) {
  System . setProperty ( "line.separator" , " " ) ;
  System . setProperty ( "line.separator" , " " ) ;
  final Function < String , Integer > readInts = input -> {
    int [ ] a = Ints . fromStrings ( readLine ( ) . split ( " " ) ) ;
    return a . length ;
  }
  ;
  final Function < Integer , Integer > readInteger = input -> Integer . parseInt ( readLine ( ) ) ;
  for ( int noT : xrange ( 1 , readInteger . length ( ) + 1 ) ) {
    int n = readInteger . apply ( ) ;
    int [ ] a = readInts . apply ( n ) ;
    int ans1 = Integer . valueOf ( Math . max ( a [ 1 ] - y , 0 ) ) ;
    int mx = Integer . valueOf ( Math . max ( a [ 1 ] - y , 0 ) ) ;
    int ans2 = Integer . valueOf ( Math . min ( a [ 0 ] , mx ) ) ;
    System . out . println ( String . format ( "Case #%d: %s %s" , noT , ans1 , ans2 ) ) ;
  }
  return String . format ( "Case #%d: %s %s" , noT , ans1 , ans2 ) ;
}
