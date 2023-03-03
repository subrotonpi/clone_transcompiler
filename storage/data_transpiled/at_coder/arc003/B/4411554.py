def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = int ( self.sc.readline ( ) )
        self.list = [ ]
        for i in range ( self.N ) :
            s = self.sc.readline ( )
            s2 = s.decode ( 'utf-8' )
            s3 = s2.reverse ( ).decode ( 'utf-8' )
            self.list.append ( s3 )
        self.list.sort ( )
        for i in range ( self.N ) :
            s2 = s.decode ( 'utf-8' )
            s3 = s2.reverse ( ).decode ( 'utf-8' )
            print ( s3 )
