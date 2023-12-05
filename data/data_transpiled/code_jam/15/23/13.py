def import import sys , os , sys , subprocess , sys , time
class HikingDeer ( object ) :
    def __init__ ( self ) :
        self.c = 0
    def __call__ ( self , file , * args ) :
        f = open ( 'in.py' , 'r' )
        self.f = open ( file , 'w' )
        t = int ( f.readline ( ) )
        for c in range ( 1 , t + 1 ) :
            f.write ( 'Case #%d: ' % c )
            line = f.readline ( )
            n = int ( line )
            hikers = [ ]
            index = 0
            for line in f :
                fields = line.split ( )
                for j in range ( int ( fields [ 1 ] ) ) :
                    hikers.append ( [ long ( fields [ 0 ] ) , long ( fields [ 2 ] ) + j ] )
                    index += 1
            print ( hikers [ 0 ] , hikers [ 0 ] )
            print ( hikers [ 1 ] , hikers [ 1 ] )
            if hikers [ 1 ] == 0 :
                f.write ( 0 , '\n' )
                continue
            print ( ( 720 - hikers [ 0 ] ) * hikers [ 0 ] )
            print ( )
            if ( 720 - hikers [ 0 ] ) * hikers [ 0 ] <= ( 360 - hikers [ 1 ] ) * hikers [ 1 ] :
                f.write ( 1 , '\n' )
                continue
            if ( 720 - hikers [ 1 ] ) * hikers [ 0 ] <= ( 360 - hikers [ 0 ] ) * hikers [ 1 ] :
                f.write ( 1 , '\n' )
                continue
            f.write ( 0 , '\n' )
        f.close ( )
