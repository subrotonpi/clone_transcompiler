def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = ''
        self.n = int ( self.s )
        for line in self.s.split ( ) :
            left = int ( line [ 0 ] ) - 1
            right = int ( line [ 1 ] ) - 1
            self.s = '%s%s%s' % ( self.s [ : left ] , [ s [ left : right + 1 ] ].reverse ( ) , s [ right + 1 : len ( s ) ] )
        print ( self.s )
