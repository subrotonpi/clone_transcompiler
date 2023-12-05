def _import ( ) : return int ( raw_input ( ) )
def _import ( ) : return float ( raw_input ( ) )
def _import ( ) : return int ( raw_input ( ) )
def _import ( ) : return int ( raw_input ( ) )
def _import ( ) : return int ( raw_input ( ) )
def _readline ( ) : return raw_input ( )
def _import ( ) :
    io = Kattio ( sys.stdin )
    zz = io.readline ( )
    for zzz in range ( zz ) :
        num_buildings = io.readline ( )
        needed_ways = io.readline ( )
        length = _length ( needed_ways - 1 )
        if length > num_buildings - 2 :
            io.write ( 'Case #%d: IMPOSSIBLE\n' % ( zzz + 1 ) )
            continue
        mat = [ [ 1 ] * num_buildings for i in range ( 1 , len ( mat ) ) ]
        ch_length = length
        for i in range ( len ( mat ) - 1 - ch_length , 0 ) :
            for e in range ( len ( mat ) - ch_length , 0 ) :
                mat [ i ] [ e ] = 1
            ch_length -= 1
        needed_ways -= 1
        b = len ( mat ) - 1 - length
        while needed_ways > 0 :
            if needed_ways % 2 == 0 :
                mat [ b ] [ - 1 ] = 0
            needed_ways /= 2
            b += 1
        io.write ( 'Case #%d: POSSIBLE\n' % ( zzz + 1 ) )
        for i in range ( len ( mat ) ) :
            for e in range ( len ( mat ) ) :
                io.write ( mat [ i ] [ e ] )
            io.write ( '\n' )
    io.flush ( )
    io.close ( )
