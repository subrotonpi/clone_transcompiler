def import _readline
import readline
import readline
import math
import text
class a :
    def __init__ ( self , l , w ) :
        self.l = l
        self.w = w
    def __lt__ ( self , o ) :
        return self.w - o.w
    def readline ( ) :
        sc = readline.get_readline ( )
        T = sc.readline ( ).split ( ) [ 0 ]
        for c in range ( 1 , T + 1 ) :
            x , s , r , t , n = [ ( x , s , r , t ) for x in sc.readline ( ).split ( ) ]
            ws = [ ]
            sum = 0
            for b , e , w in sc.readline ( ).split ( ) :
                ws.append ( ( e - b , w ) )
                sum += e - b
            ws.append ( ( x - sum , 0 ) )
            ws.sort ( )
            time = 0
            remaining_running = t
            for i in range ( 0 , n ) :
                w = ws [ i ]
                if remaining_running > 0 :
                    tt = w.l / ( w.w + r )
                    if tt < remaining_running :
                        remaining_running -= tt
                        time += tt
                    else :
                        time += remaining_running
                        time += ( w.l - ( w.w + r ) * remaining_running ) / ( w.w + s )
                        remaining_running = 0
                else :
                    time += w.l / ( w.w + s )
            print ( 'Case #%d: %.6f%%' % ( c , time ) )
