def _import ( ) : return
import sys
class Main ( ) :
    def __init__ ( self ) :
        self.readline = sys.stdin.readline
    def next ( self ) :
        while not self.readline or not self.readline.strip ( ) :
            try :
                self.readline.decode ( )
            except UnicodeDecodeError :
                pass
        return self.readline.decode ( )
    def randint ( self ) :
        return int ( self.readline.decode ( ) )
    def long ( self ) :
        return long ( self.readline.decode ( ) )
    def uniform ( self ) :
        return float ( self.readline.decode ( ) )
    def readline ( self ) :
        data = ''
        try :
            data = sys.stdin.readline ( )
        except EOFError :
            pass
        return data
    def main ( ) :
        reader = FastReader ( )
        n = reader.__next__ ( )
        array = [ ]
        value = [ ]
        index = [ ]
        adder = [ ]
        for i in range ( n ) :
            array.append ( reader.__next__ ( ) )
            if array [ i ] > 0 :
                value.append ( array [ i ] )
                index.append ( long ( i ) )
        one = 1
        array.append ( ( one << 20 ) - 1 )
        value.append ( array [ n ] )
        index.append ( long ( n ) )
        ans = 0
        count = 0
        for i in range ( 0 , n ) :
            if array [ i ] == 0 :
                count += 1
            else :
                ans += ( ( count + 1 ) * count ) / 2
                adder.append ( count )
                count = 0
    print ( ans )
