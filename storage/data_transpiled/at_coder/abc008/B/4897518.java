static final long serialVersionUID = 1L ;
int n = Integer . parseInt ( input ) ;
ArrayList < String > d = new ArrayList < String > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  String a = String . valueOf ( input ) ;
  d . add ( a ) ;
}
long d1 = new Long ( d ) ;
System . out . println ( d1 . toString ( ) . length ( ) ) ;
return d1 ;
}
