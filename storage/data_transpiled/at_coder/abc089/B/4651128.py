def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.argv )
        i = False
        j = False
        k = False
        s = [ ]
        for l in sys.argv [ 1 : ] :
            s.append ( l )
        for l in s :
            if l == "P" :
                i = True
            elif l == "W" :
                j = True
            elif l == "G" :
                k = True
            else :
                i = False
                j = False
                k = False
                break
        if i and j and k :
            print ( "Three" )
        elif not i and not j and not k :
            print ( "Four" )
