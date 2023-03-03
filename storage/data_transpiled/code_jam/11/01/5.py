def import import _io
import os
import sys
class BotTrust ( object ) :
    def __init__ ( self ) :
        self.file = 'A-large.in'
        f = open ( file , 'r' )
        f = open ( file + '.out' , 'w' )
        import math
        T = int ( f.readline ( ) )
        for casenr in range ( 1 , T + 1 ) :
            line = f.readline ( ).split ( )
            N = int ( line [ 0 ] )
            time = 0
            opos , otime = 1 , 0
            bpos , btime = 1 , 0
            for robot in line [ 0 : N ] :
                despos = int ( robot )
                if robot == 'O' :
                    otime += abs ( opos - despos )
                    opos = despos
                    if otime < time :
                        otime = time
                    otime += 1
                    time = otime
                else :
                    btime += abs ( bpos - despos )
                    bpos = despos
                    if btime < time :
                        btime = time
                    btime += 1
                    time = btime
            print ( 'Case #%d: %d' % ( casenr , time ) , file = f )
            f.flush ( )
        f.close ( )
