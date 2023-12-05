@ Test public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] name = input . split ( " " ) ;
  String [ ] kit = input . split ( " " ) ;
  int ans = 0 ;
  for ( int nameI = 0 ;
  nameI < name . length ;
  nameI ++ ) {
    if ( ! kit [ nameI ] . equals ( name [ nameI ] ) ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  Map < String , Integer > kitCount = new HashMap < > ( kit ) ;
  for ( Map . Entry < String , Integer > entry : new LinkedHashMap < > ( name ) . entrySet ( ) ) {
    ans = Math . max ( ans , Math . ceil ( entry . getValue ( ) / kitCount . get ( entry . getKey ( ) ) ) ) ;
  }
  System . out . println ( ans ) ;
}
