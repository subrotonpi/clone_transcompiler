static void main ( String [ ] args ) {
  final Pattern r = Pattern . compile ( rPattern . matcher ( "(\\([a-z]*\\)|[a-z])" ) ) ;
  new Thread ( ) {
    @ Override public void run ( ) {
      Arrays . stream ( args ) . forEach ( x -> {
        int l = Integer . parseInt ( x ) ;
        int d = Integer . parseInt ( r . matcher ( x ) . replaceAll ( "" ) ) ;
        int n = Integer . parseInt ( r . matcher ( x ) . replaceAll ( "" ) ) ;
        String [ ] words = new String [ l ] ;
        for ( int i = 0 ;
        i < d ;
        i ++ ) words [ i ] = new String ( r . matcher ( x ) . replaceAll ( "" ) ) ;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          String q = readLine ( ) . trim ( ) ;
          List < String > list = new ArrayList < String > ( ) ;
          for ( String c : r . matcher ( q ) . split ( ) ) list . add ( c ) ;
          String [ ] w = words ;
          for ( String qq : list ) w = list . toArray ( new String [ list . size ( ) ] ) ;
          System . out . printf ( "Case #%d: %d\n" , i + 1 , w . length ) ;
        }
      }
      ) ;
    }
  }
  . start ( ) ;
}
