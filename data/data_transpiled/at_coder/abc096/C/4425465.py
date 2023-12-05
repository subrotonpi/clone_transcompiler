def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = [ ]
    def has_neighbor ( self , h , w ) :
        return ( h != 0 and "#" in self.s [ h - 1 ] [ w ] ) or ( h != len ( self.s ) - 1 and "#" in self.s [ h + 1 ] [ w ] ) or ( w != 0 and "#" in self.s [ h ] [ w - 1 ] ) or ( w != len ( self.s [ h ] ) - 1 and "#" in self.s [ h ] [ w + 1 ] )
    def main ( self ) :
        sc = _sys.stdin
        h , w = sc.readline ( ).split ( "" )
        s = [ ]
        for line in sc.readlines ( ) :
            s.append ( line.split ( "" ) )
        for i in range ( h ) :
            for j in range ( w ) :
                if "." in s [ i ] [ j ] :
                    continue
                if not has_neighbor ( i , j ) :
                    self.print ( "No" )
                    return
        self.print ( "Yes" )
