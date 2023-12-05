def import import sys , StringIO , cStringIO
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        import cStringIO
        self.stream = cStringIO.StringIO ( )
        self.stream.seek ( 0 )
        self.stream.write ( 200001 )
    def read ( self ) :
        return self.stream.read ( self.stream.tell ( ) )
    def write ( self , data ) :
        return self.stream.read ( self.stream.tell ( ) )
    def write ( self , data ) :
        return self.stream.read ( self.stream.tell ( ) )
    def write ( self , data ) :
        return self.stream.read ( self.stream.tell ( ) )
    def write ( self , data ) :
        return self.stream.read ( self.stream.tell ( ) )
    def write ( self , data ) :
        return self.stream.write ( data )
    def write ( self , data ) :
        return self.stream.read ( self.stream.tell ( ) )
    def write ( self , data ) :
        return self.stream.write ( data )
    def write ( self , data ) :
        return self.stream.write ( data )
