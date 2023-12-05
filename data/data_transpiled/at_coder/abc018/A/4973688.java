[ 3 ] ;
nums = new int [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) nums [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int num : nums ) System . out . println ( new ArrayList < > ( nums ) . indexOf ( num ) + 1 ) ;
return nums ;
}
