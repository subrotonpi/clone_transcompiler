def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = len ( sys.argv )
        start = 1
        end = 1
        max_dis = - 1
        for j in range ( 2 ) :
            start = end
            max_dis = - 1
            for i in range ( 1 , N + 1 ) :
                sys.stdout.write ( '? %d %d\n' % ( start , i ) )
                dist = sys.stdin.read ( )
                if dist > max_dis :
                    end = i
                    max_dis = dist
        self.out.write ( '! %d\n' % max_dis )
