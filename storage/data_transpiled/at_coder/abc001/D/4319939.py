def main ( ) :
    import time
    class Main ( object ) :
        def run ( self ) :
            with open ( '/proc/time' , 'r' ) as sc :
                range = [ 0 ] * ( 60 * 24 ) + [ 2 ]
                m = sc.read ( )
                for i in range ( m ) :
                    sp = sc.read ( ).split ( '-' )
                    s , e = time_to_int_b ( sp [ 0 ] ) , time_to_int_a ( sp [ 1 ] )
                    range [ s ] += 1
                    range [ e + 1 ] -= 1
                for i in range ( 1 , ( 60 * 24 ) + 1 ) :
                    range [ i ] += range [ i - 1 ]
                for i in range ( 0 , ( 60 * 24 ) + 1 ) :
                    if range [ i ] > 0 :
                        s = i
                        e = i
                        for i in range ( 60 , 24 ) + range ( 0 , 60 ) + range ( 0 , 60 ) + range ( 0 , 60 ) + range ( 0 , 60 ) + range ( 0 , 60 )
                        print ( int_to_time ( s ) , "-" , int_to_time ( e ) )
        time_to_int_b ( time )
        h , m = [ int ( x ) for x in time [ : 2 ] ]
        m = ( m // 5 ) * 5
        return ( h * 60 + m )
    time_to_int_a ( time )
    h , m = [ int ( x ) for x in time [ : 2 ] ]
    m = ( m + 4 ) // 5 * 5
    return ( h * 60 + m )
