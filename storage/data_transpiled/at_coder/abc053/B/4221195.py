def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def __str__ ( self ) :
        return self.sc.text
    def __repr__ ( self ) :
        return "%s %s" % ( self.sc.text , self.sc.text )
