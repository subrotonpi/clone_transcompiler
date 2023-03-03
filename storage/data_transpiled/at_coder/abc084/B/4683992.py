def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.first = sys.maxint
        self.second = sys.maxint
        self.str = sys.stdin.read ( )
        if len ( self.str ) != ( self.first + self.second + 1 ) :
            print ( "No" )
            return
        for i , c in enumerate ( self.str ) :
            if i == self.first :
                if c != "-" :
                    print ( "No" )
                    return
            else :
                if c == "-" :
                    print ( "No" )
                    return
        print ( "Yes" )
