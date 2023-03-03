def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , m , ans = sc.regs [ 0 ] , sc.regs [ 1 ] , sc.regs [ 2 ]
        a , b = [ ] , [ ]
        for i in range ( m ) :
            a.append ( sc.regs [ i ] - 1 )
            b.append ( sc.regs [ i ] - 1 )
        for x in range ( m ) :
            bl = [ [ ] for i in range ( n ) if i != x ]
            for k in range ( n ) :
                for from_i in range ( from_i , to_i + 1 ) :
                    if bl [ min ( k , from_i ) ] [ max ( k , from_i ) ] and bl [ min ( k , to_i ) ] [ max ( k , to_i ) ] :
                        bl [ from_i ] [ to_i ] = True
                flag = True
                for from_i in range ( n ) :
                    for to_i in range ( from_i + 1 , to_i + 1 ) :
                        if not bl [ from_i ] [ to_i ] :
                            flag = False
                    if not flag :
                        ans += 1
        print ( ans )
