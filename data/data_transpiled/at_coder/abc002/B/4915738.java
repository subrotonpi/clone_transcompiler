public static String w ( ) {
  String w = input ( ) ;
  String [ ] banArray = {
    'a' , 'i' , 'u' , 'e' , 'o' }
    ;
    for ( String ban : banArray ) {
      w = w . replace ( ban , "" ) ;
    }
    return w ;
  }
  