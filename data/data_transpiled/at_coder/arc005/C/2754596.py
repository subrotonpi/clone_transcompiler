def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        h , w = sc.split ( )
        sx = sy = gx = gy = - 1
        grd = [ ]
        for i , line in enumerate ( sc ) :
            for j , c in enumerate ( line ) :
                if c == 's' :
                    sy = i
                    sx = j
                elif c == 'g' :
                    gy = i
                    gx = j
                elif c == '#' :
                    grd.append ( [ True , False ] )
    memo = [ [ int ( 1e9 ) for i in range ( h ) ] for j in range ( w ) ]
    memo [ sy ] [ sx ] = 0
    q = deque ( maxlen = sy * w + sx )
    while len ( q ) != 0 :
        tmp = q.popleft ( )
        y = tmp // w
        x = tmp % w
        d = [ 0 , 1 , 0 , - 1 ]
        for i in range ( 4 ) :
            ny = y + d [ i ^ 1 ]
            nx = x + d [ i ]
            if 0 <= nx < w and 0 <= ny < h :
                if grd [ ny ] [ nx ] :
                    if memo [ ny ] [ nx ] > memo [ y ] [ x ] + 1 :
                        memo [ ny ] [ nx ] = memo [ y ] [ x ] + 1
                        q.append ( ny * w + nx )
                else :
                    if memo [ ny ] [ nx ] > memo [ y ] [ x ] :
                        memo [ ny ] [ nx ] = memo [ y ] [ x ]
                        q.append ( ny * w + nx )
    print ( ( memo [ gy ] [ gx ] <= 2 ) )
