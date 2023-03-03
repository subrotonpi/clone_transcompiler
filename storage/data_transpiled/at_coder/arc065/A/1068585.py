def import import _readline
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _readline ( )
        self.s = self.s.decode ( 'utf-8' )
        self.eraser = _readline ( )
        self.erase = _readline ( )
        self.dreamer = _readline ( )
        self.dream = _readline ( )
        print ( 'NO' if self.s else 'YES' )
