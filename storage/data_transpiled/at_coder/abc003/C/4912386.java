public static int YourRate = 0 ;
int N = ( int ) input . nextInt ( ) ;
int K = ( int ) input . nextInt ( ) ;
List < Integer > videoRate = Lists . newArrayList ( ) ;
for ( int i = K - 1 ;
i >= 0 ;
i -- ) {
  YourRate = ( YourRate + videoRate . get ( i ) ) / 2 ;
}
System . out . println ( YourRate ) ;
return K ;
}
