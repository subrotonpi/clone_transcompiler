@ VisibleForTesting static void from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  String name = input . nextLine ( ) ;
  String kit = input . nextLine ( ) ;
  Counter < String > nameCounter = new Counter < String > ( name ) ;
  Counter < String > kitCounter = new Counter < String > ( kit ) ;
  for ( String key : nameCounter . keySet ( ) ) {
    if ( kitCounter . getCount ( key ) == 0 ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  int ans = 0 ;
  for ( Map . Entry < String , Integer > entry : nameCounter . entrySet ( ) ) {
    int d = kitCounter . getCount ( entry . getKey ( ) ) ;
    ans = Math . max ( ans , ( d + entry . getValue ( ) - 1 ) / d ) ;
  }
  System . out . println ( ans ) ;
}
