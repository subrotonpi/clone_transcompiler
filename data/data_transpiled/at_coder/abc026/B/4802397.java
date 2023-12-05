static final double PI = Double . parseDouble ( input ) ;
int n = input . nextInt ( ) ;
ArrayList < Integer > r = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) r . add ( Integer . parseInt ( input . next ( ) ) * 2 ) ;
int red = r . get ( 0 ) ;
int white = r . get ( 1 ) ;
System . out . println ( ( sum ( red ) - sum ( white ) ) * Math . PI ) ;
}
