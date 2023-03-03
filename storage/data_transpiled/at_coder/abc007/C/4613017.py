def import _main
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        with open ( sys.argv [ 1 ] , 'r' ) as sc :
            R , C , sy , sx , gy , gx = [ ] , [ ] , [ ] , [ ] , [ ]
            c = [ ]
            for line in sc.readlines ( ) :
                c.append ( line.split ( '' ) )
            points = Queue.Queue ( )
            points.put ( ( sy , sx , 0 ) )
            c [ sy , sx ] = '!'
            out.write ( _bfs ( c , points , ( gy , gx , - 1 ) ) )
    def bfs ( cource , points , goal ) :
        point = points.get ( )
        count = point.count
        if point.x == goal.x and point.y == goal.y :
            return count
        move = [ [ - 1 , 0 ] , [ 1 , 0 ] , [ 0 , - 1 ] , [ 0 , 1 ] ]
        count += 1
        for i in range ( len ( move ) ) :
            next_point = ( point.y + move [ i ] [ 0 ] , point.x + move [ i ] [ 1 ] , count )
            if cource [ next_point.y ] [ next_point.x ] == '.' :
                cource [ next_point.y ] [ next_point.x ] = '!'
                points.put ( next_point )
        return _bfs ( cource , points , goal )
class Point ( object ) :
    def __init__ ( self ) :
        self.y = y
        self.x = x
        self.count = count
