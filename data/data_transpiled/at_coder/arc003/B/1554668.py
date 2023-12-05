def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.arrayList = [ ]
    def input ( self ) :
        with open ( self.filename , 'r' ) as f :
            n = len ( f.read ( ) )
            for i in range ( n ) :
                s = f.read ( )
                s.reverse ( )
                self.arrayList.append ( s )
    def main ( self , args ) :
        self.input ( )
        self.arrayList.sort ( )
        for i in range ( n ) :
            s = f.read ( )
            s.reverse ( )
            print ( s )
