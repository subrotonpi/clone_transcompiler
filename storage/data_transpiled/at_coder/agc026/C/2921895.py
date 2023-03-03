def import _main
class Pair ( object ) :
    first = None
    second = None
    def __init__ ( self , f , s ) :
        self.first = f
        self.second = s
    def __eq__ ( self , other ) :
        if not isinstance ( other , tuple ) :
            return False
        pn = other
        return pn [ 0 ] == first and pn [ 1 ] == second
    def __hash__ ( self ) :
        return self.first + self.second
class Main :
    def main ( self ) :
        with open ( self.path ) as f :
            ans = 0
            n , s = f.readline ( ).split ( )
            aa , bb = None , None
            map = { }
            for i in range ( 1 << n ) :
                a = [ ]
                b = [ ]
                for j in range ( n ) :
                    if ( i >> j ) % 2 == 1 :
                        a.append ( s [ j ] )
                    else :
                        b.append ( s [ j ] )
                aa = ''.join ( a )
                bb = ''.join ( b )
                if ( aa , bb ) in map :
                    map [ ( aa , bb ) ] = map [ ( aa , bb ) ] + 1
                else :
                    map [ ( aa , bb ) ] = 1
            for i in range ( 1 << n ) :
                a = [ ]
                b = [ ]
                for j in range ( n ) :
                    if ( i >> j ) % 2 == 1 :
                        a.append ( s [ n * 2 - 1 - j ] )
                    else :
                        b.append ( s [ n * 2 - 1 - j ] )
                aa = ''.join ( a )
                bb = ''.join ( b )
                if ( aa , bb ) in map :
                    ans += map [ ( aa , bb ) ]
            print ( ans )
    Note :./ Main._ uses.py.unsafe.operations.Note : Recompile.with - Xlint : classmethod ( lambda details : Main ( ) )
