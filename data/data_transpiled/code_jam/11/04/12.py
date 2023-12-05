def import import os , sys , stdin , stdout , stderr , d , dpc , dpa , signal , signal , * args , ** kwargs ) :
    s = stdin.read ( )
    stdout.write ( 'D.out\n' )
    dpc = [ 0 ] * 1024
    dpa = [ 0 ] * 1024
    for i in range ( 3 , 1000 + 1 ) :
        dpc [ i ] = 1
        for j in range ( 1 , i ) :
            dpc [ i ] += ( dpc [ j ] + dpa [ i - j ] ) / i
        dpc [ i ] *= ( float ( i ) ) / ( i - 1 )
        dpa [ i ] = dpc [ i ] - 1
    T = s.getstate ( )
    arr = [ ]
    mark = [ False ] * 1024
    for tc in range ( 1 , T + 1 ) :
        stdout.write ( 'Case #%d: ' % tc )
        N = s.getstate ( )
        for i in range ( 1 , N + 1 ) :
            arr.append ( s.getstate ( ) )
        answer = 0
        mark [ : ] = [ False ] * 1024
        for i in range ( 1 , N + 1 ) :
            cycle_length = 0
            cur = i
            while not mark [ cur ] :
                mark [ cur ] = True
                cur = arr [ cur ]
                cycle_length += 1
            answer += dpc [ cycle_length ]
        stdout.write ( answer )
    stdout.close ( )
    print ( dpc [ 1000 ] )
