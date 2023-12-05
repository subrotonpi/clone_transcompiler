public static int n = Integer . parseInt ( input ) {
  HashMap < String , Integer > dic = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String tmp = input . next ( ) ;
    if ( dic . keySet ( ) . contains ( tmp ) ) {
      dic . put ( tmp , 1 ) ;
    }
    else {
      dic . put ( tmp , 1 ) ;
    }
  }
  for ( String name : dic . keySet ( ) ) {
    if ( dic . get ( name ) == Math . max ( dic . values ( ) , 0 ) ) {
      System . out . println ( name ) ;
      break ;
    }
  }
  return 0 ;
}
