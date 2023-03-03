def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.recv_number ( )
        M = sc.recv_number ( )
        x = sc.recv_number ( )
        y = sc.recv_number ( )
        as = [ ]
        bs = [ ]
        for i in range ( N ) :
            as.append ( sc.recv_number ( ) )
        for i in range ( M ) :
            bs.append ( sc.recv_number ( ) )
        count = 0
        i = 0
        while True :
            if i >= len ( as ) :
                break
            index = bisect.bisect_left ( bs , as [ i ] + x )
            index = ( index if index >= 0 else ~ index )
            if index >= len ( bs ) :
                break
            i = bisect.bisect_right ( as , bs [ index ] + y )
            i = ( i if i >= 0 else ~ i )
            count += 1
        print ( count )
