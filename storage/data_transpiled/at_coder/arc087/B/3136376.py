def import _main
class Main ( object ) :
    def __init__ ( self , target ) :
        sc = _main ( )
        s = sc.next ( )
        x = sc.__next__ ( )
        y = sc.__next__ ( )
        sc.close ( )
        h = [ ]
        w = [ ]
        pc = 'F'
        cont = 0
        dir = True
        for i in s :
            if i == 'F' :
                if pc == 'F' :
                    cont += 1
                else :
                    if cont % 2 :
                        dir = not dir
                        cont = 1
                        pc = 'F'
            else :
                if pc == 'F' :
                    if dir :
                        w.append ( cont )
                    else :
                        h.append ( cont )
                    cont = 1
                    pc = 'T'
                else :
                    cont += 1
        if pc == 'F' :
            if dir :
                w.append ( cont )
            else :
                h.append ( cont )
        if i == 'F' :
            x -= int ( w.pop ( ) )
        if can_reach ( abs ( x ) , w ) and can_reach ( abs ( y ) , h ) :
            print ( 'Yes' )
        else :
            print ( 'No' )
    def can_reach ( len , move ) :
        sum = 0
        for one_move in move :
            sum += one_move
        if ( ( sum - len ) % 2 != 0 ) or sum < len :
            return False
        target = ( sum - len ) // 2
        dp = [ [ True if j == 0 else False for j in range ( len ( move ) + 1 ) ] for i in range ( len ( move ) + 1 ) ]
        for i in range ( len ( move ) + 1 ) :
            for j in range ( target + 1 ) :
                dp [ i ] [ j ] = True if j == 0 else False
        for i in range ( len ( move ) ) :
            dp [ i ] [ j ] = False
        return dp [ len ( move ) ] [ target ]
Note :./ _ main.py.uses.unsafe.with - Xlint