public static void main ( String [ ] atco ) {
  String [ ] atco = input . split ( " " ) ;
  HashMap < String , Integer > atcoDct = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    atcoDct . put ( atco [ i ] , i ) ;
  }
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < int [ ] > ans = new ArrayList < int [ ] > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String num = input . nextLine ( ) ;
    List < String > numlst = new LinkedList < String > ( ) ;
    for ( int j = 0 ;
    j < num . length ( ) ;
    j ++ ) {
      numlst . add ( num . charAt ( j ) ) ;
    }
    StringBuffer num10 = new StringBuffer ( ) ;
    for ( int j = 0 ;
    j < numlst . size ( ) ;
    j ++ ) {
      num10 . append ( atcoDct . get ( numlst . get ( j ) ) . toString ( ) ) ;
    }
    ans . add ( new int [ ] {
      Integer . parseInt ( num10 . toString ( ) ) , num }
      ) ;
    }
    Collections . sort ( ans ) ;
    for ( int k = 0 ;
    k < ans . size ( ) ;
    k ++ ) {
      System . out . println ( ans . get ( k ) [ 1 ] ) ;
    }
  }
  