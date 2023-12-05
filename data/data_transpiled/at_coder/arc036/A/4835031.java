static int n , int k , int ... t = map ( Integer . valueOf ( 0 ) , k ) ;
return ( ( Arrays . stream ( t ) . skip ( 3 ) . limit ( n ) . filter ( i -> sum ( t [ i - 3 : i ] ) < k ) ) . count ( ) ) ;
}
