def import readline
import sys
from io import StringIO
from readline.misc import readline
from io import BytesIO
import readline
from readline.misc import readline
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.board = [ ]
    def readline ( self ) :
        sc = readline.get_reader ( )
        n = sc.n
        self.board = [ ]
        for i in range ( n ) :
            self.board.append ( sc.next ( ).decode ( 'utf-8' ) )
        self.solve ( )
    def solve ( self ) :
        count = 0
        for a in range ( n ) :
            b = 0
            flag = True
            b :
            for i in range ( n ) :
                for j in range ( n ) :
                    if self.board [ ( i + a ) % n ] [ ( j + b ) % n ] != self.board [ ( j + a ) % n ] [ ( i + b ) % n ] :
                        flag = False
                        break
            if flag :
                count += 1
        print ( count * n )
    class Fastreadline ( object ) :
        def __init__ ( self ) :
            self.board = [ ]
        def readline ( self ) :
            while not self.board or not self.board :
                try :
                    self.board.append ( readline ( self ) )
                except EOFError :
                    pass
            return self.board [ 0 ]
        def randint ( self ) :
            return int ( self.board [ 0 ] )
        def long ( self ) :
            return long ( self.board [ 0 ] )
        def double ( self ) :
            return double ( self.board [ 0 ] )
        def readline ( self ) :
            data = ''
            try :
                data = readline.decode ( 'utf-8' )
            except EOFError :
                pass
            return data
