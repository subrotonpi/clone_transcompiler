def import time_to_int
class B ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        for id in range ( 1 , N + 1 ) :
            T = sc.read ( )
            NA = sc.read ( )
            NB = sc.read ( )
            waitA = [ ]
            waitB = [ ]
            As = ( [ ] , [ ] )
            Bs = ( [ ] , [ ] )
            for t in range ( 3000 ) :
                As.append ( [ ] )
                Bs.append ( [ ] )
            for i in range ( NA ) :
                t1 , t2 = time_to_int ( sc.read ( ) )
                As [ t1 ].append ( t2 + T )
            for i in range ( NB ) :
                t1 , t2 = time_to_int ( sc.read ( ) )
                Bs [ t1 ].append ( t2 + T )
            dA = dB = 0
            for t in range ( 2400 ) :
                for t2 in As [ t ] :
                    if t in waitA :
                        waitA [ t ] -= 1
                    else :
                        dA += 1
                    waitB [ t2 ] += 1
                for t2 in Bs [ t ] :
                    if t in waitB :
                        waitB [ t ] -= 1
                    else :
                        dB += 1
                    waitA [ t2 ] += 1
                if t in waitA :
                    waitA [ t + 1 ] += waitA [ t ]
                if t in waitB :
                    waitB [ t + 1 ] += waitB [ t ]
            print ( "Case #%d: %d %d %d" % ( id , dA , dB ) )
    def time_to_int ( str ) :
        words = str.split ( ":" )
        return int ( words [ 0 ] ) * 60 + int ( words [ 1 ] )
