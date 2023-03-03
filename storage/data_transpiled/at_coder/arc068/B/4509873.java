public static int n = Integer . parseInt ( input ) {
  List < String > alist = Lists . newArrayList ( ) ;
  alist . add ( Integer . parseInt ( input ) ) ;
  HashMap < String , Integer > adic = new HashMap < String , Integer > ( ) ;
  for ( String a : alist ) {
    if ( adic . containsKey ( a ) ) {
      adic . put ( a , 1 ) ;
    }
    else {
      adic . put ( a , 1 ) ;
    }
  }
  int res = adic . values ( ) . length ;
  System . out . println ( n - res - res % 2 ) ;
  return res ;
}
