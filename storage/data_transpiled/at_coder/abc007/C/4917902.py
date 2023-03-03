def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        R , C , sy , sx , gy , gx = sc.read ( )
        c = [ ]
        ans = 0
        for S in sc.split ( ) :
            for i in range ( C ) :
                c.append ( S [ i ] )
        flag = [ ]
        queue = deque ( )
        start = [ sy , sx , 0 ]
        queue.append ( start )
        dx = [ 1 , - 1 , 0 , 0 ]
        dy = [ 0 , 0 , 1 , - 1 ]
        loop : while not queue.empty ( ) :
            temp = queue.popleft ( )
            y , x , depth = temp
            for i in range ( 4 ) :
                if flag [ y + dy [ i ] - 1 ] [ x + dx [ i ] - 1 ] == 0 and c [ y + dy [ i ] - 1 ] [ x + dx [ i ] - 1 ] == '.' :
                    flag [ y + dy [ i ] - 1 ] [ x + dx [ i ] - 1 ] = 1
                    queue_add = [ y + dy [ i ] , x + dx [ i ] , depth + 1 ]
                    queue.append ( queue_add )
                if ( y + dy [ i ] == gy and x + dx [ i ] == gx ) :
                    ans = depth + 1
                    break loop
        print ( ans )
