def import _sys
class A ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        t = sc.readline ( ).strip ( )
        for i in range ( t ) :
            print ( "Case #%d: %d\n" % ( i + 1 , self.exec ( ) ) )
    def exec ( ) :
        n = len ( sys.stdin )
        ri = [ ]
        bi = [ ]
        for i in range ( n ) :
            ri.append ( sc.readline ( ).lower ( ) == 'O' )
            bi.append ( sc.readline ( ).strip ( ) )
        return _sys.exec_loop ( )
    def calc ( ri , bi ) :
        pos = [ 1 , 1 ]
        instr = 0
        time = 0
        while True :
            if instr >= len ( ri ) :
                break
            time += 1
            next_location_a , next_location_b = - 1 , - 1
            for i in range ( instr ) :
                if ri [ i ] :
                    next_location_a = bi [ i ]
                    break
            for i in range ( instr ) :
                if not ri [ i ] :
                    next_location_b = bi [ i ]
                    break
            if next_location_a > - 1 and pos [ 0 ] != next_location_a :
                if pos [ 0 ] < next_location_a :
                    pos [ 0 ] += 1
                else :
                    pos [ 0 ] -= 1
            else :
                next_location_a = - 1
            if next_location_b > - 1 and pos [ 1 ] :
                if pos [ 1 ] < next_location_b :
                    pos [ 1 ] += 1
                else :
                    pos [ 1 ] -= 1
            else :
                next_location_b = - 1
            if pos [ ri [ instr ] : 1 ] == bi [ instr ] :
                press_it = False
                if ri [ instr ] and next_location_a == - 1 :
                    press_it = True
                if not ri [ instr ] and next_location_b == - 1 :
                    press_it = True
                if press_it :
                    instr += 1
        return time
    return calc ( )
