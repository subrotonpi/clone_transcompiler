def import java.io
from java.io import StringIO
from java.util import Scanner , StringScanner
class Main ( Scanner ) :
    def run ( self ) :
        sc = FastScanner ( )
        cs = sc.next ( ).splitlines ( )
        self.solve ( )
    def solve ( self ) :
        j = 0
        for j in range ( len ( self ) - 1 ) :
            if self.cs [ j ] == self.cs [ j + 1 ] :
                print ( ( j + 1 , self.cs [ j + 2 ] ) )
                return
            elif j < len ( self.cs ) - 2 and self.cs [ j ] == self.cs [ j + 2 ] :
                print ( ( j + 1 , self.cs [ j + 3 ] ) )
                return
        print ( "-1 -1" )
    class FastScanner ( Scanner ) :
        def readline ( self ) :
            while not self.readline or not self.readline :
                try :
                    self.readline ( )
                except EOFError :
                    pass
            return
        def __next__ ( self ) :
            while self.readline or not self.readline :
                try :
                    self.readline ( )
                except EOFError :
                    pass
            return
        def __next__ ( self ) :
            while self.readline :
                try :
                    self.readline ( )
                except EOFError :
                    pass
            return
        def __next__ ( self ) :
            while self.readline :
                try :
                    self.readline ( )
                except EOFError :
                    pass
            return
