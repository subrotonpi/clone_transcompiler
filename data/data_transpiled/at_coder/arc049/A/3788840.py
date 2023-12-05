def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = sys.stdin.read ( )
            self.s = [ ]
            A , B , C , D = [ s [ i ] for i in range ( len ( S ) ) ]
            ans = ""
            for i in range ( len ( S ) ) :
                s.append ( S [ i ] )
            for i in range ( len ( S ) ) :
                if S [ i ] in [ A , B , C , D ] :
                    ans += " \" + s [ i ]
                else :
                    ans += s [ i ]
            if D == len ( S ) :
                ans += " \"
            print ( ans )
    return Main
